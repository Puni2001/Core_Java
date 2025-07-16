package LowLevelDesign.SOLID;

/*
 S — Single Responsibility Principle (SRP)

 What is SRP?
A class should have only one reason to change.

In other words: One class = One job
If a class does more than one thing (e.g., both data saving and business logic), it's violating SRP.

         Real-Life Analogy:
Imagine a Journal app:

It lets you write and manage entries 

But also saves them to disk

That’s 2 responsibilities in 1 class — a violation of SRP.
*/

// BAD Design - Voilates SRP
class Journal{
    private String text;

    public Journal(String  text){
        this.text = text;
    }

    public void addEntry(String entry){
        text += "\n" + entry;
    }

    public void saveToFile(String filename){
        System.out.println("Saving to file " + filename);
    }

}

// class - 1 : Good design journal should hadle only journal content

class JournalSRP{
    private String text;

    public JournalSRP(String  text){
        this.text = text;
    }

    public void addEntry(String entry){
        text += "\n" + entry;
        System.out.println(text);
    }

    public String getText(){
        return text;
    }
}


// class 2 : Persistance - handles saving logic

class PersistanceManager{
    public void  saveToFile(JournalSRP journal , String filename){
        System.out.println("Saving Journal to "+ filename);
    }
}

public class SRP {
    public static void main(String[] args){
        System.out.println("========== Single Responsibility Priciple Implementation ( SRP )======");
        JournalSRP j = new JournalSRP("My Journal");
        j.addEntry("Learned SRP and Implemented it today !!!");

        PersistanceManager pm = new PersistanceManager();
        pm.saveToFile(j,"JournalSRP.txt");
    }
}

/*
| Question                       | Answer                                                     |
| ------------------------------ | ---------------------------------------------------------- |
| What is SRP?                   | A class should have one responsibility (reason to change). |
| Why is it useful?              | It improves maintainability, testing, and readability.     |
| What happens if you ignore it? | One change may break unrelated functionality.              |

 */