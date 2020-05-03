//Harrison Pierce
//10/11/2017
//This program 
import java.util.Scanner;
public class activity14_hp 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
   try{                     
      int numerator = 10;
      int denominator = 0;
      System.out.println("Before the attempt to divide by zero.");
      System.out.println(numerator / denominator);
      System.out.println("This text will not be printed.");
   }
   
           catch (ArithmeticException e) {      //set catch
      System.out.println(e.getMessage());         //print getmessage
      e.printStackTrace();                      //print stack trace message
            
    }
       
       
   }
}


