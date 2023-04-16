package array_loop;

public class ArrayAndLoopPractice {

		// 1, 2, 3, 4, 5, 6,
		// 2 2, 3, 4, 5, 6,
		// 3 7, 8, 9, 9, 4,
		// 4 3, 5, 6, 7, 8,

		
	
			// obj.getMultiDimensionArray();
			// How many types of array in java?
			// Ans: There are many types of array in java
			// ex: Single Dimension Array []
			// Multi Dimension Array [][]
			// Why is require Single Dimension Array[]?
			// Ans: In order to read single row or
			// single column data than we have to use Single Dimension Array []
			// Why is require Multi Dimension Array[][]?
			// Ans: In order to read multiple row and multiple column we have to use
			// Multi Dimension Array[][]

			// How to declare array in java?



		public void getSingleDimensionArray() {
			int num[] = { 1, 2, 3, 4, 5, 6, 7,8,9,10 };
			System.out.println(num.length);
			System.out.println(num[6]);

			// System.out.println(Arrays.toString(num));
			// String name = "1, 2, 3, 4, 5, 6, 7";
			// System.out.println(name);
			// How to declare the basic or for loop?

			//for (int i = 0; i < num.length; i++) {
				// System.out.println(num[i]);
				//System.out.println(i);
		//	}
			// Advance loop
		//	for (int newNum : num) {
				//System.out.println(newNum);
		//	}

			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			
			}

		}

		public void getMultiDimensionArray() {
			// Column 0 1 2 3 4 5 6
			int num[][] = { { 1, 2, 3, 4, 5, 6, 7 }, // row num 0
										{ 1, 2, 0, 4, 5, 7, 8 }, // row num 1
										{ 1, 2, 3, 4, 5, 99, 7 },
										{ 00,11,22,55,77, 88}}; // row num 2
			System.out.println(num[2][5]); //
			// System.out.println(Arrays.toString(num));

		}

		
		public static void main(String[] args) {
			ArrayAndLoopPractice obj = new ArrayAndLoopPractice();
			obj.getSingleDimensionArray();
			obj.getMultiDimensionArray();

		
		}
}
