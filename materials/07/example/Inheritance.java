public class Inheritance {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.sleep();

    Cat garfield = new Cat();
    garfield.sleep();

  }
}

// Classes

class Animal {
  String name;
  boolean canFly;

  public Animal() {
    System.out.println("A new Animal has just been created!");
  }

  public void sleep() {
    System.out.println("zzZzzzzZZZzZZ");
  }
}

class Cat extends Animal {

}