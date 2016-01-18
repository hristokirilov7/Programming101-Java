package problem02;

public class UserInputChecker {
	interface Validator {
		public void validate(String input);
	}

	class PersonNameValidator implements Validator {

		@Override
		public void validate(String input) {
			if (input == null)
				throw new IllegalArgumentException("Invalid name");
			for (int i = 0; i < input.length(); i++) {
				char symbol = input.charAt(i);
				if (!(symbol == ' ' || (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z'))) {
					throw new IllegalArgumentException(symbol + " is not allowed.");
				}
			}
		}

	}

	class BulgarianPhoneNumberValidator implements Validator {

		@Override
		public void validate(String input) {
			// TODO Auto-generated method stub
			if (input.length() != 10) {
				throw new IllegalArgumentException("Phone number's length must be 10,");
			}
			if (input.charAt(0) != '0' || input.charAt(1) != '8' || input.charAt(2) < '7') {
				throw new IllegalArgumentException("Not valid phone number.");
			}
			for (int i = 3; i < 10; i++) {
				if (input.charAt(i) < '0' || input.charAt(i) > '9') {
					throw new IllegalArgumentException("Not valid phone number.");
				}
			}
		}

	}

	class PersonAgeValidator implements Validator {

		@Override
		public void validate(String input) {
			if (input.charAt(0) == '0' || input.length() > 3) {
				throw new IllegalArgumentException("Age is not valid.");
			}
			if (input.length() == 3 && input.charAt(0) != '1') {
				throw new IllegalArgumentException("Age is not valid.");
			}
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) < '0' || input.charAt(i) > '9') {
					throw new IllegalArgumentException("Age is not valid.");
				}
			}
		}

	}

	class CreditCardNumberValidator implements Validator {

		@Override
		public void validate(String input) {
			if (input.length() != 16) {
				throw new IllegalArgumentException("Invalid credit card number.");
			}
			int sum = 0;
			for (int i = 0; i < 16; i++) {
				if (input.charAt(i) < '0' || input.charAt(i) > '9') {
					throw new IllegalArgumentException("Invalid credit card number.");
				}
				if (i != 15) {
					int number = input.charAt(i) - '0';
					if (number % 2 == 1) {
						number *= 2;
						if (number > 9) {
							number -= 9;
						}
					}
					sum += number;
				}
			}
			sum %= 10;
			if (sum != input.charAt(15) - '0')
				throw new IllegalArgumentException("Invalid credit card number.");
		}

	}

	class IpVersion4Validator implements Validator {

		@Override
		public void validate(String input) {
			// TODO Auto-generated method stub
		}

	}

	class IpVersion6Validator implements Validator {

		@Override
		public void validate(String input) {
			// TODO Auto-generated method stub
		}

	}

	class MacAddressValidator implements Validator {

		@Override
		public void validate(String input) {
			// TODO Auto-generated method stub
		}

	}

}
