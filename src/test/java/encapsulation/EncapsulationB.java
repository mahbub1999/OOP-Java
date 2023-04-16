package encapsulation;

public class EncapsulationB extends EncapsulationA {

	

	public static void main(String[] args) {
		EncapsulationB obj = new EncapsulationB(); // not came out this property because I protected/assign its getter
													// methods as private
			obj.getX();
	}
}
