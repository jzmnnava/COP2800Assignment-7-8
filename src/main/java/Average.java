//This program promts the user to enter 10 double values
//Ivokes a method 
//Displays the average value

import java.util.Scanner;

public class Average {
//Main Method
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//Input Array as a double with a length of 10 
    double[] values = new double[10];
//Prompt the user to enter 10 values
    System.out.print("Enter ten values: ");
    for (int i = 0; i < values.length; i++) {
      values[i] = input.nextDouble();
    }

//Display the average
    System.out.println("The average value: " + average(values));  
    }

//Average methods
//Method overloading: program can handle both Int. and Doubles
    public static int average(int[] array){
      int average = 0; 
      for (int i: array)
        average += i; 
      return average / array.length;
    }

    public static double average(double[] array){
      double average = 0;
      for (double i: array)
        average += i;
      return average / array.length;
    }
}  