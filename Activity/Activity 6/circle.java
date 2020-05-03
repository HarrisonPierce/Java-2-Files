//Harrison Pierce
//This program calculates the area, diameter and circumference of a circle based on user input of radius.
//10/6/2017
import java.util.Scanner; // import scanner
public class circle		//create class
{
	//field declaration & initialization
	private double radius;
	private double PI = 3.14159;
	private double diameter;
	private double circumference;
	

	
	//constructor method and value passed from driver class set to private radius variable in this class
	
	public circle(double usersinput)
	{
		radius = usersinput;
		
	}
	//set radius method
	public void setRadius(double userinput)
	{
		radius = userinput;
		
	
	}
	//get radius method
	public double getRadius()
	{
		
		return radius;
	}
	//method which calculates the area of the circle using the radius and PI variables
	public double getArea()
	{
		double area = 3.14159 * radius * radius;	
		
		return area; //returns area to Activity6_hp class
	
	}
	//method which calculates the diameter of the circle using the given formula
	public double getDiameter()
	{
		diameter = radius * 2;
		return diameter; 		//returns diameter to other class
	}
	//method which claculates the circumference of the circle and returns it to the other class
	public double getCircumference()
	{
		circumference = 2 * PI * radius;
		return circumference;
	}
	
	
}