public class beispielloesung {
	public static void main(String[] args) {
		Rechteck r1 = new Rechteck(10,3);
		Rechteck r2 = new Rechteck(4,8);
		Dreieck d1 = new Dreieck(3,2);
		Dreieck d2 = new Dreieck(5,5);
		System.out.println(r1.toString() + " hat die Fläche " + r1.getFlaeche());
		System.out.println(r2.toString() + " hat die Fläche " + r2.getFlaeche());
		System.out.println(d1.toString() + " hat die Fläche " + d1.getFlaeche());
		System.out.println(d2.toString() + " hat die Fläche " + d2.getFlaeche());
	}
}

interface Form {
	public float getFlaeche();
}

class Rechteck {
	private float breite;
	private float hoehe;

	public Rechteck(float breite, float hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}

	public float getFlaeche() {
		return this.breite * this.hoehe;
	}

	@Override
	public String toString() {
		return "Ein Rechteck der Breite " + this.breite + " und der Höhe " + this.hoehe;
	}
}

class Dreieck {
	private float grundseite;
	private float hoehe;

	public Dreieck(float grundseite, float hoehe) {
		this.grundseite = grundseite;
		this.hoehe = hoehe;
	}

	public float getFlaeche() {
		return 0.5f * this.grundseite * this.hoehe;
	}

	@Override
	public String toString() {
		return "Ein Dreieck mit Grundseite " + this.grundseite + " und der Höhe " + this.hoehe;
	}
}
