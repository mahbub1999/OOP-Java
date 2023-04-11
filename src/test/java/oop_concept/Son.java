package oop_concept;

public class Son extends Parent {

	public void getSonProperty() {
		
		System.out.println("I need my fathers and Grand Parents property");
	}
	public static void main(String[] args) {
		Son obj = new Son();
		obj.getSonProperty();
		obj.getFathersProperty();
		obj.getGrandParentProperty();
	}

	
	}
