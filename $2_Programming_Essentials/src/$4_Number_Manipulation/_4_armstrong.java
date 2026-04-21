package $4_Number_Manipulation;

import java.util.Scanner;

public class _4_armstrong {

    // Optimized power function (Exponentiation by Squaring)
    public static int power(int x, int y) {
        if (y == 0) return 1;

        int half = power(x, y / 2);  // store result once

        if (y % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    // Count number of digits
    public static int order(int n) {
        int count = 0;

        // Handle 0 case
        if (n == 0) return 1;

        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // Armstrong check
    public static boolean armstrong(int n) {
        int digits = order(n);
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int r = temp % 10;
            sum += power(r, digits);
            temp = temp / 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------- Armstrong Number Check --------------------");
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        if (armstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        sc.close();
    }
}