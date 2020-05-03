//Harrison Pierce
//12/15/2017
//This program
import javax.swing.*;
public class activity24_hp {
    
    public static void main(String[] args){
        
       double total = 0; 
       int i = 0;
       String name;
       String strinput;
       String strinput2;
       double tender;
       int repeat;
       String username;
       double[] price = new double[50];
       double change;
       
       
       username = JOptionPane.showInputDialog("Enter your name.");
       
       do{
             name = JOptionPane.showInputDialog("Enter Item name"); 
             
            strinput = JOptionPane.showInputDialog(null,"Enter price of ", name);
            price[i] = Double.parseDouble(strinput);
             
            i++;
            
       repeat = JOptionPane.showConfirmDialog(null, "Enter another Item?", "confirm", JOptionPane.YES_NO_OPTION);
       }while( repeat==JOptionPane.YES_NO_OPTION);
      
       for(i = 0; i < price.length;i++)
       {
           total = total + price[i];
       }
    
   
       JOptionPane.showMessageDialog(null, "The total price is " + total);
     
       strinput2 = JOptionPane.showInputDialog(null,"Enter money tendered ");
       tender = Double.parseDouble(strinput);
       
       change = tender - total;
       
       JOptionPane.showMessageDialog(null, "The change is " + change);
}
}