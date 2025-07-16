package LowLevelDesign.SOLID;


/*

 D — Dependency Inversion Principle (DIP)
 What is DIP?
High-level modules should not depend on low-level modules. Both should depend on abstractions.

Abstractions should not depend on details. Details should depend on abstractions.

 In Simpler Words:
Don’t hardcode dependencies — depend on interfaces (abstractions).

High-level logic (business rules) should not be tightly coupled with low-level implementation (e.g., file, DB, APIs).

 */
// BAD Desing
// In this case, Developer class directly depends on the concrete BackendDeveloper class.
/*
class Backenddeveloper {
    public void developBackend(){
        System.out.println("developing Backend..");
    }
}

class Project{
    private Backenddeveloper dev;

    public Project(){
        dev = new Backenddeveloper(); // tightly coupled
    }

    public void build() {
        dev.developBackend();
    }
}
*/
/*
 Problems:
Can't switch to a different developer type (like frontend).

Can't easily unit test.

Violates Open/Closed too.
 */

// Good design

//  Introduce an abstraction (interface) and depend on it.
interface  Developer{
    void develop();
}

class Backenddeveloper implements Developer{
    public void develop(){
        System.out.println("Writing backend code..");
    }
}

class FrontendDeveoper implements Developer{
    public void develop(){
        System.out.println("Writing frontend code..");
    }
}

// Now the high-level class depends on abstraction:
class Project {
    private Developer dev;

    public Project(Developer dev){
        this.dev = dev;
    }

    public void build(){
        dev.develop();
    }
}



public class DIP {
    public static  void main(String[] args){
        Developer backend = new Backenddeveloper();
        Developer frontend = new FrontendDeveoper();

        Project p1 = new Project(backend);
        p1.build();

        Project p2 = new Project(frontend);
        p2.build();
    }
}
/*
| Question             | Answer                                                                                                   |
| -------------------- | -------------------------------------------------------------------------------------------------------- |
| What is DIP?         | High-level modules shouldn’t depend on low-level modules. Both depend on abstractions.                   |
| Why is it important? | Enables flexibility, loose coupling, and testability.                                                    |
| How to apply it?     | Use interfaces/abstract classes. Inject dependencies using constructor or setter (Dependency Injection). |

 */
