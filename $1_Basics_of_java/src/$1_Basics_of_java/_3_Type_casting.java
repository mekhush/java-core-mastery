package $1_Basics_of_java;

public class _3_Type_casting {
	float f = 1.005f;
	static double d = 22.0557d;
	public static void main(String[] args) {
		byte b = 127;
		int i = (int) b;
		
		_3_Type_casting obj = new _3_Type_casting();
		
		int type1 = (int)obj.f;
		int type2 = (int)d;
		
		
		System.out.println("To access instance variable we have to create object ");
		System.out.println("This is Narrow type casting for instance variable : " + type1);
		System.out.println("This is Narrow type casting for static variable : " + type2);
		System.out.println("This is Widening type casting for local variable : " + i);
		
		char c = 'K';
        int k = c;
        System.out.println("This is will print the character value in the integer : "+k);
	}
}
