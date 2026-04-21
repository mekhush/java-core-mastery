package $4_Number_Manipulation;

import java.util.Scanner;

public class _1_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numer: ");
		int num = sc.nextInt();
		int r = 0;
		int n = num;

		while (num != 0) {
			int a = num % 10;
			r = r * 10 + a;
			num = num / 10;
		}
		if (n == r) {
			System.out.println(n + " is a palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}
		sc.close();
	}

}
