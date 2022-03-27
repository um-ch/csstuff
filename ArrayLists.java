import java.util.ArrayList;

public class ArrayLists { 
	
	public static void main(String[] args) {
		
		System.out.println("Contents of array list displayed: ");
		
			ArrayList<String> favFoods = new ArrayList<String>(); {
			
			favFoods.add("Popcorn");
			favFoods.add("Chicken");
			favFoods.add("Icecream");
			favFoods.add("Pizza");
			favFoods.add("Hamburgers"); 
	
				for (int i = 0; i < favFoods.size(); i++) {
					System.out.println(favFoods.get(i));
			}
		}
	}
}

