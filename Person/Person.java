/* Alex Walker
 * CS110
 * Lab 13 Problem 1
 */
public class Person {
	
	public void Person() {
		System.out.println("This is our person class.");
	}
	
	//Method to print whether salary is even or odd
	public void salary(int n) {
		if (n % 2 == 0) {
			System.out.println("Salary is even");
		}	
		else {
			System.out.println("Salary is odd");
		}
	}

	//Method to reverse digits of a number
	public static void reverse_salary(int num) {
		int reverse = 0;
		while(num != 0) {
			int r = num % 10;  
			reverse = reverse * 10 + r;  
			num = num / 10;  
		}
		System.out.println("Salary in reverse: " + reverse);
	}
	
	//Print parent method
	public void show() {
		System.out.println("Parent's show() method");
	}
}