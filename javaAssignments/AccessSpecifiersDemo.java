class Animal {
	private int legs = 4;
	protected void move() {
		System.out.println("moving");
	}
}

class Dog extends Animal {
	void main() {
		System.out.println("Dog moving");
	}
}


public class AccessSpecifiersDemo {
	public static void main(String[] args) {
		Animal animal = new Animal();
	    System.out.println(animal.legs);// cannot acccess
	    animal.move();		
	}
}