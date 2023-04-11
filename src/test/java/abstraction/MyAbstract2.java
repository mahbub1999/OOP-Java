package abstraction;

public class MyAbstract2 extends MyAbstract1 {
	// :method overriding:
	//The method must have the same name and parameter as in the parent class
	
	public void getRupi() {
		System.out.println(" I want ---");
	}
	
public static void main(String[] args) {
	MyAbstract2 obj= new MyAbstract2();
	obj.getSalary();
	obj.getDollar();
	obj.getRupi();
	obj.getTaka();
}
	
}
