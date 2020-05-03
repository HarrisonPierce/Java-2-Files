/************
* Harrison Pierce
* Date: 10/27/17
* This program
*****/
import java.util.ArrayList;
import java.util.Scanner;
public class Activity11_hp
{
	public static void main(String[] args)
	{
		
            char yesno;
            int loop = 0;
            int delete;
                Scanner input = new Scanner(System.in);       //Create Scanner Object
                ArrayList<String> phonebook= new ArrayList <String>();  //Create ArrayList object 
                
                
                phonebook.add("List 1: \n Name: Andrew Jung Phone Number: 757-888-8888 \n");
                phonebook.add("List 2: \n Name: Michael Summers Phone Number: 757-999-9999\n");
                phonebook.add("List 3: \n Name: Whitney Wright Phone Number: 757-111-1111\n");
                phonebook.add("List 4: \n Name: Alexander Jones Phone Number: 757-222-2222\n");
                phonebook.add("List 5: \n Name: Robert Newmaster Phone Number: 757-333-3333\n");
                phonebook.add("List 6: \n Name: Chris Jester Phone Number: 757-444-4444\n");
                phonebook.add("List 7: \n Name: Heather Garn Phone Number: 757-555-5555\n");
                phonebook.add("List 8: \n Name: Jared Cook Phone Number: 757-666-6666\n");
                phonebook.add("List 9: \n Name: Gregry Umfleet Phone Number: 757-777-7777\n");
                phonebook.add("List 10: \n Name: Nicolas Phone Number: 804-221-2121\n");
                
               
                while(loop == 0)        //loop while the user wishes to continue
                {
                System.out.println(phonebook);
                
                
                System.out.print("Do you have any item to delete? (Y for yes N for no)---> ");
                yesno = input.next().charAt(0);
                System.out.println();
                switch(yesno)       //if the user wishes to continue the program continues
                {
                    case 'Y': loop = 0; break;
                    case 'N': loop = 1; break;
                    default: System.out.println("Error...Try again");
                }
                if(loop ==0){
                System.out.print("Enter list item to delete: ");
                delete = input.nextInt();
                
                phonebook.remove(delete - 1);     //deletes the selected list
                }
                }
         }
}