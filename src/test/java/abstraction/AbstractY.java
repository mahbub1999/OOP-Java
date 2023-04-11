package abstraction;

public class AbstractY extends AbstractcX {

	@Override
	public void getAbstract() {
		System.out.println("Mahbub");
	}

	public static void main(String[] args) {

		AbstractY obj = new AbstractY();
		obj.getAbstract();
		obj.getName();
		obj.getSalary();
		obj.getSomething();

	}

}
