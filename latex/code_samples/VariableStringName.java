import java.util.Scanner;
public class VariableStringName {
  public static void main (String[] args) {
    Scanner myInputScanner = new Scanner(System.in);

    System.out.println("Hi, whats your name?");
    String name = myInputScanner.nextLine();
    System.out.println("Hello, " + name + " nice to meet you! :)");
  }
}