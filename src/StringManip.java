import java.util.Scanner;
import java.text.DecimalFormat;

public class StringManip
{
   static final int MIN_HOURS = 12; 
   static final int MAX_HOURS = 20;
   
   public static void main(String[] args)
   {
      /*
       * Part I: Asks the user to enter the name, concats the name
       * and prints it out in upper and lower case 
       */
      Scanner input = new Scanner(System.in);// TODO Auto-generated method stub
      System.out.println("Please enter your name. Capitalize the first letter of each name: ");
      String firstName = input.next();
      String lastName = input.next();
      
      String fullName = firstName + " " + lastName;
      System.out.println("Your full name is " + fullName);
      System.out.println("The length of your name is: " + fullName.length());
      System.out.print("Upper Case: ");
      System.out.println(fullName.toUpperCase());
      System.out.print("Lower Case: ");
      System.out.println(fullName.toLowerCase());
      
      System.out.println();
      
      /*
       * Part II: Prints out min and max hours to spend, asks user how
       * much s/he spent, and prints it in 0dot0 format using DecimalFormat class
       */
      System.out.println("You must work between " + MIN_HOURS + 
            " and " + MAX_HOURS + " in this class.");
      System.out.println("Please enter the number of hours you have worked to three decimal places.");
      double hoursWorked = input.nextDouble();
      
      DecimalFormat pattern0dot0 = new DecimalFormat("0.0");
      System.out.print("You have worked ");
      System.out.print(pattern0dot0.format(hoursWorked) + " hours");
   }
}

/*---------------------------OUTPUT-------------------------------------
 Please enter your name. Capitalize the first letter of each name: 
Faye Revah
Your full name is Faye Revah
The length of your name is: 10
Upper Case: FAYE REVAH
Lower Case: faye revah

You must work between 12 and 20 in this class.
Please enter the number of hours you have worked to three decimal places.
19.453
You have worked 19.5 hours
 
*/