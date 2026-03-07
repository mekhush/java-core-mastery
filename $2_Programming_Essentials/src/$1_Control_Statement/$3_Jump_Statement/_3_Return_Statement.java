package $1_Control_Statement.$3_Jump_Statement;

public class _3_Return_Statement {
	public static int calculateSum(int num1, int num2) {
		System.out.println("Calculating the sum of " + num1+ " and "+ num2);
		int sum = num1 + num2;
		System.out.println("The sum is: "+ sum);
		
		// Return the calculated sum
		return sum;
		
		// Note: Any code after the 'return' statement will
        // not be executed. But "Final" is an exception in
        // the case of try-catch-final block.
        // System.out.println("end"); // error : unreachable
        // statement
	}
	
	public static void main(String args[]) {
		int result =calculateSum(10,18);
		
		System.out.println(result);
	}
}
