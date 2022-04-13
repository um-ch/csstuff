import java.util.Scanner;
public class SphereTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the sphere tester!");
		
		System.out.println("Please enter the value of the sphere's diameter: ");
		int diameter = sc.nextInt();
		
		Sphere sphere = new Sphere(diameter);
		
		sphere.displayResults((diameter / 2), diameter);
		
		sc.close();
				
	}
}
