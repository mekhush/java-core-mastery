package $1_Control_Statement.$1_Conditional_Statement;

import java.util.Scanner;

public class _5_Switch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Week telling by number...");
		while(true) {
			System.out.print("Enter the number between 1 to 7: ");
			int day = sc.nextInt();
			switch (day) {
			case 1: {
				System.out.println("Sunday");
				break;
			}
			case 2: {
				System.out.println("Monday");
				break;
			}
			case 3: {
				System.out.println("Tuesday");
				break;
			}
			case 4: {
				System.out.println("Wednesday");
				break;
			}
			case 5: {
				System.out.println("Thursday");
				break;
			}
			case 6: {
				System.out.println("Friday");
				break;
			}
			case 7: {
				System.out.println("Saturday");
				break;
			}
			default:
				System.out.println("Please enter the number between 1 to 7 only...");
				continue;
			}
			break;
		}
		
		
		System.out.println("Grade Disturbeting by number got");
		while (true) {
            System.out.println("Enter the number");
            int marks = sc.nextInt();
            switch (marks) {
                case 90:
                    System.out.println("A grade");
                    break;
                case 80:
                    System.out.println("B grade");
                    break;
                case 70:
                    System.out.println("C grade");
                    break;
                case 60:
                    System.out.println("D grade");
                    break;
                case 50:
                    System.out.println("E grade");
                    break;
                case 40 :
                    System.out.println("Fail ");
                    break;
                default:
                    System.out.println("Fail ");
                    continue;
            }
            break;
        }
		
		sc.close();
		
	}
}
