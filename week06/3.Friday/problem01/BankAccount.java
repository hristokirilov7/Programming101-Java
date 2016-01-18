package problem01;

import java.util.LinkedList;
import java.util.Queue;

public class BankAccount {
	private String _firstName;
	private String _lastName;
	private int _age;
	private final int ID;
	private double _balance;
	private double _interest;
	private boolean _complexInterest;
	private Queue<Double> lastFiveOperations = new LinkedList<>();

	private void nameValidator(String name) {
		if (name == null)
			throw new IllegalArgumentException("Invalid name");
		for (int i = 0; i < name.length(); i++) {
			char symbol = name.charAt(i);
			if (!(symbol == ' ' || (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z'))) {
				throw new IllegalArgumentException(symbol + " is not allowed");
			}
		}
	}

	public BankAccount(int id, String firstName, String lastName, int age, double balance, double interest,
			boolean complexInterest) {

		ID = id;

		try {
			nameValidator(firstName);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.toString() + "in first name!.");
		}
		_firstName = firstName;

		try {
			nameValidator(lastName);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.toString() + "in last name!.");
		}
		_lastName = lastName;

		if (age < 0) {
			throw new IllegalArgumentException("Age must be positive");
		}
		_age = age;

		if (balance < 0) {
			throw new InsufficientFundsException("Balance cannot be negative.");
		}
		_balance = balance;
		_interest = interest;
		_complexInterest = complexInterest;
		lastFiveOperations.add(balance);
	}

	private void lastFiveOperationsCorrector() {
		while (lastFiveOperations.size() > 5) {
			lastFiveOperations.poll();
		}
	}

	public void add(double amount) {
		_balance += amount;
		lastFiveOperations.add(amount);
		lastFiveOperationsCorrector();
	}

	public void withdraw(double amount) {
		if (_interest > 0.01) {
			throw new InsufficientFundsException("Interest is grater than 1%, so withdraw is forbidden.");
		}
		if (_balance < amount) {
			throw new InsufficientFundsException("Balance is less than the requested amount.");
		}
		_balance -= amount;
		lastFiveOperations.add(-amount);
		lastFiveOperationsCorrector();
	}

	public void transfer(double amount, BankAccount otherAccount) {
		if (otherAccount == null) {
			throw new NonExistingBankAccountException("Bank account to transfer is invalid.");
		}
		try {
			withdraw(amount);
		} catch (IllegalArgumentException e) {
			throw new InsufficientFundsException("Transfer has failed because of: " + e.toString());
		}
		otherAccount.add(amount);
	}

	public void showHistory() {
		for (int i = 0; i < lastFiveOperations.size(); i++) {
			System.out.println(lastFiveOperations.peek());
			lastFiveOperations.add(lastFiveOperations.peek());
			lastFiveOperations.poll();
		}
	}

	public double calculateAmount(int months) {
		double newBalance = _balance;
		if (_complexInterest) {
			for (int i = 0; i < months; i++) {
				_balance *= 1 + _interest / 12;
			}
		} else {
			double monthlyInterest = _balance * _interest / 12;
			newBalance *= months * monthlyInterest;
		}
		return newBalance;
	}

	public int getId() {
		return ID;
	}

	public String getFirstName() {
		return _firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public int getAge() {
		return _age;
	}

	public double getBalance() {
		return _balance;
	}

	public double getInterest() {
		return _interest;
	}

	public boolean isComplexInterest() {
		return _complexInterest;
	}

	public void setFirstName(String firstName) {
		try {
			nameValidator(firstName);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.toString() + "in first name!.");
		}
		this._firstName = firstName;
	}

	public void setLastName(String lastName) {
		try {
			nameValidator(lastName);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.toString() + "in first name!.");
		}
		this._lastName = lastName;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age must be positive");
		}
		_age = age;
	}

	public void setInterest(double interest) {
		this._interest = interest;
	}

	public void setComplexInterest(boolean complexInterest) {
		this._complexInterest = complexInterest;
	}

		
	
}
