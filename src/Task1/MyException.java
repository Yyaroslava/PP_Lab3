package Task1;

public class MyException extends RuntimeException {
	public MyException(Errors errors, String errMsg) {
		super(errMsg);
	}

}
