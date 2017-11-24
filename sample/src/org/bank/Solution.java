package org.bank;

public class Solution {

	public static void main(String[] args) {
		BankAccount acc=new BankAccount(1123322, "sdsad", "address", 12323223, "emailId", 23232);
		Savings savings=new Savings(2000,4);
		Current cur= new Current(20000,3);
		savings.withdraw(5000);int amount=9000;
		System.out.println(savings.withdraw(amount));
		

	}

}
