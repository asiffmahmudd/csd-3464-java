package q1;

/*
 * Name: Asif Mahmud
 * Assignment: 4
 * ID: C0837117
 * Date: 3/12/2022
 */

public class ArrayUtilities2DTester {

	public static void main(String[] args) {
		double[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] arr3 = {{9,8,7}, {6,5,4}, {3,2,1}};
	
		System.out.println(ArrayUtilities2D.sumArray(arr1));
		System.out.println(ArrayUtilities2D.multiplyArray(arr1));
		
		System.out.println(ArrayUtilities2D.equals(arr1, arr2));
		System.out.println(ArrayUtilities2D.equals(arr1, arr3));
		
		System.out.println(ArrayUtilities2D.sumRow(arr1, 2));
		System.out.println(ArrayUtilities2D.sumColumn(arr1, 0));

		System.out.println(ArrayUtilities2D.sumColumn(arr1, 3));
		System.out.println(ArrayUtilities2D.sumRow(arr1, -1));
		
		System.out.println(ArrayUtilities2D.searchArray(arr3, ArrayUtilities2D.SearchCriteria.MAX));
		System.out.println(ArrayUtilities2D.searchArray(arr3, ArrayUtilities2D.SearchCriteria.MIN));
	}

}
