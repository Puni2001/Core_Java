

#  SOLID Principles in Java – Explained with Code Examples



##  S — Single Responsibility Principle (SRP)

### Definition
A class should have **only one reason to change** — it should handle only one responsibility.

###  Real-Life Analogy:
A Journal app that both stores entries and saves them to disk mixes responsibilities. Saving logic should be separate.

### Bad Design:
```java
class Journal {
    void addEntry(String entry) {...}
    void saveToFile(String filename) {...} // storage logic — not its job
}
````

###  Good Design:

```java
class JournalSRP {
    void addEntry(String entry) {...}
    String getText() {...}
}

class PersistanceManager {
    void saveToFile(JournalSRP journal, String filename) {...}
}
```

---

##  O — Open/Closed Principle (OCP)

### Definition

Software should be **open for extension but closed for modification**.

###  Real-Life Analogy:

A payment processor should allow adding UPI/PayPal without editing existing logic.

### Bad Design:

```java
class PaymentProcessor {
    String pay(String type) {
        if (type.equals("UPI")) ...
        else if (type.equals("Credit")) ...
    }
}
```

###  Good Design:

```java
interface PaymentMethod {
    void pay();
}

class UpiPayment implements PaymentMethod { ... }
class CreditCardPayment implements PaymentMethod { ... }

class PaymentProcessorOCP {
    void processorPayment(PaymentMethod method) {
        method.pay();
    }
}
```

---

##  L — Liskov Substitution Principle (LSP)

### Definition

Subclasses should be usable in place of their parent class without breaking behavior.

###  Real-Life Analogy:

A `Penguin` shouldn't be forced to fly just because it's a `Bird`.

### Bad Design:

```java
class Bird {
    void fly() { ... }
}
class Penguin extends Bird {
    void fly() { throw new UnsupportedOperationException(); }
}
```

###  Good Design:

```java
interface BirdLSP { void eat(); }
interface FlyingBird extends BirdLSP { void fly(); }

class SparrowLSP implements FlyingBird { ... }
class PenguinLSP implements BirdLSP { ... }
```

---

##  I — Interface Segregation Principle (ISP)

### Definition

Clients should **not be forced to depend on interfaces they don't use**.

###  Real-Life Analogy:

A basic printer shouldn't need to implement scan/fax methods it doesn't support.

### Bad Design:

```java
interface Machine {
    void print();
    void scan();
    void fax();
}

class OldPrinter implements Machine {
    void scan() { throw new UnsupportedOperationException(); }
}
```

###  Good Design:

```java
interface Printer { void print(); }
interface Scanner { void scan(); }
interface Fax { void fax(); }

class BasicPrinter implements Printer { ... }
class AdvancedPrinter implements Printer, Scanner, Fax { ... }
```

---

##  D — Dependency Inversion Principle (DIP)

### Definition

* High-level modules should not depend on low-level modules.
* Both should depend on abstractions (interfaces).

###  Real-Life Analogy:

Your `Project` class shouldn't be tightly bound to `BackendDeveloper`.

### Bad Design:

```java
class Project {
    BackendDeveloper dev = new BackendDeveloper();
    void build() { dev.developBackend(); }
}
```

###  Good Design:

```java
interface Developer { void develop(); }

class Backenddeveloper implements Developer { ... }
class FrontendDeveoper implements Developer { ... }

class Project {
    Developer dev;
    Project(Developer dev) { this.dev = dev; }
    void build() { dev.develop(); }
}
```

---

##  Summary Table

| Principle | Goal                               | Violation Example                 | Fix                                      |
| --------- | ---------------------------------- | --------------------------------- | ---------------------------------------- |
| SRP       | One class = One reason to change   | Journal with both save & logic    | Use `JournalSRP` + `PersistenceManager`  |
| OCP       | Extend without modifying           | Big if/else in `PaymentProcessor` | Use `PaymentMethod` interface            |
| LSP       | Subtypes must be replaceable       | Penguin throwing in `fly()`       | Split into `FlyingBird`, `BirdLSP`       |
| ISP       | No unused method implementations   | `OldPrinter` implements `fax()`   | Use smaller interfaces: `Printer`, `Fax` |
| DIP       | Depend on abstraction, not details | `Project` uses `new BackendDev`   | Inject `Developer` via constructor       |

---
