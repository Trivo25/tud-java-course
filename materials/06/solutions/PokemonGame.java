/*
Pokémon - schwerer
    schreibt ein Pokémon-Spiel in dem sich zwei Pokemons gegenseitig attackieren!
        Attribute
            String: name - Name des Pokémons
            private float: health - Lebenspunkte des Pokémons
            private float: attackPower - Angriffspunkte des Pokémons
            private boolean: isDead - boolean ob Pokémon am Leben ist oder nicht
        Methoden
            contructor: Pokemon() - Konstruktor
            boolean: getIsDead() - gibt true oder false zurück wenn Pokémon lebt bzw. wenn nicht
            void: attack() - nimmt ein Pokémon-Objekt als Methoden-Parameter und greift es an, fügt im attackPower Schaden zu
            void: dealDamage() - zieht Leben des Pokémons ab
*/

public class PokemonGame {
  public static void main (String[] args) {
    Pokemon pikachu = new Pokemon("Pikachu", 6.5f, 110.0f);
    Pokemon charmander = new Pokemon("Charmander", 7.0f, 105.0f);

    pikachu.attack(charmander);

    charmander.attack(pikachu);

  }
}

class Pokemon {
  String name;
  private float health, attackPower;
  private boolean isDead = false;

  public Pokemon(String name, float attackPower, float health) {
    this.name = name;
    this.attackPower = attackPower;
    this.health = health;

    System.out.printf("%s mit attack-power %s und %s health wurde erstellt!\n", name, attackPower, health);
  }

  public boolean getIsDead() {
    return this.isDead;
  }

  public void attack(Pokemon target) {
    if(target.getIsDead()) {
      System.out.printf("%s ist nicht mehr am leben!\n", target.name);
      return;
    }

    target.dealDamage(this.attackPower);
    System.out.printf("%s wurden %s Schaden von %s hinzugefuegt!\n", target.name, this.attackPower, this.name);
  }

  public void dealDamage(float dmg) {
    this.health -= dmg;
    if(this.health <= 0) {
      this.isDead = true;
    }
  }

}