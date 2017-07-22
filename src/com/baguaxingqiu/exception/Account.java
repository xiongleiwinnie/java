package com.baguaxingqiu.exception;
  
public class Account {

	/**
	 * @param args
	 *  Account�ࣺ �����˺�
		���ԣ� balance ���
		������ getBalance() ��ȡ���
		������ deposit() ��Ǯ
		������ withdraw() ȡǮ
		OverdraftExcetpion�� ͸֧�쳣���̳�Exception
		���ԣ� deficit ͸֧��
	 */
	protected double balance;
	
	public Account(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amount){
		this.balance += amount; 	
	}
	
	public void withdraw(double amount) throws OverDraftException{
		if (this.balance<amount) {
			throw new OverDraftException(amount-this.balance,"����");
		}
		this.balance -= amount;
	}

	public static void main(String[] args) throws OverDraftException {
		Account a = new Account(1000);
		a.deposit(100);
		System.out.println(a.getBalance());
		a.withdraw(200);
		System.out.println(a.getBalance());
		try {
			a.withdraw(1000);
		} catch (OverDraftException e) {
			System.err.println("͸֧��"+e.getDecifit());
			e.printStackTrace();
		}
		
	}

}
