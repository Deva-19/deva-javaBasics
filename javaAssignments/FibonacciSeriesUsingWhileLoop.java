public class FibonacciSeriesUsingWhileLoop {
  public static void main(String[] args) {
	  int num1=0, num2=1, sum=0;
	  int i = 0;
	  while(i<=10) {
		sum = num1+ num2;
		System.out.println(sum);
		num1 = num2;
		num2 = sum;
		i++;
	  }
	System.out.println(sum);  
  }
}