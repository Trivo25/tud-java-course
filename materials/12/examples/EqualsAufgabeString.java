class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object b) {
		if (b instanceof Animal) {
			Animal anim = (Animal) b;
			if (this.name.equals(anim.name)) {
				return true;
			}
		}
		return false;
	}
}

public class EqualsAufgabeString {
	public static void main(String[] args) {
		Object a = new Animal("Cooper");
		Object b = new Animal("Cooper");

		if (a.equals(b)) {
			System.out.println("sind gleich!");
		} else {
			System.out.println("sind nicht gleich!");
		}
	}
}
