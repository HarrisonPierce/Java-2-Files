//Harrison Pierce
//10/11/2017
//This program has user enter total number of students then the grades for each
//student using array. The average, lowest and highest is calculated using method.
import java.util.Scanner;
public class activity12_1hp {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int students;
        int grade;
        double total = 0;

        System.out.print("Number of students? ");   //ask user for desired number of students
        students = input.nextInt();
        System.out.println();
        
        double[] studnum = new double[students];       //array counts the number of students
        double[] studgrade = new double[students];      //array counts the grades for each student

        for (int i = 0; i < studnum.length; i++) {     //allows user to enter grade for each student
            System.out.printf("Enter grade for student %d: ", (i + 1));
            studgrade[i] = input.nextDouble();

        }
         System.out.println();
         
         
        highest(studnum, studgrade);       //call highest calculator
        lowest(studnum, studgrade);        //call lowest calculator
        average(studnum, studgrade, students);  //call average calculator

    }

    public static void highest(double stunum[], double stugrade[]) {        //calculates the highest grade
        double highest = 0;

        for (int j = 0; j < stunum.length; j++) {
            if (stugrade[j] > highest) {
                highest = stugrade[j];
            }
        }

        System.out.println("The highest grade is: " + highest);
       
    }

    public static void lowest(double stunum[], double stugrade[]) {         //calculates the lowest grade
        double lowest = stugrade[0];

        for (int j = 0; j < stunum.length; j++) {
            if (stugrade[j] < lowest) {
                lowest = stugrade[j];
            }
        }
        System.out.println("The lowest grade is: " + lowest);
     
    }

    public static void average(double stunum[], double stugrade[], int student) {   //calculates the class average
        double total = 0;
        double average = 0;
        for (int j = 0; j < stunum.length; j++) {
            total = total + stugrade[j];

        }
        average = (total/student);
        System.out.printf("The class average is: %.2f", average);
    }

}
