package problem01;

import com.sun.javafx.geom.transform.NoninvertibleTransformException;

public class CommandLineInterpretator {
	private Bank bank;

	public CommandLineInterpretator() {
		bank = new Bank();
	}

	public CommandLineInterpretator(Bank bank) {
		this.bank = bank;
	}

	private void create_bank_account(int id, String firstName, String lastName, int age, double balance,
			double interest, boolean complexInterest) {
		try {
			bank.addCustomer(id, firstName, lastName, age, balance, interest, complexInterest);
		} catch (IllegalArgumentException e) {
			System.err.println("Error in creating new bank account because of: " + e.toString());
		}
	}

	private void show_history(int id) {
		try {
			BankAccount user = bank.findCustomer(id);
			user.showHistory();
		} catch (NonExistingBankAccountException e) {
			System.err.println(e + "Operation failed.");
		}
	}

	private void add_money(int id, double amount) {
		try {
			BankAccount user = bank.findCustomer(id);
			user.add(amount);
		} catch (NonExistingBankAccountException e) {
			System.err.println(e + "Operation failed.");
		}
	}

	private void withdraw_money(int id, double amount) {
		try {
			BankAccount user = bank.findCustomer(id);
			user.withdraw(amount);
		} catch (NonExistingBankAccountException e) {
			System.err.println(e + "Operation failed.");
		} catch (InsufficientFundsException e) {
			System.err.println(e + "Operation failed.");
		}
	}

	private void transfer_money(int idFrom, int idFor, double amount) {
		try {
			BankAccount userFrom = bank.findCustomer(idFrom);
			BankAccount userFor = bank.findCustomer(idFor);
			userFrom.transfer(amount, userFor);
		} catch (NonExistingBankAccountException e) {
			System.err.println(e + "Operation failed.");
		} catch (InsufficientFundsException e) {
			System.err.println(e + "Operation failed.");
		} catch (IllegalArgumentException e) {
			System.err.println(e + "Operation failed");
		}
	}

	private void calculate_amount(int id, int months) {
		try {
			BankAccount user = bank.findCustomer(id);
			System.out.println(user.calculateAmount(months));
		} catch (NonExistingBankAccountException e) {
			System.err.println(e + "Operation failed.");
		}
	}

	public void read(String line) {
		779
	}
}
