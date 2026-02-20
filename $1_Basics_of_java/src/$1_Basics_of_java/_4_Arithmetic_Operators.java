package $1_Basics_of_java;

import java.util.Scanner;

public class _4_Arithmetic_Operators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the A Value : ");
		int a = sc.nextInt();
		System.out.print("Enter the B Value : ");
		int b = sc.nextInt();
		
		
		System.out.println("Addition Operation : " +(a + b));
		System.out.println("Substraction Operation : " +(a - b));
		System.out.println("Multiplication Operation : " +(a * b));
		System.out.println("Division Operation : " +(a / b)); // Division is reminder
		System.out.println("Modules Operation : " +(a % b)); // Modules if Quotient
		
		
		
		sc.close();
	}
}
