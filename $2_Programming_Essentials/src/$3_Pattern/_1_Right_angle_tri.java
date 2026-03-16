package $3_Pattern;

import java.util.Scanner;

public class _1_Right_angle_tri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of Right angle");
		int n = sc.nextInt();
		

//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i);
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		int m = 1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(m+" ");
//				m++;
//			}
//			System.out.println();
//		}
		
		
		for(int i=1; i<=n;i++) {
			int even = i * 2;
			for(int j=1; j<=i;j++) {
				if(even < 10) {
					System.out.print("0"+even);					
				}
				else {
					System.out.print(even);										
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
