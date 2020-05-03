/*******************************
Progrmmer: Harrison Pierce
Date: 9/13/17
This program outputs the average of 3 test scores input by the user
*******************************/

import java.util.Scanner;
public class l1hp
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);

	double total;
	int counter;	
	int grade;
	//declare variables
	
	do	//start do while loop
	{
		System.out.print("Enter a grade: ");
		grade = input.nextInt();
		total = grade;
		System.out.print("Enter a grade: ");
		grade = input.nextInt();
		total = total + grade;
		System.out.print("Enter a grade: ");
		grade = input.nextInt();
		total = total + grade;	//userinput + total of the grades
		System.out.println(total / 3);	//print average
		
		System.out.println("Do you want to average anther test score?");
		System.out.print("Enter Y for yes or N for no: ");
		String choice = input.nextLine();
		
		while(choice != "y" || "n");
		
		System.out.println("Do you want to average anther test score?");
		System.out.print("Enter Y for yes or N for no: ");
		String choice = input.nextLine();




		char c = choice.charAt(0);
		System.out.print(c);
      		//Extracting the char
	  }while(choice == "y");
	
	//end loop
	}
}


















