package encapsulation;

public class EncapsulationA {

	private String Name1 = "Symon ";
	private String Name2 = " Lisa";
	private String Name3 = "Lisa re na paile Dolly";
	private int X = 99;
	
	private String getName1() {
		return Name1;
	}
	private String getName2() {
		return Name2;
	}
	private String getName3() {
		return Name3;
	}
	public int getX() {
		return X;
	}
	
	public static void main(String[] args) {
		EncapsulationA obj = new EncapsulationA();
		// obj.getName1();
		// obj.getName2();
		// obj.getName3();
		// obj.getX();
		System.out.println(obj.getName1());
		System.out.println(obj.getName2());
		System.out.println(obj.getName3());
		System.out.println(obj.getX());

	}
	
}



