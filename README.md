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

## 🧾 4. **Java Syntax, Variables, Data Types**

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
