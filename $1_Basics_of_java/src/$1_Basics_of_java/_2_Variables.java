package $1_Basics_of_java;

public class _2_Variables {
	String instance = "Hello Kushal..!";
	static String staticVariable = "This is static..";
	public static void main(String[] args) {
		_2_Variables obj = new _2_Variables();
		
		String local = "This is local variable";
		
		System.out.println("To access instance variable we have to create object ");
		System.out.println("This is Instance Variable output : " + obj.instance);
		System.out.println("This is Static Variable output : " + staticVariable);
		System.out.println("This is Local Variable output : " + local);
		
		
	}

}
