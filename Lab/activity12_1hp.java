//Harrison Pierce
//10/11/2017

import java.util.Scanner;
public class activity12_1hp
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		int students;
                int grade;
                int count;
                
                System.out.println("Number of students");
                students = input.nextInt();
                
                
               double[] studnum = new double[students];
               double[] studgrade = new double[students];
                
                
                for(int i = 0; i <= studnum.length;i++)
                {
                    System.out.printf("Enter grade for student %d: ", (i+1));
                    studgrade[i] = input.nextDouble(); 
                
                }
                
                highest (studnum, studgrade);
                lowest double(studnum, studgrade);
                
                
                
                public static void highest(double[] stunum, double[] stugrade)
                {
                    double highest = 0;
                    
                    for(int j = 0;j < stunum.length;j++)
                    {
                        if (stugrade[j] > highest)
                        {
                            highest = stugrade[j];  
                        }
                        
                      System.out.println("The highest grade is: " + highest);
                    }
                
                public static void lowest(double[] stunum, double[] stugrade)
                {
                    double lowest;
                    
                    
                    if(stugrade[j] < lowest)
                    {
                        
                        
                    }
                    
                    
                    
                }
                
                
                public static average(double[] stunum, double[] gradnum)
                {
                    
                    
                    
                    return;
                }
                
                
                
                

        }
}