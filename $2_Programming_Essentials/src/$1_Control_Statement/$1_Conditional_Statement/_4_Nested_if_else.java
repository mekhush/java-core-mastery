package $1_Control_Statement.$1_Conditional_Statement;

import java.util.Scanner;

public class _4_Nested_if_else {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("-------------------- Largest of Three Numbers (Nested if–else) --------------------");

        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of C: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is the largest among A, B, and C.");
            } else if (c > a) {
                System.out.println("C is the largest among A, B, and C.");
            } else {
                System.out.println("A and C are equal and largest.");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("B is the largest among A, B, and C.");
            } else if (c > b) {
                System.out.println("C is the largest among A, B, and C.");
            } else {
                System.out.println("B and C are equal and largest.");
            }
        } else {
            if (a > c) {
                System.out.println("A and B are equal and largest.");
            } else if (c > a) {
                System.out.println("C is the largest among A, B, and C.");
            } else {
                System.out.println("All three values are equal.");
            }
        }

        sc.close();
    }
}
