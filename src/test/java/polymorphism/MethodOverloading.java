package polymorphism;

public class MethodOverloading {

	public void getName(String name) {
		System.out.println(name);

	}

	public void getName(int salary) {
		System.out.println(salary);

	}

	public void getName(double bonus ){
			System.out.println(bonus);

	}
	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.getName("my name is Mahbub");
		obj.getName(100000);
		obj.getName(100);
		

	}
}