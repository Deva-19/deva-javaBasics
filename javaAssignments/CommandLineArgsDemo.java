public class CommandLineArgsDemo {
	
	public static void main(String[] args) {
		/* int sum = 0; */
		float sum = 0;
		for(int i=0; i<args.length; i++) {
			/* sum = sum + Integer.parseInt(args[i]); */
			sum = sum+ Float.parseFloat(args[i]);
		}
		System.out.println(sum);
	}
} 