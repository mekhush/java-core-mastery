package $1_Control_Statement.$1_Conditional_Statement;

import java.util.Scanner;

public class _3_else_if {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------Basic els-if------------------------");
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Enter number is Positive");
		}
		else if (num < 0) {
			System.out.println("Enter number is Negative");			
		}
		else {
			System.out.println("Enter number is Zero");						
		}
		

		System.out.println("--------------------Grades using else-if--------------------");
		System.out.print("Enter your Grades: ");
        int m = sc.nextInt();

        if (m > 90) {
            System.out.println("Contrats You got A grade bro Party..!");
        } else if (m >80) {
            System.out.println("Contrats You got B grade bro Party..!");
        } else if (m > 70) {
            System.out.println("Contrats You got C grade bro Party..!");
        } else if (m > 60) {
            System.out.println("Contrats You got D grade bro Party..!");
        } else if (m > 50) {
            System.out.println("Contrats You got E grade bro Party..!");
        } else {
            System.out.println("Come bro i will give party 😒");
        }
        
        
        System.out.println("------Largest number within the 3 number using else-if------");
        System.out.print("Enter the A value: ");
        int a = sc.nextInt();
        System.out.print("Enter the B value: ");
        int b = sc.nextInt();
        System.out.print("Enter the C value: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("The A value is larger...");
        } else if (b > a && b > c) {
            System.out.println("The B value is larger...");
        } else {
            System.out.println("The C value is larger...");
        }
		
		sc.close();
	}
}
