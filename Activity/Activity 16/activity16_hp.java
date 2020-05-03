//Harrison Pierce
//11/20/2017
//This program 

import java.util.Scanner;
public class activity16_hp
{

    public static void main(String[] args) 
    {
        String name;
        int EmpNum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Name: ");
        name = input.nextLine();
        
        System.out.println("Employee Number: ");
        EmpNum = input.nextInt();
        
        ospitalemployee hospemp = new hospitalemployee(name, EmpNum);
        
        
        
        doctor doc = new doctore();
        
        

    }
}
