public class FibonacciSeriesUsingForLoop {
 void fibonacci() {
	 int num1=0, num2=1, sum=0;
		for(int i=0; i<=10; i++) {
			sum = num1+ num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}
	System.out.println(sum);
 }	
  public static void main(String[] args) {
		FibonacciSeriesUsingForLoop fibo = new FibonacciSeriesUsingForLoop();
		fibo.fibonacci();
  }

}