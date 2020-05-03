/****
Harrison Pierce
9/22/2017
This program calculates the average of math, science, and the total class average.
***/
import java.util.Scanner;
public class activity4hp
{
	public static void main(String[] args)
	{ 
	Scanner input = new Scanner(System.in);

	double total = 0;
	double sciavg = 0;
	double mathavg = 0;
	double avg[] = {0,0};
	int row = 0;
	int column = 0;

	double[][] mathsci;
	mathsci = new double[][] {  	{80.5, 25.5},
					{100,  92.5},
					{75.0, 65.5},
					{82.3, 79.6},
					{35.9, 22.7},
					{73.6, 66.2},
					{88.9, 98.7},
					{46.2, 62.3},
					{100,  100},
					{97.8, 99.5} 
				   };
		for(column = 0;column <= 1;column++)
		{

		 for(row = 0;row <= 9;row++)		
			{
			 avg[column] = avg[column] + mathsci[row][column];
			} 
		}

	

	double avgtotal = (avg[1] +avg[0])/20;

	System.out.printf("Math Total:%.2f",avg[0]);
	System.out.println();
	System.out.printf("Math Average:%.2f",avgtotal);
	System.out.println();
	System.out.printf("Science Total:%.2f",avg[1]);
}
}