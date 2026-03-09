package $2_Access_Modifier.$_Package_1;

class Addition {
	public static int add(int a, int b) {
		return a + b;
	}
}
//Where allowed:
//✔ Same class
//✔ Same package
//✔ Other packages
//✔ Subclasses

public class _1_Public {
	public static void main(String args[]) {
		System.out.println(Addition.add(10,18));
	}
}
