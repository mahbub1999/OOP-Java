package Inheritance;

public class Parent extends GrandParent {

	public void getFathersProperty() {

		System.out.println("I want my Father Property");
	}

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.getFathersProperty();
		obj.getGrandParentProperty();

	}
}
