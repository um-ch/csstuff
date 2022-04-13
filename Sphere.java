public class Sphere {

	//Instance variables
	
	private double radius;
	private double surfaceArea;
	private double volume;
		
	//Constructor for Sphere
		public Sphere(int diameter) {
		}

//Method to return value of radius.	
public double radius(int diameter) {
	
	radius = diameter / 2.0;
	
		return radius;
}

//Method to return surface area of sphere.
public double surfaceArea(double radius) {
	
	surfaceArea = 4 * Math.PI * (Math.pow(radius, 2));
	
		return surfaceArea;
}

//Return volume of sphere.
public double volume(double radius) {
	
	volume = (4.0 / 3) * Math.PI * (Math.pow(radius, 3));
	
		return volume;
}

//Prints results including radius, surface area, and volume.
public void displayResults(double radius, int diameter) {
	
	System.out.println("The radius of the sphere is " + radius(diameter));
	System.out.println("The surface area of the sphere is " + surfaceArea(radius));
	System.out.println("The volume of the sphere is " + volume(radius));
}
}
