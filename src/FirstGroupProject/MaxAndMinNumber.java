package FirstGroupProject;

public class MaxAndMinNumber {



		static int getMin(int arr[], int n)
		{
			int num = arr[0];
			
			for (int i = 1; i < n; i++)
				num = Math.min(num, arr[i]);
			return num;
		}
		
		static int getMax(int arr[], int n)
		{
			int res = arr[0];
			
			for (int i = 1; i < n; i++)
				res = Math.max(res, arr[i]);
			return res;
		}
		public static void main (String[] args)
		{
			int arr[] = { 24, 10, 1738, 69, 1 };
			int num2 = arr.length;
			System.out.println( "Minimum number in the array "+ getMin(arr, num2));
			System.out.println( "Maximum number in the array "+ getMax(arr, num2));
		
		System.out.println("------------- Class Example ----------");
		
		int [] array= {10,5,3,-5,15};
		int largest=array[0];
		int smallest=array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		if(array[i]<smallest) {
			
		}
		}
		System.out.println("Largest Number is ="+largest);
		
		
		
		
		
		
		
		}


	}


