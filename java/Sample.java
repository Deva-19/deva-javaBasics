class Dog {
	//public static String cat;
   Dog(){}
   Dog(String d){
	 //this.cat = d;  
	 //System.out.println(cat);
   }

}
public class Sample extends Dog {
	
	public static void main(String[] args) {
	   // Integer dog = new Integer(1);
	   Dog cat = new Dog("dog");
	   System.out.println(cat);	
  }
	
}
