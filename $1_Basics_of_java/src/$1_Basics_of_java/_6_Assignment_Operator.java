package $1_Basics_of_java;

import java.util.Scanner;

public class _6_Assignment_Operator {
	public static void main(String arsg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the A value: ");
		int a = sc.nextInt();
		System.out.println("Enter the B value: ");
		int b = sc.nextInt();
		
		a += 3;
		System.out.println("This is A value after using Add & Assign opertor "+ a);
		b -= 5;
		System.out.println("This is B value after using Subtract & Assign opertor "+ b);
		a *= 2;
		System.out.println("This is A value after using Multi & Assign opertor "+ a);
		b /= 2;
		System.out.println("This is A value after using Divide & Assign opertor "+ b);
		
		sc.close();
	}
}
