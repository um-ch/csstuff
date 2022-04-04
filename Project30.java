import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Project30 {

	public static void main(String[] args) {
		
		try { var bufferedReader = new BufferedReader(new FileReader("shows.txt"));
		
		String show;
		
			while ((show = bufferedReader.readLine()) != null) { 
				
 
			String[] line = show.split(";");
			String showName = line[0].strip();
			String service = line[1].strip();
			
				System.out.println(showName + " can be viewed by " + service);
				
			} 
				
			bufferedReader.close();
		} catch (IOException e) {
			
			System.out.println("Error");
			
		}

		
			
	}

}
