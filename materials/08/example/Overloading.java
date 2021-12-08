public class Overloading {

  public static void main(String[] args) {
    sum(1, 3); // sum of two int
    sum(1.3f, 3.0f); // sum of two float
    sum(0.3d, 9.3d); // sum of two double

    printTwoVariables(5, "five");
    printTwoVariables(true, "a boolean");

    sumOfMultiple(1, 1); // 2
    sumOfMultiple(1, 1, 1); // 3
    sumOfMultiple(1, 1, 1, 1); // 4
  }


  public static void sum(int a, int b) {
    System.out.println(a+b);
  } // Methode welche a + b rechnet

  public static void sum(float a, float b) {
    System.out.println(a+b);
  } // nun mit Datentyp float!

  public static void sum(double a, double b) {
    System.out.println(a+b);
  } // .. oder double!




  public static void printTwoVariables(int a, String b) {
    System.out.println("a: " + a + " b: " + b);
  }

  public static void printTwoVariables(boolean a, String b) {
    System.out.println("a: " + a + " b: " + b);
  }


  public static void sumOfMultiple(int a, int b) {
    System.out.println(a + b);
  }

  public static void sumOfMultiple(int a, int b, int c) {
    System.out.println(a + b + c);
  }

  public static void sumOfMultiple(int a, int b, int c, int d) {
    System.out.println(a + b + c + d);
  }

}