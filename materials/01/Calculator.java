/*
  Example Java-program 'Calculator' to demonstrate the learning goals of the first lesson.
  Basic Calculator including input scanner and basic int-operations.

  This example only uses a few basic lines of codes. No control flow, functions or such things.
  We want to keep it simple so even complete beginners can write such program only with the gained knowledge in the first lesson.



  Example output for a = 3 and b = 5:
      Number a: 3
      Number b: 5
      Sum of a + b = 8
      Difference of a - b = -2
      Product of a * b = 15

*/

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    // variable definitions
    int a, b;
    Scanner inputScanner = new Scanner(System.in);

    
    System.out.print("Number a: ");
    a = inputScanner.nextInt();

    System.out.print("Number b: ");
    b = inputScanner.nextInt();

    // displaying the results of a few basic integer operations

    System.out.println("Sum of a + b = " + (a + b));

    System.out.println("Difference of a - b = " + (a - b));

    System.out.println("Product of a * b = " + (a * b));

  }

}