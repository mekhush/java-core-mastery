package $2_Access_Modifier.$_Package_1;

class car {
	String model;
}

//Where allowed:
//✔ Same class
//✔ Same package
//
//Not allowed:
//✘ Subclass in other package
//✘ Other packages
public class _3_Default {
	public static void main(String[] args) {
		car obj =new car();
		obj.model = "TATA-punch";
		System.out.println(obj.model);
	}
}

		
