package $2_Access_Modifier.$_Package_2;

import $2_Access_Modifier.$_Package_1._4_Protected;

public class _3_Protected_Test {
	public static void main(String[] args) {
		_2_Protected obj = new _2_Protected();
		obj.showSpeed();// prints 100
		
		_4_Protected obj2 = new _4_Protected();
		 //System.out.println(obj2.speed); // ERROR: cannot access protected outside package & non-subclass
	}
}
