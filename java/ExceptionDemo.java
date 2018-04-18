import java.util.Scanner;

class InputException extends Exception{
	private String errorMessage;
	
    public String getErrorMessage() {
    	return errorMessage;
    }
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/* public InputException(String str) {
		super("Please enter correct number");
	} */
}

public class ExceptionDemo {
	
	void inputValueCheck(int inputValue) throws InputException{
	if(inputValue>=50){
		throw new InputException();
	  }
   } 
   
	public static void main(String[] args)throws InputException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number within 50");
		int inputValue = input.nextInt();	
		ExceptionDemo exceptionDemo = new ExceptionDemo();
		
		try {
			exceptionDemo.inputValueCheck(inputValue);
		} catch(InputException iE) {
			iE.setErrorMessage("Provide number below 50");
			System.out.println(iE.getErrorMessage());
		}
	} 		
}