package $1_Control_Statement.$1_Conditional_Statement;

import java.util.Scanner;

public class _2_if_Leap_Year {
	public static void main(String args[]) {
		
		//Logic
		/*
		 * First modules of year with 4 and is should be equal to 0
		 * && (AND operation)
		 * second modules of year with 100 and it should be not equal to 0
		 * both should be true
		 * || (OR operation)
		 * third modules of year with 400 and it should be equal to 0
		*/
		
		System.out.println("-------------------- Leap Year Check --------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			System.out.println("Yea the year "+year +" is a leap year....");
		}
		else {
			System.out.println("Nah brother the year "+year+" is not a leap year");
		}
		sc.close();
	}

}
