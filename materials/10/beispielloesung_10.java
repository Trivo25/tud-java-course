// Teilaufgabe 7:
import java.util.Arrays;

public class beispielloesung_10 {
	public static void main(String[] args) {
		// Teilaufgabe 3:
		Form r1 = new Rechteck(10,3);
		Form r2 = new Rechteck(4,8);
		Form d1 = new Dreieck(3,2);
		Form d2 = new Dreieck(5,5);

		// Teilaufgabe 6:
		Form[] formen = {r1, r2, d1, d2};

		// System.out.println(formen); // nicht wie gewünscht

		// Teilaufgabe 8:
		System.out.println(Arrays.toString(formen));

		/*
		System.out.println(r1.toString() + " hat die Fläche " + r1.getFlaeche());
		System.out.println(r2.toString() + " hat die Fläche " + r2.getFlaeche());
		System.out.println(d1.toString() + " hat die Fläche " + d1.getFlaeche());
		System.out.println(d2.toString() + " hat die Fläche " + d2.getFlaeche());
		*/

		// Teilaufgabe 9:
		Arrays.sort(formen);
		// Teilaufgabe 10:
		System.out.println(Arrays.toString(formen));
	}
}

// Teilaufgabe 1:
interface Form {
	public float getFlaeche();
}

// Teilaufgabe 2, 5:
class Rechteck implements Form, Comparable<Form> {
	private float breite;
	private float hoehe;

	public Rechteck(float breite, float hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}

	public float getFlaeche() {
		return this.breite * this.hoehe;
	}

	// Teilaufgabe 4:
	@Override
	public String toString() {
		return "Rechteck { b = " + this.breite + ", h = " + this.hoehe + ", A = " + this.getFlaeche() + "}";
	}

	@Override
	public int compareTo(Form f) {
		float diff = this.getFlaeche() - f.getFlaeche();
		if (diff == 0) {
			return 0;
		} else if (diff < 0) {
			return -1;
		} else {
			return 1;
		}
	}
}

// Teilaufgabe 2, 5:
class Dreieck implements Form, Comparable<Form> {
	private float grundseite;
	private float hoehe;

	public Dreieck(float grundseite, float hoehe) {
		this.grundseite = grundseite;
		this.hoehe = hoehe;
	}

	public float getFlaeche() {
		return 0.5f * this.grundseite * this.hoehe;
	}

	// Teilaufgabe 4:
	@Override
	public String toString() {
		return "Dreieck { g = " + this.grundseite + ", h = " + this.hoehe + ", A = " + this.getFlaeche() + "}";
	}

	@Override
	public int compareTo(Form f) {
		float diff = this.getFlaeche() - f.getFlaeche();
		if (diff == 0) {
			return 0;
		} else if (diff < 0) {
			return -1;
		} else {
			return 1;
		}
	}
}
