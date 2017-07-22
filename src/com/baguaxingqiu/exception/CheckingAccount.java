package com.baguaxingqiu.exception;

public class CheckingAccount extends Account{
	/**
	 * @param args
	 * �ࣺ CheckingAccount ֧Ʊ�˻����߱�͸֧��ȣ��̳�Account
	       ���ԣ�overdraftProtection ͸֧���
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
			throw new OverDraftException(amount-this.balance-this.overdraftProtection, "͸֧����");
		}
		this.balance -= amount;
	}
	public static void main(String[] args) {
		CheckingAccount caAccount = new CheckingAccount(1000,500);
		try {
			caAccount.withdraw(2000);
		} catch (OverDraftException e) {
			e.printStackTrace();
			System.err.println("͸֧���"+e.getDecifit());
		}
	}

}
