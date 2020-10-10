package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	private String firstName="";
	private String middleName="";
	private String lastName="";
	private String SSN ="";

	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = ssn;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
	}
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		
	}
	public CheckingAccount[] getCheckingAccounts() {
		
	}
	public int getNumberOfCheckingAccounts() {
		
	}
	public double getCheckingBalance() {
		
	}
	public SavingsAccount addSavingsAccount(double openingBalance) {
		
	}
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		
	}
	public SavingsAccount[] getSavingsAccounts() {
		
	}
	public int getNumberOfSavingsAccounts() {
		
	}
	public double getSavingsBalance() {
		
	}
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
	}
	public CDAccount addCDAccount(CDAccount cdAccount) {
		
	}
	public CDAccount[] getCDAccounts() {
		
	}
	public int getNumberOfCDAccounts() {
		
	}
	public double getCDBalance() {
		
	}
	public double getCombinedBalance() {
		
	}

}