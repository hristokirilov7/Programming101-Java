package problem01;

public class InsufficientFundsException extends IllegalArgumentException {
	public InsufficientFundsException() {

	}

	public InsufficientFundsException(String message) {
		super(message);
	}
}
