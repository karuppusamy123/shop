package org.bank;

public class Current extends BankAccount {
	private static double maximunAmountCanTransfer = 500000;
	private static int minimumNumberOfTransaction = 7;
	private double amountTransferred;
	private int numberOfTransaction;

	public Current() {
		super();

	}

	public Current(long accountNumber, String accountHolder, String address, long phoneNumber, String emailId,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNumber, emailId, balance);

	}

	public Current(double amountTransferred, int numberOfTransaction) {
		super();
		this.amountTransferred = amountTransferred;
		this.numberOfTransaction = numberOfTransaction;
	}

	public static double getMaximunAmountCanTransfer() {
		return maximunAmountCanTransfer;
	}

	public static void setMaximunAmountCanTransfer(double maximunAmountCanTransfer) {
		Current.maximunAmountCanTransfer = maximunAmountCanTransfer;
	}

	public static int getMinimumNumberOfTransaction() {
		return minimumNumberOfTransaction;
	}

	public static void setMinimumNumberOfTransaction(int minimumNumberOfTransaction) {
		Current.minimumNumberOfTransaction = minimumNumberOfTransaction;
	}

	public double getAmountTransferred() {
		return amountTransferred;
	}

	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}

	public int getNumberOfTransaction() {
		return numberOfTransaction;
	}

	public void setNumberOfTransaction(int numberOfTransaction) {
		this.numberOfTransaction = numberOfTransaction;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return super.withdraw(amount);
	}

	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return super.deposit(amount);
	}

}
