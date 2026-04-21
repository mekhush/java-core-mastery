package $4_Number_Manipulation;

import java.util.Scanner;

public class _3_Sum_of_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("sum is: "+sum);
		sc.close();
	}

}
