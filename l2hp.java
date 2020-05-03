/************************
Harrison Pierce
9/20/2017
this program outputs employee's salary for a week and displays how many employees earned specific amounts.

its 1:16am, 9/22 and I have been working on this 
since I sat down at my computer around 8pm. I have to get up early. goodnight.
*****************/
import java.util.Scanner;
public class l2hp
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);

	


	double base = 200; 					//base pay
	double comrate = .09;					//9% rate of commision
	double gross = 0;					//gross pay
	double[] employeenum = new double[9]; 			//array with 8 section for 8 the possible pay categories
	double sal; 						//salary pay
	//int a;

	

	while(gross != -1)					//sentinal loop for entering sales
	{							
	
	System.out.print("Enter Gross Sales or -1 to quit: ");
	gross = input.nextInt();
	if(gross == -1)
	break;
	
	sal = base + (gross * comrate);

	if(sal > 1000)
	{
	employeenum[8] += 1;
	}
	System.out.println("Total Salary: $"+ sal);
	
	sal = sal /= 100;		//makes salery into a much smaller number
	
 
		for(int i = 1; i < 10;)
	  	{
			
		for(int a = 0; a <= employeenum.length;a++)
		{
	   		
			i++;
			int b = i + 1;	  
			
			if(sal >= i && sal < b)
			employeenum[a] += 1;


	   	}

			
		}
	}
			System.out.println();
			System.out.println("Salary Range: Total:");
			System.out.println("$200-299		" +employeenum[0]);
			System.out.println("$300-399		" +employeenum[1]);
			System.out.println("$400-499		" +employeenum[2]);
			System.out.println("$500-599		" +employeenum[3]);
			System.out.println("$600-699		" +employeenum[4]);
			System.out.println("$700-799		" +employeenum[5]);
			System.out.println("$800-899		" +employeenum[6]);
			System.out.println("$900-999		" +employeenum[7]);
			System.out.println("$1000+			" +employeenum[8]);

}
}


