import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWrite {
	
	//Method to return full name of student in uppercase letters.
	public static String fullName(String first, String last) {
		first = first.toUpperCase();
		last = last.toUpperCase();
		String fullName = (first + " " + last);
		
		return fullName;
	}
	
	//Method to calculate the average of a student's homework.
	public static double averageMark(int hw1, int hw2, int hw3) {
		double average = (hw1 + hw2 + hw3) / 3;
		return average;
	}
	
	//Determine letter grade of student.
	public static String grade(int hw1, int hw2, int hw3) {
		double average = averageMark(hw1, hw2, hw3);
			
		if (average >= 90) {
			return "A";
			}
			
		if ((average >= 80) && (average < 90)) {
			return "B";
			}
			
		 if ((average >= 70) && (average < 80)) {
			return "C";
			}
			
		if ((average >= 60) && (average < 70)) {
			return "D";
			}
		
		if (average < 60) {
			return "FAIL";
		}
		
		return null;
	}

	//Writes all results inside a file.
	public static void writeFile(String fileName, String fullName, double average, String grade) throws FileNotFoundException {
		
		fileName = "D: Alex_Lab11.txt";
		File file = new File(fileName);
		PrintWriter fileWriter = new PrintWriter(file);
		
		fileWriter.println("Student Name: " + fullName);
		fileWriter.printf("Average: %.2f", average);
		fileWriter.printf("\nGrade: " + grade);
		
			fileWriter.flush();
			fileWriter.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "D: Alex_Lab11.txt";
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter first name: ");
				String first = sc.nextLine();
				
			System.out.println("Enter last name: ");
				String last = sc.nextLine();
				
			System.out.println("Enter grade for last three home works: ");
				int hw1 = sc.nextInt();
				int hw2 = sc.nextInt();
				int hw3 = sc.nextInt();
				
		writeFile(fileName, fullName(first, last), averageMark(hw1, hw2, hw3), grade(hw1, hw2, hw3));
		
		System.out.println("The file Alex_Lab11 was created.");
		
		sc.close();

	}

}
