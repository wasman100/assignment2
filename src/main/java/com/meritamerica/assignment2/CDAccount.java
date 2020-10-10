package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {
	public double balance =0;
	public double intrestRate =0;
	public int term =0;
	public Date StartDate =null;
	public long accountNumber;

	public CDAccount(CDOffering offering, double balance) {
		
	}
	public double getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return intrestRate;
	}
	public int getTerm() {
		return term;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public double futureValue() {
		
	}

}
