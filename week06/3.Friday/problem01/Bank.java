package problem01;

import java.util.TreeMap;

public class Bank {
	private TreeMap<Integer, BankAccount> customers = new TreeMap<>();

	public void addCustomer(int id, String firstName, String lastName, int age, double balance, double interest,
			boolean complexInterest) {
		if (customers.containsKey(id)) {
			throw new IllegalArgumentException(id + " is alreadey taken.");
		}
		try {
			customers.put(id, new BankAccount(id, firstName, lastName, age, balance, interest, complexInterest));
		} catch (InsufficientFundsException e) {
			throw e;
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	public BankAccount findCustomer(int id) {
		if (!customers.containsKey(id))
			throw new NonExistingBankAccountException("Client with id: " + id + "does not exist.");
		return customers.get(id);
	}

}
