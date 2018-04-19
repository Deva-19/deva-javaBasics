enum Usernames {
		Deva, Chan, Viki, Kirthi
}

public class EnumValueComparison {
void compareEnumValues(Usernames user) {
	  System.out.println(user == Usernames.Chan);
	  System.out.println(user.equals(Usernames.Chan));
	} 
	public static void main(String[] args) {
		EnumValueComparison enumValue = new EnumValueComparison();
		enumValue.compareEnumValues(Usernames.Deva);
   }
}