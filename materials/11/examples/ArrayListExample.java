import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {

    // example1();
    solutionTask1();
  }

  static void example1() {
    ArrayList<String> namen = new ArrayList<String>();
    // .add(s) - füngt Element s an Liste an
    namen.add("Mustermann Max");
    // .set(i, s) - setzt Wert s an Posituion i
    namen.set(0, "Max Mustermann");
    // .remove(i) - entfernt Element an Position i; restliche Elemente "rutschen
    // nach"
    namen.remove(0);
    // .clear() - entfernt alle Elemente
    namen.clear();
    // .size() - gibt die Anzahl der Elemente zurück
    namen.size();

    namen.add("Some name");
    namen.add("Another name");

    for (int i = 0; i < namen.size(); i++) {
      // indirekter Zugriff via index
      System.out.println(namen.get(i));
    }

    for (String name : namen) {
      // direkter Zugriff
      System.out.println(name);
    }
  }

  static void solutionTask1() {
    ArrayList<Integer> teilerfremnden = new ArrayList<Integer>();

    int max = 100;
    int teilerfremdZu = 18;
    for (int i = 0; i < max; i++) {
      if (ggt(teilerfremdZu, i) == 1) {
        teilerfremnden.add(i);
      }
    }

    int sum = 0;
    for (int i : teilerfremnden) {
      sum += i;
    }
    System.out.println(sum);
  }

  static void task1() {
    // erstellt eine ArrayList<E> vom Typ Integer mit dem Namen teilerfremde
    // fügt alle teilerfremden Zahlen zu 18 von 0 bis 100 der ArrayList teilerfremde
    // hinzu
    // am Ende werden alle Zahlen in der Liste teilerfremde summiert
    // gegeben ist die Funktion int ggt(a, b)
    // Hinweis: a ist teilerfremd zu 18 wenn ggt(a, 18) == 1
  }

  static int ggt(int a, int b) {
    int h = (a > b) ? b : a;

    for (int i = h; i > 1; i--) {
      if ((a % i) == 0 && (b % i) == 0) {
        return i;
      }
    }
    return 1;
  }
}