
/**
 * This program creates an equation using a random number and asks the user to solve
 *
 * @author Harrison Pierfce
 * @version 10/4/2017
 */


import java.util.Scanner;

 

public class l4hp

{

                  public static void main(String[] args)

                  {

                                    int i, j, k, suma;

                                    String l;

                                    char select;

 

                                    //create Scanner object

                                    Scanner keyboard = new Scanner(System.in);

 

//create random object.  Your class name of random number generation class is different than this.  Please adjust name of the class based on yours.

                                    randomhp rand = new randomhp();

 

                                    //get two random numbers from random.java class defined

                                    i = rand.num1();

                                    j = rand.num2();

 

                                    //make keyboard input

                                    System.out.print("Select + or -:  ");

                                    l = keyboard.nextLine();

                                    select = l.charAt(0);

 

                                    if(select == '+' )

                                    {

                                                      num.plus();

 

                                                      System.out.print(i + " + " + j + " = " );

                                                      suma = keyboard.nextInt();

                                                      num.compare(suma);

                                    }

 

                                    if(select == '-')

                                    {

                                                      num.minus();

 

                                                      System.out.print(i + " - " + j + " = " );

                                                      suma = keyboard.nextInt();

                                                      num.compare(suma);

                                    }

                  }

}