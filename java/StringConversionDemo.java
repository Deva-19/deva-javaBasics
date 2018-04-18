public class StringConversionDemo {

  public static void main(String[] args) {
	  int i = 170;
	  String hex = "230";
	  String hexaValue = Integer.toHexString(i);
	  System.out.println(hexaValue);
	  
	  int value = Integer.parseInt(hex, 5);
	  System.out.println(value);
	  
	  System.out.println(Long.valueOf(hex));
	  System.out.println(Integer.valueOf(hex));
	  System.out.println(Integer.valueOf(hex).equals(Long.valueOf(hex)));
  }

}