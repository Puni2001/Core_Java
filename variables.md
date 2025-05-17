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

