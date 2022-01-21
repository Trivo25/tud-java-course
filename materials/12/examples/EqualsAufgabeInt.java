class Animal {
	int age;
	public Animal(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object b) {
		if (b instanceof Animal) {
			Animal anim = (Animal) b;
			if (this.age == anim.age) {
				return true;
			}
		}
		return false;
	}
}

public class EqualsAufgabeInt {
	public static void main(String[] args) {
		Object a = new Animal(3);
		Object b = new Animal(4);

		if (a.equals(b)) {
			System.out.println("sind gleich!");
		} else {
			System.out.println("sind nicht gleich!");
		}
	}
}
