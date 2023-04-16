package polymorphism;

public class MethodOverriding_2 extends MethodOverriding_1 {

	public void getName() {
		System.out.println("Saif");

	}

	public void getSalary() {
		System.out.println(999);

	}

	public static void main(String[] args) {
		MethodOverriding_2 obj = new MethodOverriding_2();
		obj.getName();
		obj.getSalary();
	}
}

