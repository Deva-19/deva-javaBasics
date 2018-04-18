
class Animal {
   int eyes = 2;
   public void move() {
	   System.out.println("Animal");
   }
}

class Dog extends Animal {
   int legs;
   public void move() {
	  System.out.println("Dog");
	  super.move();	
   }
}
public class Overriding {
	
    public static void main (String[] args) {
        Animal animal = new Animal();
		animal.move();
        System.out.println(animal.eyes);		  
		Animal dog = new Dog();
		dog.move();	  
    }
}

