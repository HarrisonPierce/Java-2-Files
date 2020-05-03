
/**
 *This program has the user input 2 numbers corresponding to  specific cities 
 *and prints the distance between them using an array.
 *
 * @author Harrison Pierce
 * 9/27/2017
 */
import java.util.Scanner;
public class l3hp
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

                int city1;	//declare variables
		int city2;

        int citydist[][] = {       {0,97,90,268,262,130}, // 2D array initializer. Contains milage between all cities.
                {97,0,74,337,144,128},
                {90,74,0,354,174,201},
                {268,337,354,0,475,269},
                {262,144,174,475,0,238},
                {130,128,201,269,238,0}}; 
 
        
 	do		//Start do while loop
       {

	    
	    System.out.println("To determine the mileage between two cities, please enter the numbers of 2 cities from this menu:");
            System.out.println("0 for Daytona Beach, 1 for Gainesville");
            System.out.println("2 for Jacksonville,  3 for Miami");
            System.out.println("4 for Tallahassee,   5 for Tampa");
            System.out.println("(input city 1 or -1 to end)");
            city1 = input.nextInt();	//Take user choice for city 1
            
	    if(city1 == -1){break;}      //if user input is -1, exit the loop
	    if(city1 < -1 || city1 > 5){ //if user enters an invalid number, ask again
                System.out.println("Error try again with a number between 0 and 5: ");
            city1 = input.nextInt();}

            System.out.println("Enter City 2: ");
            city2 = input.nextInt();
	  
	    if(city2 == -1){break;}       //if user input is -1, exit the loop
            if(city2 < -1 || city2 > 5){  //if user enters an invalid number, ask again
                System.out.println("Error try again with a number between 0 and 5: ");
            city2 = input.nextInt();}

        
            System.out.printf("The mileage between city %d and city %d is: %d ",city1, city2, citydist[city1][city2]); //Display the distance between cities chosen.
	    System.out.println();	
        
            } while((city1 != -1) ||  (city2 != -1));
            
    }
}

            
            
        
