package com.meritamerica.assignment2;

public class CDOffering {
	public int term=0;
	public double intrestRate=0;
	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.intrestRate = interestRate;
	}
	public int getTerm() {
		return term;
	}
	public double getInterestRate() {
		return intrestRate;
	}

}
