/* Alex Walker
 * CS110
 * Lab 11 Problem 1
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fileName = "Data.txt";
		
			System.out.println("Is the file stored locally or externally?");
			String fileLocation = sc.nextLine();
			
		if (!fileLocation.equalsIgnoreCase("locally"))
		{
			System.out.println("Please provide the location of your Data.txt file");
				fileName = sc.next() + fileName;
		}
						sc.close();
		
		File file = new File(fileName);
		
		Scanner fileScan = null;
		
		try {
		
			fileScan = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Error, file not found.");
			
		}
		
		while (fileScan.hasNextLine()) {
		
			String data = fileScan.nextLine();
			
			System.out.println(data);
		}
	}
}
