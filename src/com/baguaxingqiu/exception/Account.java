package com.baguaxingqiu.exception;
  
public class Account {

	/**
	 * @param args
	 *  Account类： 银行账号
		属性： balance 余额
		方法： getBalance() 获取余额
		方法： deposit() 存钱
		方法： withdraw() 取钱
		OverdraftExcetpion： 透支异常，继承Exception
		属性： deficit 透支额
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
			throw new OverDraftException(amount-this.balance,"余额不足");
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
			System.err.println("透支金额："+e.getDecifit());
			e.printStackTrace();
		}
		
	}

}
