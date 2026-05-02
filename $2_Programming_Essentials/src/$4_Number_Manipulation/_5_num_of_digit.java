package $4_Number_Manipulation;

import java.util.Scanner;

public class _5_num_of_digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int count = 0;

		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}
}
