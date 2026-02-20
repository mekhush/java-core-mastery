package $1_Control_Statement.$2_Looping_Statement;

import java.util.Scanner;

public class _3_do_while {
	public static  void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int i =0;
		
		do {
			System.out.println(i);
			i++;
		} while (n>=i);
		
		sc.close();
	}
}
