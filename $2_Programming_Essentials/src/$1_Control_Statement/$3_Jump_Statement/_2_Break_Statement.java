package $1_Control_Statement.$3_Jump_Statement;

public class _2_Break_Statement {
	public static void main(String args[]) {
		
		// Using Break Statement to exit a loop
		for(int i=0; i<100;i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		//Use Break as a form of goto
		for(int i=0; i<3;i++) {
			one:{
				two:{
					three:{
						System.out.println("i="+i);
						if(i==0)
							break one;
						if(i==1)
							break two;
						if(i==2)
							break three;
					}
					System.out.println("After label three");
				}
				System.out.println("After label two");
			}
			System.out.println("After label one");
		}
	}
}
