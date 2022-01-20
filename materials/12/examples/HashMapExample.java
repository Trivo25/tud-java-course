import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    // wir mappen Land -> Stadt
    HashMap<String, String> hauptstaedte = new HashMap<String, String>();

    // wir fügen Schlüssen und Werte hinzu
    hauptstaedte.put("England", "London");
    hauptstaedte.put("Deutschland", "Berlin");

    for (String land : hauptstaedte.keySet()) {
      System.out.println(hauptstaedte.get(land));
    }
  }
}
