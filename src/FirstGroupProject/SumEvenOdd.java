package FirstGroupProject;

public class SumEvenOdd {

	public static void main(String[] args) {


		/*
		 * Create a 2D array of integers. Develop a program which will calculate
		 *  the sum of even and odd numbers for that array.
		 */
		
		int arr[][] = {{ 22, 32, 44, 57, 69,78 },{45,65,58,95}};
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
        	for(int j=0; j<arr[i].length; j++)
        	if (i % 2 == 0)
                even += arr[i][j];
        	else
                odd += arr[i][j];
        }
        System.out.println("sum of even " + even);
        System.out.println("sum of odd " + odd);

		
	}

}
