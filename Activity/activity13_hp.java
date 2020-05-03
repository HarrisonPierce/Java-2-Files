//Harrison Pierce
//11/8/17
//This program allows the user to create an array and enter the desired numbers
//into it. Then the array is sorted into ascending order. Next, the array can be searched by
//the user to find where the desired variable is located.

import java.util.Scanner;
public class activity13_hp
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to input: ");
        int i = input.nextInt();        //sets the array size
        
        int[] hello = new int[i];       //create the array and set the size equal to user defined variable
        
        for(int j = 0;j<hello.length;j++)   //allows the user to enter the numbers into the array
        {
            System.out.printf("Enter number %d: ",j +1);
            hello[j] = input.nextInt();
        }
        
        sortAscending(i, hello);                //call sort method to sort the array in ascending order
         System.out.print("What number are you looking for? ");
         int get = input.nextInt();             //user enters the number to be found
         searchNum(hello, i, get);              //call the search method which finds the element where the number is stored
        }
        
        public static void sortAscending(int i2, int[] hello2)  //sorts th numbers
        {      
                    int min;
                    for(int k = 0;k < i2;k++)
                    {
                        for(int l = k + 1;l < i2;l++)
                        {
                        
                            if(hello2[k] < hello2[l])       //sorts the numbers in ascending order based on the minimum value
                            {
                                min = hello2[k];
                                hello2[k] = hello2[l];
                                hello2[l] = min;
                            }
                        }
                    }  
                            System.out.println("Sorted:");
                           for(int i = 0;i < i2-1;i++)      //display sorted
                           {
                               System.out.print(hello2[i] + " ");
                                
                           }
                    
                           System.out.println(hello2[i2 - 1]);
                    
                    
                    }
        public static void searchNum(int hello3[], int i3,int getnum)   //searches for the get number and displays its location
        {
          
            boolean j = false;
            int i;
            for(i = 0;i < hello3.length;i++)    //loops until the number is found in the array
            {
                if(hello3[i] == getnum)
                {
                   j = true;
                    break;
                    
                }
     
            }
            if (j==true)    //show user where number is
            {
                System.out.printf(getnum + " is found at element %d ",i);
            }
            else        //let user know the number is notin the array
                System.out.println("Your number is not found in the array");
            
            
            
        }
                }
        
        
        
