//This program calculate sales tax
//Harrison Pierce
//Activity 7
//10/20/2017
import java.util.Scanner;
public class activity7_hp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int itemnum;
       
   
    System.out.print("How many items do you have? ");
    itemnum = input.nextInt();
   
    double[] price = new double[itemnum];
    
    for(int j = 0; j < price.length; j++)
    {
        System.out.printf("Enter the price of item "+(j + 1)+ ":");
        price[j] = input.nextDouble();    
    }
       calc(itemnum, price);  
         
         
    }
    
    public static void calc(int itemnum, double price[])
    {
       
        for(int i = 0; i < itemnum;i++)
        {
           
            price[i] = (.05 * price[i]) + price[i];
       
            System.out.printf("The price of item " + (i+1) + " including tax is: " + price[i] );
            System.out.println();
        
        }
        
    }
}