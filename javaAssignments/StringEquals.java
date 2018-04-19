public class StringEquals {
	public static void main(String[] args) {
		String username = new String("sena");
	    String fullname = new String("Deva");
		String username = "Deva";
		String fullname = "deva";
	    System.out.println(username);	
		System.out.println(username == fullname); //check the address of that String both have different address
		System.out.println(username.equals(fullname));
	}
}