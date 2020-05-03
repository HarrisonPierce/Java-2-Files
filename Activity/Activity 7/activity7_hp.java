//Harrison Pierce
//10/12/17
//This program presents a menu of options to user and 
//calculates the area of shapes based on users choice and users measurements of their shape

import java.util.Scanner; //import scanner

public class activity7_hp //create class
	{
		
		public static void main(String[] args) 
		{
			
			Scanner input = new Scanner(System.in); //create scanner object
			
			int exit = 1; //Variable created for loop validation
			
                        while(exit != 0){ //This keeps the user in the loop until they choose to exit
			
                        System.out.println("Enter 1 to calculate circle area");     
                        System.out.println("Enter 2 to calculate rectangle area");
                        System.out.println("Enter 3 to calculate triangle area");
                        System.out.println("Enter 4 to quit");
                        System.out.print("Choice: ");                 //Explains to user what the choices are in the menu and asks for input              
			int selection = input.nextInt();              //Assigns user input value to selection for switch
			
                                         
                        
                        
                        switch(selection)       //switch created using "selection variable
			{
				case 1:
					System.out.print("Please enter a radius: ");    //Asks for radius
					double radius = input.nextDouble();             //Assigns radius
                                        
                                        System.out.println("The area of your circle is: " + geometry.areacircle(radius)); //Calls areacircle methof from geometry class and prints return value                               
                                        break; //exits switch
				case 2:
					System.out.print("Please enter a length: "); //Asks for length of rectangle
					double length = input.nextDouble();          //Assigns length variable
                                       
                                        
                                        System.out.print("Please enter a width: "); //Asks for width of rectangle
                                        double width = input.nextDouble();          //Assigns width variable
                                      
                                       
                                        System.out.println("The area of your rectangle is: " + geometry.arearect(length, width)); //Calls arearect method and displays the returned value
                                        break; //exits switch
				case 3:
                                        System.out.print("Please enter base: "); //Asks for base
                                        double base = input.nextDouble();        //Assigns base
                                     
                                        
                                        System.out.print("Please enter height: "); //Asks for height
                                        double height = input.nextDouble();        //Assigns height
                                 
                                        
                                        System.out.println("The area of your triangle is: " + geometry.areatri(base, height)); //Calls areatri method and displays the returned value                                                                              
                                        break;
                                case 4: 
					exit = 0; //Assigns 0 to exit variable which breaks the while loop and allows for the user to quit the program
                                        break;                  //Exits case 4      
                               
                                default:    
                                        System.out.println("ERROR"); //displays error message if the user enters an invalid selection for a menu choice
                                        break;
                        }
                        }
						
                }
		}