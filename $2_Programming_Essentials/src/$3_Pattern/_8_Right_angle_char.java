package $3_Pattern;

import java.util.Scanner;

public class _8_Right_angle_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Alphabet you want to start with : ");
		char start_alp = sc.next().charAt(0);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (start_alp + i - 1));
			}
			System.out.println();
		}
		sc.close();
	}

}
