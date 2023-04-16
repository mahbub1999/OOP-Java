package abstraction;

public class AbcMahbub {
	 String dinner = "soup";
	    
		public void getBreakfast() {
			System.out.println("This is ABSTRACT method. For breakfast we are serving ");		
		}

		public void getDinner() {
			System.out.println("This is CONCRETE METHOD. For dinner we are serving "+dinner);
		}
		
		public static void main(String[] args) {
			AbcMahbub obj = new AbcMahbub();
			obj.getBreakfast();
		//	obj.getLunch();
			obj.getDinner();
		}
		
	}

