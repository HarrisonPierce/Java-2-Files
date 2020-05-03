//Harrison Pierce
//10/18/2017
//This program calculates the profits of a metchandise store.
//Exam 1

import java.util.Scanner;
public class E1Pierce_Testing 
{


  Scanner input = new Scanner(System.in);
  
    

       double tax;     
       int numbersold;
       double unitprice;
       String articlename = null;
       double salesprice;
       double profit;  
       
    E1Pierce_Testing(){
       
       tax = .05;   
    }

    public void setAll() {
        
        System.out.println("Article name: ");
        articlename = input.nextLine();
       
        System.out.println("Enter unit Price: ");
        unitprice = input.nextDouble();
    
        System.out.println("Expected number of article to be sold: ");
        numbersold = input.nextInt();

    }

    public void getSaleprice() {
       
        salesprice = (unitprice * 2) + (unitprice * tax);

    }

    public double getProfit() 
    {
        profit = (salesprice - unitprice) * numbersold;
        
        return profit;
    }

}
