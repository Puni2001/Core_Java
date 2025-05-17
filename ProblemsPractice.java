import java.util.*;
import java.math.*;


public class ProblemsPractice {
    static Scanner sc = new Scanner(System.in);

    // 1. Average of 3 numbers
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // 2. Sum of all odd numbers from 1 to n
    public static int sumOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    // 3. Greater of two numbers
    public static int greater(int a, int b) {
        return (a > b) ? a : b;
    }

    // 4. Circumference of a circle given radius
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // 5. Voting eligibility (> 18)
    public static boolean canVote(int age) {
        return age > 18;
    }

    // 6. Infinite loop using do-while
    public static void infiniteLoop() {
        do {
            System.out.println("Infinite loop... press Ctrl+C to stop.");
        } while (true);
    }

    // 7. Count positives, negatives, zeros until user stops
    public static void countPosNegZero() {
        int pos = 0, neg = 0, zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Zeros: " + zero);
    }

    // 8. Power function x^n
    public static double power(double x, int n) {
        return Math.pow(x, n);
    }

    // 9. Greatest Common Divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // 10. Fibonacci series of n terms
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Main menu to test methods
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSelect a problem to run:");
            System.out.println("1. Average of 3 numbers");
            System.out.println("2. Sum of odd numbers from 1 to n");
            System.out.println("3. Greater of two numbers");
            System.out.println("4. Circumference of a circle");
            System.out.println("5. Voting eligibility");
            System.out.println("6. Infinite loop");
            System.out.println("7. Count positives, negatives, zeros");
            System.out.println("8. Power x^n");
            System.out.println("9. GCD of two numbers");
            System.out.println("10. Fibonacci series");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter 3 integers:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println("Average: " + average(a, b, c));
                    break;
                case 2:
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.println("Sum of odd numbers: " + sumOddNumbers(n));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Greater: " + greater(a, b));
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Circumference: " + circumference(r));
                    break;
                case 5:
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.println(canVote(age) ? "Eligible to vote" : "Not eligible to vote");
                    break;
                case 6:
                    infiniteLoop();
                    break;
                case 7:
                    countPosNegZero();
                    break;
                case 8:
                    System.out.print("Enter base (x): ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent (n): ");
                    int exp = sc.nextInt();
                    System.out.println(base + "^" + exp + " = " + power(base, exp));
                    break;
                case 9:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("GCD: " + gcd(a, b));
                    break;
                case 10:
                    System.out.print("Enter number of terms: ");
                    n = sc.nextInt();
                    fibonacci(n);
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
