package $1_Control_Statement.$2_Looping_Statement;

import java.util.Scanner;

public class _2_for_loop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n;i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
