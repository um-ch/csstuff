import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Project31 {

	public static void main(String[] args) throws FileNotFoundException {
		
		String[] cities = {"Charleston", "Morgantown", "Huntington" };
		
			 File citiesFile = new File("D: cities.txt");
			 
			 PrintWriter fileWriter = new PrintWriter(citiesFile);
			 
			 fileWriter.println(cities[0]);
			 fileWriter.println(cities[1]);
			 fileWriter.println(cities[2]);
			 
			 fileWriter.flush();
			 fileWriter.close();
			 
			 	System.out.println("File created successfully.");

	}
}