class Animal {
	void move(String... a) {
		System.out.println("Hello");
	}
	void move(Boolean... b) {
		System.out.println("Hi");
	}
}


public class OverloadingExample {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move(true);
		animal.move("Deva");
	}
}