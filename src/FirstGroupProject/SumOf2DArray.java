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
	
		
		
		
		
		
		System.out.println("-------- Class Example ----------");
		
		int[][] array= { {1,2,3,4,5},
			           	{10,20,30,40,50} };
	System.out.println("No. of rows in above 2D array"+" "+array.length);
	
	int sum1=0;
	
	for(int row=0; row<array.length; row++) {
		System.out.println("No. of columns in the "+row+" row ="+array[row].length);
		for(int col=0; col<array[row].length; col++) {
			
			System.out.println(array[row][col]);
			sum1=sum1+array[row][col];
			
		}
	
	}
	System.out.println("Sum ="+sum1);
	
	
	
	
	
	
	}

}
