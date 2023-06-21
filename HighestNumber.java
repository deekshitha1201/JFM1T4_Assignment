/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
//Add main method
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
      int num1=sc.nextInt();
    System.out.println("enter the second number");
    int num2=sc.nextInt();
    System.out.println("enter the third number");
    int num3=sc.nextInt();
    if(num1>num2&&num1>num3)
      System.out.println("highest number is"+num1);
    else if(num2>num3&&num2>num1)
      System.out.println("highest number is"+num2);
    else
      System.out.println("highest number is"+num3);
  }

//Declare the three variables

//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
 
*/

//check which number is highest using if else condition

//Print the highest of three numbers
 
}