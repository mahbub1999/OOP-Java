package abstraction;

public class AbstractY extends AbstractcX {

	public static void main(String[] args) {

		AbstractY obj = new AbstractY();
		//obj.getAb();
		obj.getName();
		obj.getSalary();
		obj.getSomething();

	}

	@Override
	public void getSome() {
		System.out.println("Mobile");

	}

}
