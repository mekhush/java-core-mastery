package $1_Control_Statement.$3_Jump_Statement;

public class _1_Continue_Statement {
	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			if(i==2) {
				System.out.println();
				// using continue keyword 
                // to skip the current iteration
				continue;
			}
			System.out.println(i);
		}
	}

}
