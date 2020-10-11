package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	CDOffering offering;
	private Date date;
	private double balance =0;
	private long accountNumber=0;
		
	public CDAccount(CDOffering offering, double openBalance){
		super(openBalance,offering.getInterestRate());
		this.date = new Date();
		this.accountNumber = MeritBank.getNextAccountNumber();
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return offering.getInterestRate();
	}
	
	public int getTerm() {
		return offering.getTerm();
	}
	
	public Date getStartDate(){
		return date;
	}
	
	public long getAccountNumber() {
		return accountNumber;	
	}
	
	public double futureValue() {
		return balance*Math.pow(1 + getInterestRate(), getTerm());
	}

}
