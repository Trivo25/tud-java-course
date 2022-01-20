
import java.util.Random;

public class RandomExample {
  public static void main(String[] args) {

    Random randomGenerator = new Random();

    int max = 100;
    int result = randomGenerator.nextInt(max); // gibt einmalig eine zufälligen int zurück
    System.out.println(result);

    // gibt einen "stream" an random integer zurück, endlos
    // der (var) -> { /* do something */} Syntax nennt sich Lambda-Funktionen
    randomGenerator.ints().forEach((randomInteger) -> {
      System.out.println(randomInteger);
    });

  }

}
