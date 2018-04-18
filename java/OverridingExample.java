class ClassA {
        public void methodOne(int i) {
			System.out.println(i);
        }
        public void methodTwo(int i) {
		    System.out.println(i);

        }
        public static void methodThree(int i) {
			System.out.println(i);	
        }
        public static void methodFour(int i) {
			System.out.println(i);
     }
}

class ClassB extends ClassA {
        public static void methodOne(int i) {
			System.out.println(i);
        }/* 
         public void methodTwo(int i) {
			System.out.println(i);
        } */
        /* public void methodThree(int i) {
			System.out.println(i);
        } */
        /* public static void methodFour(int i) {
			System.out.println(i);
     } */
} 

public class OverridingExample {
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
	
		classA.methodOne(1);
		classA.methodTwo(2);
		classA.methodThree(3);
		classA.methodFour(4);
		
		classB.methodOne(5);// cannot be done
		classB.methodTwo(6);
		classB.methodThree(7);//cannot be done
		classB.methodFour(8);
	}
}