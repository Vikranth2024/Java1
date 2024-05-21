package bank1;

public class InsufficientFundException extends Exception {
	public InsufficientFundException(String msg)
	{
		super(msg);
	}

}
