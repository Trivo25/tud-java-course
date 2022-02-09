public class Quizfrage {
	private String frage;
	private String antwort;

	public Quizfrage(String frage, String antwort) {
		this.frage = frage;
		this.antwort = antwort;
	}

	public String getFrage() {
		return frage;
	}

	public String getAntwort() {
		return antwort;
	}

	public boolean stimmtAntwort(String vorschlag) {
		if (antwort == null) return false;
		return antwort.equals(vorschlag);
	}
}
