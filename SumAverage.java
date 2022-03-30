/* Alex Walker
 * CS110
 * Lab 10 Problem 1
 */
public class SumAverage {

	public static void main(String[] args) {
		
		int[] numbers = {12, -9, 10, -5, -2, 5, 19, -9, 8, 17};
			
			int sum = 0;
			double average = 0.0;
			int arrayLength = numbers.length;
			
				for (int i = 0; i < arrayLength; i++) {
					sum = sum + numbers[i];
				}
				
					System.out.println("The sum is: " + sum);
					
						average = (double)sum / arrayLength;
						
							System.out.println("The average is: " + average);

	}

}
