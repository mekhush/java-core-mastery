package $1_Control_Statement.$1_Conditional_Statement;

import java.util.Scanner;

public class _1_if_else {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("-------------------- Eligibility Check --------------------");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations! You are eligible.");
        } else {
            System.out.println("You are not eligible yet.");
        }


        System.out.println("\n-------------------- Largest of Two Numbers --------------------");
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A is greater than B.");
        } else {
            System.out.println("B is greater than or equal to A.");
        }


        System.out.println("\n-------------------- Positive or Negative --------------------");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The entered number is Positive.");
        } else {
            System.out.println("The entered number is Negative.");
        }


        System.out.println("\n-------------------- Even or Odd --------------------");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("The entered number is Even.");
        } else {
            System.out.println("The entered number is Odd.");
        }

        sc.close();
    }
}
