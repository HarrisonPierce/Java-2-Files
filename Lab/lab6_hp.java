//Harrison Pierce
//11/8/17
//This program is a lottery game in which the user enters 6 numbers. The first
// 5 numbers are noramal and the sixth is for the mega ball.



import java.util.Scanner;

public class lab6_hp
{
	public static void main(String[] args)
	{
        
        Scanner input = new Scanner(System.in);
        class1hp class = new class1hp();
        int[] usernums = new int[6];
        
        System.out.println("Please choose 5 numbers: ");

        
        class.random(usernums);
        }
}