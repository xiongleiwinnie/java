package com.baguaxingqiu.exception;

public class CheckingAccount extends Account{
	/**
	 * @param args
	 * 类： CheckingAccount 支票账户，具备透支额度，继承Account
	       属性：overdraftProtection 透支额度
	 */
	protected double overdraftProtection;
	
	public CheckingAccount(double balance) {
		super(balance);
		this.overdraftProtection = 0;
	}
	
	public CheckingAccount(double balance, double overdraftProtection) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	@Override
	public void withdraw(double amount) throws OverDraftException {
		if (this.balance+this.overdraftProtection<amount) {
			throw new OverDraftException(amount-this.balance-this.overdraftProtection, "透支超标");
		}
		this.balance -= amount;
	}
	public static void main(String[] args) {
		CheckingAccount caAccount = new CheckingAccount(1000,500);
		try {
			caAccount.withdraw(2000);
		} catch (OverDraftException e) {
			e.printStackTrace();
			System.err.println("透支超额："+e.getDecifit());
		}
	}

}
