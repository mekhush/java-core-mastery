package $4_Number_Manipulation;

import java.util.Scanner;

public class _6_Tables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which the Table you want: ");
		int n = sc.nextInt();
		int result = 0;
		for(int i=1;i<=10;i++) {
			result = n *i;
			System.out.println(n+" X "+i+" = "+result);
		}
		sc.close();
	}
}
