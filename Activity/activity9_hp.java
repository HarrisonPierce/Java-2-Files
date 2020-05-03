//This program asks the user to pick how many items they want to enter. The user can then enter the price of that item and the tax will be calculated
//Harrison Pierce
//Activity 7
//10/20/2017
import java.util.Scanner;
public class activity9_hp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int itemnum;                    //Counter for the number of items the user will enter
       
   
    System.out.print("How many items do you have? ");
    itemnum = input.nextInt();
   
    double[] price = new double[itemnum];       //Array created for the items and their prices
    
    for(int j = 0; j < price.length; j++)       //loops the amount of times the user previously specified
    {
        System.out.printf("Enter the price of item "+(j + 1)+ ": ");
        price[j] = input.nextDouble();                                  //sets the array = to the numbe specified for each individual number
    }   
       calc(itemnum, price);  //call calc class and pass itemnum variable and price array
         
         
    }
        
    public static void calc(int itemnum, double price[])        //this method calculates the price of each item with sales tax included
    {
       
        for(int i = 0; i < itemnum;i++)     //this loops the print statement for the number of items specified
        {
           
            price[i] = (.05 * price[i]) + price[i]; //calculation
       
            System.out.printf("The price of item " + (i+1) + " including tax is: " + price[i] );
            System.out.println();
        
        }
        
    }
}