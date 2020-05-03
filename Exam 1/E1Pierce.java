//Harrison Pierce
//10/18/2017
//This program calculates the profits of a metchandise store.
//Exam 1

import java.util.Scanner;

public class E1Pierce
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        E1Pierce_Testing Test = new E1Pierce_Testing(); //Create object for testing
         
        int loop = 0;
        
      while(loop == 0)                  //loop if user wants to continue
      {        
        Test.setAll();                  //call set method
        Test.getSaleprice();            //call sale price method
           
        
       System.out.println("             Profit Calculation for " + Test.articlename);
       System.out.println("-------------------------------------------------------------------------");
       System.out.println("   Unit Price     Sales Price    Sales Tax   Number to be sold   Actual Profit");
       System.out.println("   "+ "$" + Test.unitprice+ "           " + "$" + Test.salesprice + "           " + "%" +Test.tax + "     " + Test.numbersold + "                    "+"$" + Test.getProfit());
   
      System.out.print("Would you like to calculate another? y for Yes y for No --> ");     
              char yesno = input.next().charAt(0);
      
    switch(yesno){
        case 'y': loop = 0;
                break;
        case 'n': loop = 1;
                break;
          
      }
    
    
    }
    
    
    
}
}