
/* 
public class IdentifyMyParts {
	int x = 2,y;
	public static void main(String[] args) {
	// IdentifyMyParts IdentifyMyParts = new IdentifyMyParts();	
	IdentifyMyParts a = new IdentifyMyParts();
    IdentifyMyParts b = new IdentifyMyParts();
    a.y = 5;
    b.y = 6;
    a.x = 1;
    b.x = 2;
    System.out.println("a.y = " + a.y);
    System.out.println("b.y = " + b.y);
    System.out.println("a.x = " + a.x);
    System.out.println("b.x = " + b.x);
    System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);	//error
	} 
} */

  public class IdentifyMyParts {
        public static int x = 7; //class variable
        public int y = 3; //instance variable
		public static void main(String[] args) {
			IdentifyMyParts a = new IdentifyMyParts();
			IdentifyMyParts b = new IdentifyMyParts();
			a.x = 10;
			a.y = 6;
			b.y = 9;
			b.x = 3;
			System.out.println(a.x);
			System.out.println(a.y);
			System.out.println(b.y);
			System.out.println(b.x);
			System.out.println(IdentifyMyParts.x);
		}
	
 }

	