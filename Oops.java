class Oops{
    public static void main(String[] args){
        System.out.println("OOps practice");
    }
}

// Encapsulation is the concept od wrapping data and methods that operate on data witin the one unit and restricting access to some 
// componenets using access modifiers ( private, public, default)
class BankAccount{
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}

// Abstraction is hiding the implementation details and showing only the necessary information 
abstract  class Animal{
    abstract  void   makeSound();
}

class  Dog extends  Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}