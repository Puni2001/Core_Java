package LowLevelDesign.SOLID;

/*

I — Interface Segregation Principle (ISP)

What is ISP?
Clients should not be forced to depend on interfaces they do not use.

Simply put:

Break large interfaces into smaller, more specific ones so that classes only implement what they actually need.

Real-World Analogy:
Imagine you have a MultiFunctionPrinter interface:

interface Machine {
    void print();
    void scan();
    void fax();
}
Now, if you build a basic printer that only prints, it will still be forced to implement scan() and fax() — even if it doesn’t need to.
 That violates ISP.
 */

// BAD  Design

//interface  Machine{
//    void print();
//    void scan();
//    void fax();
//}
//
//class OldPrinter implements Machine{
//    public void print(){
//        System.out.println("Printing..");
//    }
//
//    public void scan(){
//        throw new UnsupportedOperationException("scan not supported");
//    }
//
//    public void fax() {
//        throw new UnsupportedOperationException("Fax not supported");
//    }
//}
/*
OldPrinter is forced to implement scan() and fax() even though it doesn’t use them. Bad abstraction.
 */

// Good Design

interface  Printer {
    void print();
}
interface Scanner {
    void scan();
}
interface Fax{
    void fax();
}

class BasicPrinter implements Printer{
    public void print(){
        System.out.println("Printing..");
    }
}

class AdvancedPrinter implements Printer, Scanner, Fax {
    public void print() {
        System.out.println("Advanced Printing...");
    }

    public void scan() {
        System.out.println("Advanced Scanning...");
    }

    public void fax() {
        System.out.println("Faxing...");
    }
}


public class ISP {
    public static void main(String[] args){
        Printer printer = new BasicPrinter();
        printer.print();

        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print();
        advancedPrinter.scan();
        advancedPrinter.fax();
    }
}

/*
| Question             | Answer                                                                 |
| -------------------- | ---------------------------------------------------------------------- |
| What is ISP?         | Clients shouldn’t be forced to implement unused methods.               |
| Why is it important? | It promotes **separation of concerns** and **flexibility**.            |
| How to apply it?     | Create focused, small interfaces instead of one large “god interface.” |

 */
