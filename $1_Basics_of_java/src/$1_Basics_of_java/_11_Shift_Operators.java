package $1_Basics_of_java;

public class _11_Shift_Operators {
	public static void main(String[] args) {

        int a = 6; // 0110
        int b = 4; // 0100

        // 🔹 8. Shift Operators
        System.out.println("\nShift Operators:");

        System.out.println("Left Shift (a << 1): " + (a << 1));   // 12
        System.out.println("Right Shift (a >> 1): " + (a >> 1)); // 3
        System.out.println("Unsigned Right Shift (a >>> 1): " + (a >>> 1));
        
        System.out.println("Left Shift (b << 1): " + (b << 2));   // 12
        System.out.println("Right Shift (b >> 1): " + (b >> 3)); // 3
        System.out.println("Unsigned Right Shift (a >>> 1): " + (b >>> 2));
    }
}
