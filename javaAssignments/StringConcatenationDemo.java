

public class StringConcatenationDemo {

	 public static void main(String args[]){
             String hi="Hi, ";
             String mom="mom.";
             String concatenation=hi.concat(mom);
			 StringBuffer stringBuffer = new StringBuffer();
			 stringBuffer.append(hi).append(mom);
			 System.out.println(stringBuffer);
			 System.out.println(concatenation);
             System.out.println(hi+mom);
        }
}