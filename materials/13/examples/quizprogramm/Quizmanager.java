import java.util.ArrayList;
import java.util.Scanner;

public class Quizmanager {
	ArrayList<Quizfrage> quizfragen;

	public Quizmanager() {
		quizfragen = new ArrayList<Quizfrage>();
		this.ladeFragen();
	}

	void ladeFragen() {
		quizfragen.add(new Quizfrage("Wann wurde Java veröffentlicht?", "1995"));
		quizfragen.add(new Quizfrage("Wie hieß Java ursprünglich?", "Oak"));
		quizfragen.add(new Quizfrage("Wie heißt der Hauptdesigner von Java?", "James Gosling"));
	}

	public void leiteQuiz() {
		Scanner scanner = new Scanner(System.in);
		for (Quizfrage q : quizfragen) {
			stelleFrageUndKontrolliere(scanner, q);
		}
	}

	private void stelleFrageUndKontrolliere(Scanner scanner, Quizfrage q) {
		System.out.println("Frage: " + q.getFrage());
		System.out.print("Antwort: ");
		String input = scanner.nextLine();
		if (q.stimmtAntwort(input)) {
			System.out.println("Richtig!");
		} else {
			System.out.println("Falsch! Richtig wäre: " + q.getAntwort());
		}
	}
}
