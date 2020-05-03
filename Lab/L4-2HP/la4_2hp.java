
/**
 * This program is the main method of a number game in which there are two levels with varying difficulties and allows the user
 * to choose between subtraction or addition problems
 * 10/17/2017
 * Harrison Pierce
 * lab 4_2
 */
import java.util.Scanner;
public class la4_2hp
{
	public static void main(String[] args) // main method
	{
		Scanner input = new Scanner(System.in); //create scanner object
	
		
                char plusminus; //create variable used for user choice of equation operator
                int level; //create variale used for user choice of level
		
		
                Random1hp R1 = new Random1hp();  //create object for level 1
                Random2hp R2 = new Random2hp();  //create object for level 2
                
		 
		System.out.print("Enter '1' for level 1, or '2' for level 2: "); //Asks user for their preference of difficulty(level)
		level = input.nextInt();                                         //User input saved
						                                          
                System.out.print("Enter '+' for plus or '-' for minus: ");       //Askes user for equation operator preference
                plusminus = input.next().charAt(0);                              //user input saved
                
                if(level == 1)                                                   //if the user chooses level 1, this if statement is entered
                {
                    R1.plusorminus(plusminus);                                   //invoke level 1 and pass user operator preference
                }
		if(level == 2)                                                   //if the user chooses level 2, this if statement is entered
                {
                    R2.plusorminus(plusminus);                                   //invoke level 2 and pass user operator preference
                }
		
		
	}
}