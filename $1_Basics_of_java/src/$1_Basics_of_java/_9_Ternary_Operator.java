package $1_Basics_of_java;

import java.util.Scanner;
public class _9_Ternary_Operator {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A value: ");
        int a = sc.nextInt();

        System.out.print("Enter B value: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;

        System.out.println("Greater value is: " + max);

        sc.close();
    }
}
