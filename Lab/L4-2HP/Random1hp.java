
/**
 * This program is the first level of the math game la4_hp which calculates the sum of
 * two random numbers between 0 and 10 and asks the user to enter the correct answer.
 * the number of correct and incorrect answers are tallied and displayed at the end of the game
 * 
 * 10/17/2017
 * Harrison Pierce
 */
import java.util.Scanner;
import java.util.Random;
public class Random1hp
{
                Scanner input = new Scanner(System.in);             //create scanner object

        
                int num1;                                           //random number 1
                int num2;                                           //random number 2
                int userinput;                                      //user input when asked for sum
                int correct = 0;                                    //records the number of correct answers
                int incorrect = 0;                                  //records the number of incorrect answers
                
                public void randomgen()                             //This method generates random numbers between 0 and 10 and sets them equal to appropriate variables
                {
                    Random rand = new Random();                     //create random object
                    num1 = rand.nextInt(11);                        //generate and set num1
                    num2 = rand.nextInt(11);                        //generate and set num2
                  
                                  
                }
                
                
                public void plusorminus(char selection)             //this method user the user selected operator to select which method will be invoked using a switch
                {
                  
                switch(selection)                                   //switch is initialized and user selection is passed through
                {
                    case '+': additionhp();                         //addition method is invokesd
                              break;
                    case '-': subtractionhp();                      //subtraction method is invoked
                              break;
                }
                }
                public void additionhp()                            //This method uses random numbers to ask user the sum of the two. it repeats 10 times.
                {
                 for(int addloop = 0;addloop < 10;addloop++)        //Loops 10 times asking the user a different question each time
                 {
                     randomgen();                                   //invokes the random number generation method
                     System.out.printf("%d + %d = ", num1, num2);   //Asks user the sum of the two random numbers 
                     userinput = input.nextInt();                   //assigns users entered input
                     
                     if(userinput == (num1 + num2))                 //compares users input and the actual sum of the two numbers and is activated if they are the same
                     {
                         
                         correct();                                 //invokes the correct method which adds 1 to the number of correct problems answered
                     }
                     else
                         incorrect();                               //invokes the incorrect method which adds 1 to the number of incorrect problems answered
                         
                 }
                    
                    System.out.printf("You got %d answers correct and %d incorrect.", correct, incorrect);  //displays the number of correct and incorrect answers entered by the user
                }
                
                public void subtractionhp()                         //This method uses random numbers to ask user the sum of the first minus the second. it repeats 10 times.
                {
                 for(int addloop = 0;addloop < 10;addloop++)        //Loops 10 times asking the user a different question each time
                 {
                     randomgen();                                   //invokes the random number generation method
                     System.out.printf("%d - %d = ", num1, num2);
                     userinput = input.nextInt();                   //assigns users entered input
                     
                     if(userinput == (num1 - num2))                 //compares users input and the actual sum of the two numbers and is activated if they are the same
                     {
                         
                         correct();                                 //invokes the correct method which adds 1 to the number of correct problems answered
                     }
                     else
                         incorrect();                               //invokes the incorrect method which adds 1 to the number of incorrect problems answered
                         
                 }
                    
                    System.out.printf("You got %d answers correct and %d incorrect.", correct, incorrect); ////displays the number of correct and incorrect answers entered by the user
                }
                
                   public void correct()                             //this method lets the user know their answer was correct and adds 1 to the count of correctly answered questions
                    {
                        System.out.println("Correct!");
                        correct++;
                    }
                   public void incorrect()
                   {
                       System.out.println("Incorrect!");             //this method lets the user know their answer was incorrect and adds 1 to the count of incorrectly answered questions
                       incorrect++;
                   }
}
