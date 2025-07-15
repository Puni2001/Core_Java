// File: OOPS.java
package LowLevelDesign.OOPS;

public class OOPS {
    public static void main(String[] args) {
        System.out.println("============== Implementing OOPS Concepts with examples and " +
                "definitions in comments and Important concepts ===========");

        // 1. CLASS & OBJECT — Core of Java OOP
        // A class is a blueprint for objects.
        Car myCar = new Car("Tesla", 100);
        myCar.accelerate();

        // 2. ENCAPSULATION — Binding data and behavior, hiding internal state
        BankAccount acc = new BankAccount("Alice", 1000);
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());

        // 3. INHERITANCE — IS-A relationship, code reuse
        Dog dog = new Dog();
        dog.sound(); // Output: Bark

        // 4. POLYMORPHISM — One name, many forms
        Animal a = new Cat(); // Runtime Polymorphism
        a.sound();            // Output: Meow

        CompileTimePoly poly = new CompileTimePoly();
        System.out.println(poly.add(5, 10));
        System.out.println(poly.add(5.5, 3.2));

        // 5. ABSTRACTION — Hiding complexity using abstract classes/interfaces
        Vehicle v = new Bike(); // Abstract type
        v.start();              // Implementation by Bike

        // 6. HAS-A (Composition) — Using objects inside other objects
        Engine engine = new Engine();
        VehicleWithEngine veh = new VehicleWithEngine(engine);
        veh.start();

        // 7. 'final', 'static', 'this', 'super' — Java keywords in OOP
        System.out.println("PI Constant: " + Constants.PI);
        System.out.println("Static Count: " + new Counter().getCount());

        // 8. Object class methods: equals(), toString()
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        System.out.println("Are points equal? " + p1.equals(p2));
        System.out.println(p1.toString());

        // 9. Immutable Class
        ImmutableEmployee emp = new ImmutableEmployee("John", 101);
        System.out.println(emp.getName());
    }
}

// === 1. Class & Object ===
class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void accelerate() {
        speed += 10;
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }
}

// === 2. Encapsulation ===
class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

// === 3. Inheritance ===
class Animal {
    void sound() {
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

// === 4. Polymorphism ===

// Compile-time (Method Overloading)
class CompileTimePoly {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Run-time (Method Overriding)
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

// === 5. Abstraction ===
abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }
}

// === 6. Composition / HAS-A ===
class Engine {
    void ignite() {
        System.out.println("Engine started");
    }
}

class VehicleWithEngine {
    private Engine engine;

    public VehicleWithEngine(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.ignite();
        System.out.println("Vehicle is moving");
    }
}

// === 7. Keywords: final, static, this, super ===
final class Constants {
    public static final double PI = 3.14159;
}

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// === 8. Object class methods: equals(), hashCode(), toString() ===
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x; this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point p = (Point) obj;
        return this.x == p.x && this.y == p.y;
    }

    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}

// === 9. Immutable Class ===
final class ImmutableEmployee {
    private final String name;
    private final int id;

    public ImmutableEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}
