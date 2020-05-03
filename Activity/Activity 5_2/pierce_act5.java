/************
 * Harrison Pierce
 * 10//25/17
 * This program asks user for 2 numbers then allows them to choose what type of calculation
 * the would like to perform. The calculation is then completed and printed out.
 */
import java.util.Scanner;
public class pierce_act5
{
        
    public static void main(String[] args)
{

pierce_act5Testing calculation = new pierce_act5Testing(); //create object for testing class

calculation.getAsk();                                       //call getAsk method to have user enter desired variables
calculation.tostring();                                     // call tostring method and print the calculation

System.out.println(calculation);                            //included in the instructions.

}

}