/* Alex Walker
 * CS 110
 * Lab 13 Problem 1
 */
import java.util.Scanner;
public class Student extends Person {
	
	public Student() {
		super.Person();
		System.out.println("This is our student class");
	}
	
	//Return average of 2 homeworks
	public static double average(double hw1, double hw2) {
		double average = (hw1 + hw2) / 2;
		return average;
	}
	
	//Return average of 3 homeworks
	public static double average(double hw1, double hw2, double hw3) {
		double average = (hw1 + hw2 + hw3) / 3;
		return average;
	}
	
	//Print child show method
	public void show() {
		System.out.println("Child's show() method\nMethod overridding accomplished");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter salary: ");
		int n = sc.nextInt();
		System.out.println("Please enter homework marks: ");
		double hw1 = sc.nextDouble();
		double hw2 = sc.nextDouble();
		double hw3 = sc.nextDouble();
		
		Student student = new Student();
		student.salary(n);
		System.out.println("Original salary: " + n);
		student.reverse_salary(n);
		student.average(hw1, hw2);
		student.average(hw1, hw2, hw3);
		student.show();
		sc.close();
	}
}