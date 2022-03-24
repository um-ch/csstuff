
public class Project26 {

	public static void main(String[] args) {
		
		int sum = 1;
		
		int[] myArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
		
			for (int i = 1; i < myArray.length; i++) {
				sum += myArray[i];
			}
			
				System.out.println("Sum is " + sum);
	}

}
