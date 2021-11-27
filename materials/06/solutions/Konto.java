/*
Bankkonto - mittel
    schreibt eine Klasse Bankkonto welches folgende Attribute und Methoden untersützt
        Attribute
            String: kontoInhaber - Name Kontoinhaber*in
            float: maxiUeberzug - Maximum welcher Betrag das Konto überzogen werden kann(‘im Minus’)
            String: iban - IBAN/Kontoaddresse
            int: anzahlTransaktionen
            float: guthaben - Guthaben
        Methoden (Parameter sind ausgelassen)
            contructor: Bankkonto() - Konstruktor
            boolean: sendMoney() - schickt einen Betrag an ein anderes Konto und passt das Guthaben an, 
                    gibt false oder true zurück wenn es erfolgreich war oder nicht
            void: payIn() - zahlt Geld in das Konto ein

*/

public class Konto {
  public static void main (String[] args) {
    Bankkonto b1 = new Bankkonto("Max Mustermann", "123456");
    b1.sendMoney("John Doe", 10.0f);
    b1.payIn(3000.0f);

  }
}

class Bankkonto {
  String kontoInhaber, iban;
  float maxUeberzug, guthaben;
  int anzahlTransaktionen = 0;

  public Bankkonto(String kontoInhaber, String iban) {
    this.kontoInhaber = kontoInhaber;
    this.iban = iban;

    this.maxUeberzug = 100; // maximal 100Euro Ueberzug moeglich
    this.guthaben = 200; // Startguthaben von 200Euro
  }


  public boolean sendMoney(String to, float amount) {
    if(amount > this.guthaben) {
      System.out.printf("Ihr Guthaben reicht mit %s Euro nicht aus um %s Euro zu ueberweisen.\n", this.guthaben, amount);
      return false;
    };

    this.guthaben -= amount;
    this.anzahlTransaktionen++;
    System.out.printf("Sie haben gerade %s Euro an %s ueberwiesen. Verbleibendes Guthaben: %s Euro. Sie haben bereits %s Transaktionen getaetigt.\n",
      amount, to, this.guthaben, this.anzahlTransaktionen);
    return true;
  }

  public void payIn(float amount) {
    this.guthaben += amount;
    this.anzahlTransaktionen++;
    System.out.printf("Sie haben gerade %s Euro eingezahlt. Neues Guthaben: %s.\n", amount, this.guthaben);
  }

}