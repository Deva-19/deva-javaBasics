class Animal {
  void move() {
	  System.out.println("Animal");
  }
  
}

class Dog extends Animal {
	void move() {
		System.out.println("Dog");
	}
	
	void talk() {
		System.out.println("barks");
	}
}

public class TypeCastingExample {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.move();
        Dog d = new Dog();
		d.move();
		Animal animal = new Dog();
		((Dog)animal).talk();
        //Dog dog = (Dog)new Animal();		//run time exception (Animal is not Dog)
		//dog.move();
	}
}
