/*
* Archit Bhujang
* Period 3
* AP Comp Sci A
* lab 2.4.1 - While Loops
*/

import java.util.Scanner;

public class SumAndAverage {

   public static void main (String[] args) {
      Scanner userInput = new Scanner(System.in);
      //Asks user for an integer to enter in, so that the process can start
      System.out.println("Please enter in an integer, or you can also type in 'done'");
      String typedEntry = userInput.nextLine();
      //Initializes the count and the amount of numbers that the user inputs in the set to 0
      int count = 0;
      int numbersInSet = 0;
      
      //While loop runs until the user types in 'done'
      while (!typedEntry.equals("done")) {
         System.out.println("Enter in an integer (or type 'done')");
         //Uses the user input, which is an integer, and then it adds the number to the overall sum
         count += Integer.parseInt(typedEntry);
         //Increments the numbers in the set by 1
         numbersInSet ++;
         typedEntry = userInput.nextLine();
      }
     System.out.println("The sum of the numbers you provided is: " + count);
     //The calculation is set to a double using casting since integer calculation would not provide the right information
     System.out.println("The average of the numbers you provided is: " + (double)count / numbersInSet);
   }
}