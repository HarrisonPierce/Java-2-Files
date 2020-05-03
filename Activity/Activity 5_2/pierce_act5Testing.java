/************
 * Harrison Pierce
 * 10//25/17
 * This program asks user for 2 numbers then allows them to choose what type of calculation
 * the would like to perform. The calculation is then completed and printed out.
 ***/
import java.util.Scanner;
public class pierce_act5Testing
{
    Scanner input = new Scanner(System.in);
    
    int num1;           //declare first number variable
    int num2;           //declare second number variable
    char operator;      //declare char variable used for user operator selection
    int calc;           //declare variable for calculation
    
    
    
    public pierce_act5Testing() //constructor method, sets all initial values equal to zero
    {
        int num1 = 0;
        int num2 = 0;
        char operator = 0;
        int calc = 0;
    }
    
    public void getAsk()    //asks user for first and second numbers and calls distribute method
    {
     System.out.println("Enter the first number: ");
     num1 = input.nextInt();                            //set num1
     System.out.println("Enter the second number: ");
     num2 = input.nextInt();                            //set num2
     
     Distribute();              
    }
    public void Distribute()    //this method asks user to choose and operator for the equation using a switch and .charAt
    {
        System.out.println("Please choice an operator");
        System.out.println("'A' addition");
        System.out.println("'S' Subraction");
        System.out.print("'M' Multiplication --->");
        operator = input.next().charAt(0);              //set operator equal to the users input
        
        switch(operator)            //this switch takes the user input and calls the method according to the users desired operation type
        {
            case 'A': CalAdd(); //call CalAdd method
                break;
            case 'S': CalSub(); //Call CalSub method
                break;
            case 'M': CalProduct(); //Call CalProduct method
                break;
        }
          
    }
    public void CalAdd()    //this method adds the two user defined numbers
    {
        calc = num1 + num2;
    }
    public void CalSub()    //this method subtracts the first user defined number from the second
    {
        calc = num1 - num2;
    }
    public void CalProduct()    //this method multiplies the first user defined number with the second
    {
        calc = num1 * num2;
    }
    public void tostring()      //this method prints the result of the calculation based on user defined numbers and desired operaton type.
    {
        System.out.println("The result of the calculation is: " + calc);
    }
    
}