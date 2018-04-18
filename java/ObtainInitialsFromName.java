public class ObtainInitialsFromName {
    public static void main(String[] args) {
        String myName = "DevasenaShanmugam";
        StringBuffer stringBuffer = new StringBuffer();
        int length = myName.length();
		
        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                stringBuffer.append(myName.charAt(i));
				// System.out.println(myName.charAt(i));
            }  
        }
			System.out.println(stringBuffer);
    }
}