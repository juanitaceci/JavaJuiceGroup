package FirstGroupProject;

public class FibonacciSeries {

	public static void main(String[] args) {
		/*
		 * 6.Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */

	int [] series= {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	
	for(int s=0; s<series.length; s++) {
		System.out.println(series[s]);
	}
	
	System.out.println("------ Class Example -----");
	
	int previousNumber=0;
	int currentNumber=1;
	int sumOfPreviousAndCurrent=0;
	int numbersToGenerate=10; //Because we have 10 numbers to generate
	
	System.out.println(previousNumber);
	System.out.println(currentNumber);
	
	for(int i=0; i<numbersToGenerate-2; i++) {
		sumOfPreviousAndCurrent=previousNumber+currentNumber;
		System.out.println(sumOfPreviousAndCurrent);
		previousNumber=currentNumber;
		currentNumber=sumOfPreviousAndCurrent;
	}
	
	
	
	}

}
