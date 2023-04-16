package polymorphism;

public class MethodOverriding_1 {
	
	public void getName() {
		System.out.println("my name is Saif");

	}
	
	public void getSalary() {
				System.out.println(100000);

	}
	
	public void getDouble() {
		System.out.println(100);

	}
	public static void main(String[] args) {
		MethodOverriding_1 obj = new MethodOverriding_1();
		obj.getName();
		obj.getSalary();
		obj.getDouble();
	}
	
}
