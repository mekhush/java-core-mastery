package $1_Control_Statement.$2_Looping_Statement;

import java.util.Scanner;

//Entry control loop
public class _1_while_loop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int i = 0 ;
		
		while(n >= i) {
			System.out.println(i);
			i++;
		}
		
		sc.close();
	}
}




