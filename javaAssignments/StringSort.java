import java.util.Arrays;
public class StringSort {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		String[] place = {"Madurai", "Thanjavur", "TRICHy", "Karur", "Erode", "trichyy", "Salem"};
		/* 
		Class getclass = place.getClass();
		String className = getclass.getName();
		System.out.println(className);
		 */
		Arrays.sort(place, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(place)); 
		for(int i=0; i<=place.length; i++) {
			if(i%2 == 0) {
				stringBuffer.append( place[i].toUpperCase());
			}
		}
		System.out.println(stringBuffer); 
	}
}