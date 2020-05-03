//Harrison pierce
//9/8/17
import java.util.Scanner;
public class activity1_pierce
{

	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);
	int total = 0;
	int students = 0;
	int grade;

	System.out.print("Enter a grade or -1 to quit: ");
	grade = input.nextInt();
	students ++;
	total = total + grade;

	while(grade != -1)
	{
	
	total = total + grade;
	students++;
	
	System.out.print("Enter a grade or -1 to quit: ");
	grade = input.nextInt();

	
	

	
	}
	
	total = total /= students;	

	System.out.print("The average is: " +total);
	


	}

}