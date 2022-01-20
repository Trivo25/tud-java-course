
import java.time.LocalDate;

public class DateExample {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);

    try {
      LocalDate notALeapYear = today.of(2021, 02, 29);
      System.out.println(notALeapYear);
    } catch (Exception e) {
      System.out.println("Not a leap year");
    }

    LocalDate leapYear = today.of(2020, 02, 29);
    System.out.println(leapYear);

    LocalDate yesterday = today.minusDays(1);

    System.out.println(yesterday.isBefore(today));
    System.out.println(today.isAfter(yesterday));

    LocalDate parsedDate = LocalDate.parse("2022-01-20");
    System.out.println(parsedDate);

  }
}
