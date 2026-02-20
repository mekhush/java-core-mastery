package $1_Basics_of_java;

import java.util.Scanner;

public class _5_Unary_Operators {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the A Value : ");
	int a = sc.nextInt();
	System.out.print("Enter the B Value : ");
	int b = sc.nextInt();
	
	System.out.println("Post Increment Operation : " +(a++));
	System.out.println("Pre Increment Operation : " +(++b));
	System.out.println("Post Decrement Operation : " +(b--));
	System.out.println("Pre Decrement Operation : " +(--a));
	sc.close();
	}
}
