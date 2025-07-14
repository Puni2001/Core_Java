---

## 📘 1. **What is Java?**

### ✅ Java:

Java is a **high-level**, **object-oriented**, **platform-independent** programming language.

---

### ✅ Key Components:

| Term                               | Description                                                       |
| ---------------------------------- | ----------------------------------------------------------------- |
| **JDK** (Java Development Kit)     | Contains tools to develop Java programs (compiler, debugger, JRE) |
| **JRE** (Java Runtime Environment) | Provides libraries and JVM to run Java applications               |
| **JVM** (Java Virtual Machine)     | Converts bytecode (.class files) to machine code and executes it  |

---

## ⚙️ 2. **Installing and Setting Up Java + IDE**

### ✅ Steps:

1. Download and install **JDK** from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://jdk.java.net/).
2. Set environment variable `JAVA_HOME`.
3. Install an IDE:

   * [IntelliJ IDEA](https://www.jetbrains.com/idea/)
   * [Eclipse IDE](https://www.eclipse.org/)

### ✅ Verify Installation:

```bash
java -version
javac -version
```

---

## 👋 3. **Hello World Program**

### ✅ Code:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### ✅ Output:

```
Hello, World!
```

---

## 🧾 4. **Java Syntax, BasicsSyntax.Variables, Data Types**

### ✅ Variable Declaration:

```java
int number = 10;
double pi = 3.14;
char grade = 'A';
String name = "John";
boolean isJavaFun = true;
```

### ✅ Primitive Data Types:

* `int`, `byte`, `short`, `long`
* `float`, `double`
* `char`
* `boolean`

### ✅ Example:

```java
public class DataTypesExample {
    public static void main(String[] args) {
        int age = 25;
        float temperature = 36.6f;
        char gender = 'M';
        boolean isStudent = false;

        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("Gender: " + gender);
        System.out.println("Is Student? " + isStudent);
    }
}
```

---

## 🔄 5. **Type Casting**

### ✅ Implicit (Widening)

```java
int x = 10;
double y = x;  // automatic casting: int to double
System.out.println(y); // Output: 10.0
```

### ✅ Explicit (Narrowing)

```java
double a = 9.7;
int b = (int) a;  // manual casting: double to int
System.out.println(b); // Output: 9
```

---

## ⌨️ 6. **Input/Output (Scanner)**

### ✅ Import Scanner:

```java
import java.util.Scanner;
```

### ✅ Example: User Input

```java
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
```

### ✅ Output:

```
Enter your name: Alice
Enter your age: 22
Hello, Alice! You are 22 years old.
```

---


---

## 🧠 2. **Control Flow Statements in Java**

Control flow determines **which blocks of code execute based on conditions or loops**.

---

### ✅ 1. **if-else Statement**

#### 📝 Syntax:

```java
if (condition) {
    // executes if true
} else {
    // executes if false
}
```

#### 🧪 Example:

```java
public class IfElseExample {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
```

---

### ✅ 2. **switch Statement**

Used for **multiple condition checks** on a single variable.

#### 📝 Syntax:

```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // default code
}
```

#### 🧪 Example:

```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }
    }
}
```

---

## 🔁 Loops

---

### ✅ 3. **for Loop**

Best when number of iterations is known.

#### 📝 Syntax:

```java
for (int i = 0; i < 5; i++) {
    // code
}
```

#### 🧪 Example:

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
```

---

### ✅ 4. **while Loop**

Runs as long as condition is true.

#### 🧪 Example:

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
```

---

### ✅ 5. **do-while Loop**

Executes **at least once**, even if condition is false.

#### 🧪 Example:

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 6;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5);
    }
}
```

### ✅ Output:

```
i = 6
```

---

## 🛑 6. **break & continue**

---

### ✅ `break`: Exits loop or switch early.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i);  // Prints 1, 2
}
```

---

### ✅ `continue`: Skips current iteration.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);  // Prints 1, 2, 4, 5
}
```

---

## ✅ Summary Table

| Statement  | Purpose                              |
| ---------- | ------------------------------------ |
| `if-else`  | Conditional branching                |
| `switch`   | Multiple conditions                  |
| `for`      | Fixed iterations                     |
| `while`    | Unknown iterations (condition-based) |
| `do-while` | Executes once, then checks           |
| `break`    | Exit loop/switch early               |
| `continue` | Skip current loop iteration          |

---

---

## 🔧 **Functions and Methods in Java**

In Java, **all functions are defined inside classes** and are called **methods**.

---

## 📘 1. **What is a Method?**

A **method** is a block of code that performs a specific task and can be **reused**.

### ✅ General Syntax:

```java
returnType methodName(parameter1, parameter2, ...) {
    // method body
    return value;
}
```

---

## 🧪 2. **Basic Method Example**

```java
public class MyClass {
    // Method definition
    static void sayHello() {
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        // Method call
        sayHello();
    }
}
```

### ✅ Output:

```
Hello, Java!
```

---

## 🎯 3. **Method with Parameters**

```java
public class Calculator {
    static void add(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
    }

    public static void main(String[] args) {
        add(10, 20); // calling method
    }
}
```

---

## 🔁 4. **Method with Return Value**

```java
public class MathUtil {
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("Square: " + result);
    }
}
```

---

## ♻️ 5. **Types of Methods**

| Type              | Description                                 |
| ----------------- | ------------------------------------------- |
| **Static**        | Belongs to the class, called without object |
| **Non-static**    | Needs object to be called                   |
| **Parameterized** | Takes input                                 |
| **Return-type**   | Returns a result                            |

---

### ✅ Static vs Non-static Example:

```java
public class Demo {

    // Static method
    static void greet() {
        System.out.println("Welcome!");
    }

    // Non-static method
    void showName(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        greet(); // static method call

        Demo obj = new Demo(); // object creation
        obj.showName("Alice"); // non-static method call
    }
}
```

---

## 🧱 6. **Method Overloading**

Same method name, different parameters.

```java
public class Overload {
    static void print(String text) {
        System.out.println("Text: " + text);
    }

    static void print(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        print("Java");
        print(100);
    }
}
```

---

## 🧠 Best Practices

* Method names should be **verbs** (e.g., `calculateSum`, `displayResult`)
* Keep methods **short and focused** on one task
* Use **camelCase** for method names

---

## ✅ Summary Table

| Concept         | Example                         |
| --------------- | ------------------------------- |
| Basic method    | `void greet()`                  |
| With parameters | `void add(int a, int b)`        |
| With return     | `int square(int x)`             |
| Static          | Called with class               |
| Non-static      | Called with object              |
| Overloading     | Same name, different parameters |

---


## ✅ Core OOP Principles

There are **four main pillars** of OOP:

---

### 1. **Encapsulation**

**Definition**:
Encapsulation is the concept of **wrapping data and methods** that operate on the data within one unit (class), and **restricting access** to some components using access modifiers (`private`, `public`, etc.).

**Example** (in Java-like syntax):

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

**Follow-up Questions**:

* Why should variables be private?
* How does encapsulation help in real projects?
* Can you implement encapsulation in Python?

---

### 2. **Abstraction**

**Definition**:
Abstraction means **hiding complex implementation details** and showing only the **essential features** of the object.

**Example**:

```java
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
```

**Follow-up Questions**:

* Difference between abstraction and encapsulation?
* How is abstraction achieved in Java/C#/Python?
* Interface vs Abstract Class?

---

### 3. **Inheritance**

**Definition**:
Inheritance is the mechanism where a new class (child) **inherits properties and behavior** from an existing class (parent).

**Example**:

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starting");
    }
}
```

**Follow-up Questions**:

* What types of inheritance exist (single, multiple, multilevel)?
* Can a child override a method?
* How do constructors behave during inheritance?

---

### 4. **Polymorphism**

**Definition**:
Polymorphism allows **one interface to be used for different data types or methods**. It can be:

* **Compile-time (method overloading)**
* **Runtime (method overriding)**

**Example**:

```java
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}
```

**Follow-up Questions**:

* Difference between overloading and overriding?
* Can constructors be overloaded?
* What is dynamic binding?

---

## 🎯 Quick Interview-Ready Summary:

> "OOP stands for Object-Oriented Programming, which organizes code using real-world objects. Its four main principles are **Encapsulation** (data hiding), **Abstraction** (hiding complexity), **Inheritance** (reusing code), and **Polymorphism** (method flexibility). These help write **modular, maintainable, and reusable** code."

---

Great! Here's a **complete and interview-focused guide to Object-Oriented Programming (OOP) in Java**, covering **all core concepts** with **examples and answers to common follow-up questions**.

---

## ✅ 1. **Encapsulation**

### 🔹 Definition:

Encapsulation is the process of **hiding internal details** of how an object works and **exposing only what’s necessary** via public methods.

### 🔹 Example in Java:

```java
class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
```

### 🔹 Follow-up Q\&A:

**Q: Why use private variables?**
A: To prevent direct modification of fields, which may break logic or security.

**Q: How does it improve code?**
A: It improves **modularity**, **security**, and **maintenance**. Only controlled access is allowed via getters/setters.

**Q: Can you make a class immutable using encapsulation?**
A: Yes, by declaring all fields `private`, not providing setters, and using `final` fields.

---

## ✅ 2. **Abstraction**

### 🔹 Definition:

Abstraction means hiding **implementation details** and showing only the **functionality**.

### 🔹 Achieved in Java by:

* **Abstract classes**
* **Interfaces**

### 🔹 Example using Abstract Class:

```java
abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

### 🔹 Follow-up Q\&A:

**Q: Difference between abstraction and encapsulation?**
A: Abstraction hides *implementation*, while encapsulation hides *data*.

**Q: Abstract class vs Interface?**
A:

* Abstract class can have both abstract and non-abstract methods.
* Interface (Java 8+) can have default/static methods, but mostly used to define contracts.

**Q: Can a class implement multiple interfaces?**
A: Yes, Java supports multiple inheritance via interfaces.

---

## ✅ 3. **Inheritance**

### 🔹 Definition:

Inheritance allows a class to **acquire properties and methods** from another class using `extends`.

### 🔹 Example:

```java
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running fast");
    }
}
```

### 🔹 Follow-up Q\&A:

**Q: Types of inheritance in Java?**
A:

* Single
* Multilevel
* Hierarchical
  *(Note: Java does **not** support multiple inheritance with classes to avoid ambiguity, but interfaces allow it.)*

**Q: Can child override parent method?**
A: Yes, using **method overriding** with the same signature.

**Q: What if you call parent method using child object?**
A: The **overridden** version in the child class runs (**runtime polymorphism**).

---

## ✅ 4. **Polymorphism**

### 🔹 Definition:

Polymorphism means “**many forms**.” It lets one interface be used for different implementations.

### 🔹 Types:

* **Compile-time Polymorphism (Method Overloading)**
* **Runtime Polymorphism (Method Overriding)**

### 🔹 Method Overloading:

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

### 🔹 Method Overriding:

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
```

### 🔹 Follow-up Q\&A:

**Q: What is method overloading?**
A: Defining multiple methods with the same name but different parameters in the same class.

**Q: What is method overriding?**
A: Redefining a superclass method in the subclass with the same signature.

**Q: Is overriding runtime or compile-time?**
A: Runtime polymorphism.

**Q: Can constructors be overloaded? Overridden?**
A: Yes, **overloaded**, but **not overridden** (constructors are not inherited).

---

## ✅ BONUS: Other OOP Concepts in Java

---

### ✅ 5. **Constructor Overloading**

```java
class Person {
    String name;
    int age;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

### ✅ 6. **‘this’ Keyword**

```java
class Student {
    String name;

    Student(String name) {
        this.name = name; // refers to the instance variable
    }
}
```

---

### ✅ 7. **‘super’ Keyword**

```java
class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void greet() {
        super.greet(); // calls parent method
        System.out.println("Hello from Child");
    }
}
```

---

### ✅ 8. **Final Keyword**

* `final` variable – cannot be reassigned.
* `final` method – cannot be overridden.
* `final` class – cannot be inherited.

```java
final class Constants {
    final double PI = 3.14;
}
```

---

### ✅ 9. **Interface Example**

```java
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}
```

---

### ✅ 10. **Abstract vs Interface Summary Table**

| Feature              | Abstract Class      | Interface                    |
| -------------------- | ------------------- | ---------------------------- |
| Methods              | Abstract + Concrete | Only abstract (until Java 8) |
| Multiple Inheritance | No                  | Yes                          |
| Access Modifiers     | Any                 | Public only                  |
| Constructors         | Yes                 | No                           |

---

## 🎤 Final Tip for Interviews:

You can say:

> "OOP allows me to write scalable, reusable, and modular code. I use encapsulation to protect data, abstraction to hide complexity, inheritance to promote reuse, and polymorphism for flexibility."

---
