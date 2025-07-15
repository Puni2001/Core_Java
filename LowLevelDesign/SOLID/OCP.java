package LowLevelDesign.SOLID;
/*

✅ O — Open/Closed Principle (OCP)
🔸 What is OCP?
Software entities (classes, modules, functions) should be open for extension, but closed for modification.

🔁 You should be able to add new behavior without changing existing code.

✅ Real-Life Analogy:
Imagine a payment system. Initially, it supports credit cards.
Tomorrow you need to support UPI, then PayPal.
You shouldn’t modify existing classes every time.
Instead, write new code that extends behavior.

 */

// BAD Design

class PaymentProcessor {
    public String pay(String type){
        if (type.equals("UPI")) return "Paid using UPI";
        else if (type.equals("Credit")) return "Paid using Credit";
        else if (type.equals("PayPal")) return "paid using Paypal";
        else return "Paid by Cash";
    }
}

//  Every time a new payment method comes, we edit this class. Risky!

// GOOD DESIGN -->

// step 1 --> Abstract class
interface  PaymentMethod {
    void pay();
}

// Step 2 --> Extend it with implementations
class CreditCardPayment implements PaymentMethod{
       public void pay(){
            System.out.println("Paid using credit card");
        }
}

class UpiPayment implements  PaymentMethod{
    public void pay(){
        System.out.println("Pay using UPI ");
    }
}

// Step 3 -->   The processor  stays unchanged
class PaymentProcessorOCP{
    public void processorPayment(PaymentMethod paymentMethod){
        paymentMethod.pay();
    }
}




public class OCP {
        public static  void main(String[] args){
            PaymentProcessorOCP process = new PaymentProcessorOCP();

            process.processorPayment(new CreditCardPayment());
            process.processorPayment(new UpiPayment());
        }
}
