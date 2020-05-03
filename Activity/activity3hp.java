//Harrison Pierce
//9/14/2017

public class activity3hp
{
	public static void main(String[] args)
	{


	System.out.println("All even numbers from 0 to 20 in an array");
	System.out.println("Element #	Value");


	int value[] = {2,4,6,8,10,12,14,16,18,20};
	int counter = 0;
	int total = 0;
	for(int i = 0;i < 10;i++)
	{

	System.out.print(counter);
	counter++;
	
	

	System.out.println("		" +value[i]);

	total = total + value[i];	

	}	
	System.out.print("The total is " +total);
	}
}