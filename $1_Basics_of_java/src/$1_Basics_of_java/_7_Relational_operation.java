package $1_Basics_of_java;

import java.util.Scanner;

public class _7_Relational_operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the A Value : ");
		int a = sc.nextInt();
		System.out.print("Enter the B Value : ");
		int b = sc.nextInt();
		
		System.out.println("The Equal Operator : "+(a==b));
		System.out.println("The Not Equal Operator : "+(a!=b));
		System.out.println("The Greater Than Operator - if A is Greater Than : "+(a>b));
		System.out.println("The Lesser Than Operator - if A is Lesser Than : "+(a<b));
		System.out.println("The Greater Than Or Equal Operator : "+(a>=b));
		System.out.println("The Lesser Than Or Equal Operator : "+(a<=b));
		
		sc.close();

	}
}
