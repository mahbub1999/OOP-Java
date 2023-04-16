package Inheritance;

public class InterfaceMain implements InterfaceA, InterfaceB {

	public void getInterfceB() {
System.out.println("A..");		
	}

	public void getProA() {
		System.out.println("B");
	}

	public void getPropertyB() {
		System.out.println("C..");		
		
	}
	
	
	public static void main(String[] args) {
		InterfaceMain obj = new InterfaceMain();
		obj.getProA();
		obj.getPropertyB();
		obj.getInterfceB();
	}
}