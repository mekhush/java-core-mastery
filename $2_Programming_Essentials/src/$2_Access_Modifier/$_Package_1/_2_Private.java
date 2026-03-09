package $2_Access_Modifier.$_Package_1;

class person {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

//Where allowed:
//✔ Only same class
//
//Not allowed:
//✘ Same package
//✘ Subclass
//✘ Other package
public class _2_Private {
	public static void main(String args[]) {
		person obj = new person();
		obj.setName("Kushal");
		
//		System.out.println(obj.name); Error: 'name'
//		has private access
		System.out.println(obj.getName());
	}

}
