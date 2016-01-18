package problem01;

public class NonExistingBankAccountException extends IllegalArgumentException {
	public NonExistingBankAccountException() {

	}

	public NonExistingBankAccountException(String message) {
		super(message);
	}
}
