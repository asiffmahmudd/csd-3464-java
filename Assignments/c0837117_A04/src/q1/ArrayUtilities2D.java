package q1;

/*
 * Name: Asif Mahmud
 * Assignment: 4
 * ID: C0837117
 * Date: 3/12/2022
 */

public class ArrayUtilities2D {
	
	public static enum SearchCriteria {MAX, MIN};
	/**
	 * Calculate sum of all elements in a two-dimensional array
	 * @param arrray2D Two-dimensional array storing double values
	 * @return Sum of all elements inside provided 2D array 
	 * frequency in given word 
	 */
	public static double sumArray(double array2D[][]) {
		double sum = 0;
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				sum += array2D[i][j];
			}
		}
		
		return sum;
	}
	
	/**
	 * Return the result of multiplying all elements in a two- 
	 * dimensional array
	 * @param arrray2D Two-dimensional array storing double values
	 * @return Result of multiplying all elements inside provided 2D
	 * array 
	 */
	public static double multiplyArray(double array2D[][]) {
		double multiply = 1.0;
		
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				multiply *= array2D[i][j];
			}
		}
		
		return multiply;
	}
	
	/**
	 * Returns the max/min value from the provided 2D array
	 * @param array2D Two-dimensional array containing double values
	 * @param criteria Value from SearchCriteria enum indicating if 
	 * you are searching for MAX or MIN value in 2D array
	 * @return Maximum/minimum value of two-dimensional array
	 */
	public static double searchArray(double[][] array2D, SearchCriteria criteria){
		double result;
		if(criteria == SearchCriteria.MAX) {
			result = Integer.MIN_VALUE;
		}
		else {
			result = Integer.MAX_VALUE;
		}
			
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				if(criteria == SearchCriteria.MAX && result < array2D[i][j]) {
					result = array2D[i][j];
				}
				else if(criteria == SearchCriteria.MIN && result > array2D[i][j]){
					result = array2D[i][j];
				}
			}
		}
		
		return result;
	} 
	
	/**
	 * Returns a boolean value indicating if two two-dimensional
	 * arrays are equal. Arrays are equal if they are of the same
	 * size and contain the same contents.
	 * @param array2dOne First 2D array containing doubles
	 * @param array2dTwo Second 2D array containing doubles 
	 * @return true if two arrays are equal, false otherwise
	 */
	public static boolean equals(double array2DOne[][], double array2DTwo[][]) {
		if(array2DOne.length != array2DTwo.length) {
			return false;
		}
		
		for(int i = 0; i < array2DOne.length; i++) {
			if(array2DOne[i].length != array2DTwo[i].length) {
				return false;
			}
			for(int j = 0; j < array2DOne[i].length; j++) {
				if(array2DOne[i][j] != array2DTwo[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	/**
	 * Returns the sum of the specified column should the column
	 * exist, returns 0 otherwise
	 * @param array2D Two-dimensional array containing double values
	 * @return Sum of all the elements in the specified column of the
	 * 2D array
	 */
	public static double sumColumn(double array2D[][], int col) {
		if(array2D.length > 0 && (col < 0 || col >= array2D[0].length)) {
			return 0;
		}
		
		double sum = 0;
		for(int i = 0; i < array2D.length; i++) {
			sum += array2D[i][col];
		}
		
		return sum;
	}
	
	 /**
	 * Returns the sum of the specified row should the row
	 * exist, returns 0 otherwise
	 * @param array2D Two-dimensional array containing double values
	 * @return Sum of all the elements in the specified row of the
	 * 2D array
	 */
	public static double sumRow(double array2D[][], int row) {
		if(row < 0 || row >= array2D.length) {
			return 0;
		}
		
		double sum = 0;
		for(int i = 0; i < array2D.length; i++) {
			sum += array2D[row][i];
		}
		
		return sum;
	}
	
	
}
