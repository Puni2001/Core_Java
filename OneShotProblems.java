import java.util.*;

public class OneShotProblems {
    
    static Scanner sc = new Scanner(System.in);

    public static void printHello() {
        System.out.println("Hello World!");
    }

    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static void greet(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    public static double celciusToFahrenhiet(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    public static double simpleInterest(double principle, double rate, double time){
        return (principle * rate * time) / 100 ;
    }

    public static void swapWithVariable(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("this is with varaible a =" + a + "b = "+ b);
    }

    public static void swapWithoutVariable(int a, int b){
        a = a + b;
        b = a -b;
        a = a-b ;

        System.out.println("this is without variable a =" + a + "b = "+ b);
    }

    public static double evaluateExpression(int a , int b){
        double result = (a+b) * (a+b) ;   // or use Math.pow(a+b, 2)
        return result; 
    }

    public static double[] quotientAndRemainder(int a, int b) {
        double quotient = (double) a / b; // ensures floating-point division
        double remainder = a % b;
        return new double[] { quotient, remainder };
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSelect a problem to run:");
            System.out.println("1. Print Hello World");
            System.out.println("2. Take two numbers as input and print their sum.");
            System.out.println("3. Read name and age, then print formatted.");
            System.out.println("4. Convert Celsius to Fahrenheit");
            System.out.println("5. Calculate Simple Interest");
            System.out.println("6. Swap two numbers (with and without a third variable)");
            System.out.println("7. Evaluate expression (a + b)^2");
            System.out.println("8. Find remainder and quotient");
            System.out.println("50. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printHello();
                    break;

                case 2:
                    System.out.println("Enter two numbers: ");
                    int first = sc.nextInt();
                    int second = sc.nextInt();
                    System.out.println("Sum is: " + sumOfTwo(first, second));
                    break;

                case 3:
                    sc.nextLine(); // clear the buffer
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter your age: ");
                    int age = sc.nextInt();
                    greet(name, age);
                    break;

                case 4:
                    System.out.println("Enter temperature in Celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " + celciusToFahrenhiet(celsius));
                    break;
                case 5:
                    System.out.print("Enter principal: ");
                    double principle = sc.nextDouble();
                    System.out.print("Enter rate: ");
                    double rate = sc.nextDouble();
                    System.out.print("Enter time (years): ");
                    double time = sc.nextDouble();
                    System.out.println("Simple interest is :" + simpleInterest(principle, rate, time));

                    break;

                case 6:
                    System.out.println("Enter two numbers :");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    swapWithVariable(a, b);
                    swapWithoutVariable(a, b);
                    break;
                case 7:
                    System.out.println("Enter the two numbers :");
                    int fa = sc.nextInt();
                    int sa = sc.nextInt();
                    System.out.println("Answer :" + evaluateExpression(fa, sa));
                    break;
                case 8:
                    System.out.println("Enter the two numbers :");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("Answer is : " + quotientAndRemainder(c, d));
                    break;
                case 50:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
