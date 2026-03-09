package $2_Access_Modifier.$_Package_2;

import $2_Access_Modifier.$_Package_1._4_Protected;

//File: Bike.java in package p2
public class _2_Protected extends _4_Protected {
	void showSpeed() {
		speed = 100;// allowed: subclass in different package
		System.out.println(speed);
	}
}
