package $1_Basics_of_java;

import java.util.Scanner;
public class _8_Logical_operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the A Value : ");
		int a = sc.nextInt();
		System.out.print("Enter the B Value : ");
		int b = sc.nextInt();
		
		System.out.println("If A is Greater Or Equal To to B and A is Equal to 1 Then the Answer is True "+ (a>=b && a==1));
		System.out.println("If A is Lesser Or Equal To B and A is Equal to 5 Then the Answer true"+(a<=b && a==5));
		System.out.println("If A is Lesser or Equal To 2 or B is Greater Than A If any one condition is true then the answer is false" +!(a<=2 || b>a));
		
		
//		System.out.println(
//	            "Logical NOT example using expression : "
//	            + !(a <= 2 || b > a)
//	        );
//
//	        // Logical NOT using flag
//	        boolean flag = (a > b);
//	        System.out.println("Flag value : " + flag);
//	        System.out.println("Logical NOT (!flag) : " + !flag);

	  
		sc.close();
	}
}
