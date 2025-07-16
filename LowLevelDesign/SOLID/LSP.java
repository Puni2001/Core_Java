package LowLevelDesign.SOLID;

/*

 L — Liskov Substitution Principle (LSP)

 What is LSP?
Objects of a superclass should be replaceable with objects of its subclasses without breaking the application.

Simply put:
“A child class should be able to stand in for the parent class — and everything should still work correctly.”

 Real-Life Analogy:
Imagine a function useVehicle(Vehicle v) that works perfectly with a Car.
Now, you create a subclass ElectricCar.

 If passing ElectricCar breaks useVehicle(), then your subclass violates LSP.

*/

////  BAD Design — Violates LSP
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Sparrow extends Bird {
    // OK
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}


////  GOOD Design — Follows LSP

interface BirdLSP {
    void eat();
}

interface FlyingBird extends BirdLSP {
    void fly();
}

class SparrowLSP implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

class PenguinLSP implements BirdLSP {
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

public class LSP {
    public static void main(String[] args) {
        BirdLSP penguin = new PenguinLSP();
        BirdLSP sparrow = new SparrowLSP();

        sparrow.eat();
        penguin.eat();

        //  Only flying birds should be asked to fly
        FlyingBird flyingBird = new SparrowLSP();
        flyingBird.fly();
    }
}

/*
| Question              | Answer                                                                                   |
|-----------------------|------------------------------------------------------------------------------------------|
| What is LSP?          | Subclasses should be usable in place of their base classes without side effects.         |
| Why is it important?  | It ensures polymorphism works safely and reliably.                                       |
| How to apply it?      | Design correct abstractions. Don’t force subclasses to support behavior they shouldn't.  |
*/
