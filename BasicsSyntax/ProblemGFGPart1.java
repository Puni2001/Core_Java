package BasicsSyntax;

import java.util.Scanner;

public class ProblemGFGPart1 {
    /* Print A.P of a given input 
     * 
     * a = 2 , d = 1 , n = 5 
     * 
     * A.P is the sequence of numbers from a -> with diff of d until N 
     * 
     * 
     */
    static Scanner sc = new Scanner(System.in);
    public static int apOfNum(int a,int d, int n){
        int result =  a+(n-1)*d;
        return result;
    }

    public static void evenOrOdd(int num){
        if (num % 2 == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd Number");
        }
    }


    public static int largestOfThree(int a, int b, int c) {
        // if (a >= b && a >= c) {
        //     return a;
        // } else if (b >= a && b >= c) {
        //     return b;
        // } else {
        //     return c;
        // }

        int ans = Math.max(a, b);
        int finalans = Math.max(ans, c);
        return finalans;
    }


    public static void leapYearOrNot(int year){
        if (year % 4 == 0 && year % 100 != 0 ){
            System.out.println("Yes it is leap year");
        }
        else if (year % 400 == 0){
            System.out.println("Yes it is leap year");
        }
        else {
            System.out.println("No  === it is not leap year");
        }

    }

    public static void calculator(double a , double b){
        System.out.println("Select a Option 1, 2 & 3 : ");
        System.out.println("1. Addition ");
        System.out.println("2. Substraction ");
        System.out.println("3. Multiplication ");
        int option = sc.nextInt();
        if (option == 1){
            double result = a + b ;
            System.out.println("Result of cal : " + result);
        }
        else if (option==2){
            double result = a - b;
            System.out.println("Result of cal : " + result);
        }
        else {
            double result = a * b;
            System.out.println("Result of cal : " + result);
        }
    }

    public static int countDigits(int num){
        int result = 0;
        while (num > 0){
            num = num /10;
            result = result + 1;
        }
        return result;
    }

    public static int fact(int num){
        int result = 1;
        for ( int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }

    public static int gcd(int a, int b){
        int ans = 1;
        int x = Math.min(a,b);
        for (int i=1; i <=x; i++){
            if (a%i==0 && b%i==0){
                ans = i;    
            }
       
        }
         return ans;

    }

    public static void maxArray(int[] arr){
        int maxValue = Integer.MIN_VALUE;
        for (int item : arr){
            if (item > maxValue){
                maxValue = item;
            }
            
        }
        System.out.println("Answer : " + maxValue);
    }

    public static void avg(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int item : arr){
            sum += item; 
        }
        double avg  = sum / n;
        System.out.println("Average : " + avg);
    }
    public static void main(String[] args){
    //     System.out.println("Enter Required Numbers : a , d , n ");
    //     int a = sc.nextInt();
    //     int d = sc.nextInt();
    //     int n = sc.nextInt();
    //     System.out.println("Result AP : " + apOfNum(a, d, n));
    //     System.out.println("Result Largest of 3 numbers : " + largestOfThree(a, n, n));
    //     System.out.println("Enter the number to find even or odd : ");
    //     int num = sc.nextInt();
    //    evenOrOdd(num);
    //    int year = sc.nextInt();
    //    leapYearOrNot(year);
        // System.out.println("Enter a first Number : ");
        // double first = sc.nextDouble();
        // double second = sc.nextDouble();
        // calculator(first, second);
        // int num = sc.nextInt();
        // System.out.println( "answer is " +countDigits(num));
        // System.out.println( "answer is " +fact(num));
        int[] arr = {10,20,30,40};
        // maxArray(arr);
        avg(arr);
    }

}
