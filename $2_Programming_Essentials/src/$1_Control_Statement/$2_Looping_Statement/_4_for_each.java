package $1_Control_Statement.$2_Looping_Statement;

import java.util.Scanner;

public class _4_for_each {
	
	public static void printIntArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num);
		}
	}
	public static void printStringArray(String[] arr) {
		for (String letter : arr) {
			System.out.println(letter);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int l = sc.nextInt();

		int[] arr = new int[l];
		System.out.println("Enter the Elements of the array: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the length of the String Array: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] cars = new String[size];
		System.out.println("Enter the Cars one after other: ");
		for(int i= 0; i<cars.length;i++) {
			cars[i] = sc.nextLine();
		}
		
		sc.close();
		
	}
}
