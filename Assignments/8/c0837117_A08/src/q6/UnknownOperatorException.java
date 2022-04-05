package q6;

/* Note this class is not complete. You must properly finish the class */
public class UnknownOperatorException extends Exception{
	
	private String msg;
	
	public UnknownOperatorException() {
		super("UnknownOperatorException: Values are limited to +, -, *, /");
		this.msg = "UnknownOperatorException: Values are limited to +, -, *, /";
	}
	
	public UnknownOperatorException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	
}
