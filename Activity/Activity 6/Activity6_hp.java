import java.util.Scanner;
public class activity6_hp
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
			
				
		System.out.print("Enter Radius: ");
		double userradius = input.nextDouble(); //assigns user radius
		
			circle radius = new circle(userradius); // constructor object which is automatically initialized with the previously entered user input for radius
			
		
	
	
		System.out.printf("Area if the circle is %f %n", radius.getArea());									//Prints radius from the getArea method
		System.out.printf("The diameter of the circle is: %f %n", radius.getDiameter());					//Prints the diameter from getDiameter method
		System.out.printf("The circumference of the circle is: %f %n", radius.getCircumference());			//Prints circumference from getCircumference method
	
	
	
	}
}