package $4_Number_Manipulation;

import java.util.Scanner;

public class _7_Swapping {
	
	// not recommend this method as it Can cause integer overflow
	public void swap(int a, int b) {
		System.out.println("Before swapping: A = " + a + ", B = " + b);
		if (a != 0 || b != 0) {
			a = a - b;
			b = a + b;
			a = b - a;
			System.out.println("After swapping: A = " + a + ", B = " + b);
		} else {
			System.out.println("Invalid number..");
		}
	}
	
	public void oxrSwap(int a, int b) {
		System.out.println("Before swapping: A = " + a + ", B = " + b);
		if (a != 0 || b != 0) {
			a = a ^ b;
			b = a ^ b;
			a = b ^ a;
			System.out.println("After swapping: A = " + a + ", B = " + b);
		} else {
			System.out.println("Invalid number..");
		}
	}

	public void tempSwap(int a, int b) {
		System.out.println("Before swapping: A = " + a + ", B = " + b);
		if (a != 0 || b != 0) {
			int temp = a;
			a = b;
			b = temp;
			System.out.println("After swapping: A = " + a + ", B = " + b);
		}
		else {
			System.out.println("Invalid number..");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A element: ");
		int a = sc.nextInt();
		System.out.print("Enter B element: ");
		int b = sc.nextInt();
		_7_Swapping obj = new _7_Swapping();
		//call this method for swapping without temp variable 
		// not recommend this method as it Can cause integer overflow
		//obj.swap(a, b);
		
		//call this method for swapping without temp variable
		// best choice for without temp as cannot cause Integer Overflow since it operates on raw bits, not numeric values.
		obj.oxrSwap(a, b);
		//call this method for swapping with temp variable
		//obj.tempSwap(a, b);
		sc.close();
	}

}
