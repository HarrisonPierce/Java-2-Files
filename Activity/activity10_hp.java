/**
 * Harrison Pierce
 * 10/25/17
 * This program calculates the average of each of 5 classes with the given grades using a ragged array and nested for loops.
 */

public class activity10_hp
{
    
    public static void main(String[] args)
    {
        double average;
        int j,i;            //counter variables
        double[][] ragged = new double[5][]; //raggeed array object created with 5 columns
        
        ragged[0] = new double[10]; //set ragged array rows
        ragged[1] = new double[2];
        ragged[2] = new double[6];
        ragged[3] = new double[5];
        ragged[4] = new double[2];
        
        ragged[0][0] = 100.0;   //set ragged array data
        ragged[0][1] = 85.5;
        ragged[0][2] = 25.4;
        ragged[0][3] = 30.3;
        ragged[0][4] = 75.5;
        ragged[0][5] = 100.0;
        ragged[0][6] = 88.7;
        ragged[0][7] = 95.6;
        ragged[0][8] = 97.8;
        ragged[0][9] = 55.8;
        ragged[1][0] = 50.0;
        ragged[1][1] = 60.0;
        ragged[2][0] = 70.5;
        ragged[2][1] = 90.0;
        ragged[2][2] = 99.9;
        ragged[2][3] = 65.0;
        ragged[2][4] = 44.5;
        ragged[2][5] = 82.3;
        ragged[3][0] = 39.5;
        ragged[3][1] = 68.4;
        ragged[3][2] = 96.9;
        ragged[3][3] = 100.0;
        ragged[3][4] = 28.7;
        ragged[4][0] = 55.9;
        ragged[4][1] = 100.0;
        
        
        
        for(i = 0;i < ragged.length;i++)    //outter loop, counts columns(class)
        {
            average = 0;    //resets the average to 0 once a class average has been printed
        
        for(j = 0; j < ragged[i].length; j++)   //inner loop, counts the number of rows and calculates the average once the end of the array has been met
        {
           
            average = average + ragged[i][j];          //calculates the class total from the class number and appropriate grade
        }
       
        average = average / j; //divides the class total by the number of scores in that class to find the average
        System.out.printf("The average of class "+ i + " is %.2f\n", average);  //print final average for that class
        }
        
    }
}