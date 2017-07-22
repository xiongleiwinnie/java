package com.baguaxingqiu.exception;

public class OverDraftException extends Exception{

	/**
	 * @param args
	 */
	private double decifit;
	
	public double getDecifit(){
		return decifit;
	}
	
	public OverDraftException(double decifit, String msg){
		super(msg);
		this.decifit = decifit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
