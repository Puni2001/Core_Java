package BasicsSyntax;

import java.util.*;

public class Conditions {

    public void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult!");
        } else {
            System.out.println("Not Adult!");
        }

        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        Conditions obj = new Conditions();
        obj.table(number);

        sc.close();
    }
}
