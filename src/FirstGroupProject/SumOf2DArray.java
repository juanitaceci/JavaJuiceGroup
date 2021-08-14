package FirstGroupProject;

public class SumOf2DArray {

	public static void main(String[] args) {


		/*
		 * 1.Create a 2D array of integer values. 
		 * Print the sum of all numbers
		 */
		
		int sum=0;
		int[] numbers = {10,25,75,45,8};
		for (int i=0; i <numbers.length; i++) {
			sum=sum+numbers[i];
		}
		System.out.println("The sum of the array "+sum);
	
	
	}

}
