package $1_Basics_of_java;

public class _10_BitWise_Logical_operation {
	public static void main(String[] args) {

        int a = 6; // 0110
        int b = 4; // 0100

        // 🔹 7. Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("a = 6 (0110), b = 4 (0100)");

        System.out.println("Bitwise AND (a & b): " + (a & b)); // 4
        System.out.println("Bitwise OR  (a | b): " + (a | b)); // 6
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); // 2
        System.out.println("Bitwise NOT (~a): " + (~a));      // -7


    }
}
