package com.meritamerica.assignment2;

public class AccountHolder {
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String SSN = "";
	CheckingAccount[] checkingarray = new CheckingAccount[0];
	private int numberOfCheckingAccounts = 0;
	SavingsAccount[] savingsarry = new SavingsAccount[0];
	private int numberOfSavingAccounts = 0;
	CDAccount[] numberOfCDAccounts = new CDAccount[0];

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

	public void addCheckingAccount(double openingBalance) {
		CheckingAccount[] mychArray = new CheckingAccount[checkingarray.length + 1];
		CheckingAccount CHA = new CheckingAccount(openingBalance);
		if (getCheckingBalance() + getSavingsBalance() + openingBalance <= 250000) {
			for (int i = 0; i < checkingarray.length; i++) {
				mychArray[i] = checkingarray[i];
			}
			checkingarray = mychArray;
			checkingarray[checkingarray.length - 1] = CHA;

		}
		return;
	}
	
	public void addCheckingAccount(CheckingAccount openingBalance) {
		CheckingAccount[] mychArray = new CheckingAccount[checkingarray.length + 1];
		if (getCheckingBalance() + getSavingsBalance() + openingBalance.getBalance() <= 250000) {
			for (int i = 0; i < checkingarray.length; i++) {
				mychArray[i] = checkingarray[i];
			}
			checkingarray = mychArray;
			checkingarray[checkingarray.length - 1] = openingBalance;

		}
		return;
	}

	public CheckingAccount[] getCheckingAccounts() {
		return checkingarray;

	}

	public int getNumberOfCheckingAccounts() {
		return checkingarray.length;

	}

	public double getCheckingBalance() {
		double CheckingBalance = 0.0;
		for (int i = 0; i < checkingarray.length; i++) {
			CheckingBalance += checkingarray[i].getBalance();
		}
		return CheckingBalance;
	}

	public void addSavingsAccount(double openingBalance) {
		SavingsAccount[] mysaArray = new SavingsAccount[savingsarry.length + 1];
		SavingsAccount SAA = new SavingsAccount(openingBalance);
		if (getCheckingBalance() + getSavingsBalance() + openingBalance < 250000) {
			for (int i = 0; i <savingsarry.length; i++) {
				mysaArray[i] = savingsarry[i];
			}
			savingsarry = mysaArray;
			savingsarry[savingsarry.length - 1] = SAA;

		}
		return;

	}

	public void addSavingsAccount(SavingsAccount savingsAccount) {
		SavingsAccount[] mysaArray = new SavingsAccount[savingsarry.length + 1];
		if (getCheckingBalance() + getSavingsBalance() + savingsAccount.getBalance() < 250000) {
			for (int i = 0; i < savingsarry.length; i++) {
				mysaArray[i] = savingsarry[i];
			}
			savingsarry = mysaArray;
			savingsarry[savingsarry.length - 1] = savingsAccount;

		}
		return;

	}

	public SavingsAccount[] getSavingsAccounts() {
		return savingsarry;
	}

	public int getNumberOfSavingsAccounts() {
		return savingsarry.length;

	}

	public double getSavingsBalance() {
		double SavingsBalance = 0.0;
		for (int i = 0; i < savingsarry.length; i++) {
			SavingsBalance += savingsarry[i].getBalance();
		}
		return SavingsBalance;

	}

	public void addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount[] mycdArray = new CDAccount[numberOfCDAccounts.length + 1];
		CDAccount CDA = new CDAccount(offering, openingBalance);
		for (int i = 0; i < numberOfCDAccounts.length; i++) {
			mycdArray[i] = numberOfCDAccounts[i];
		}
		numberOfCDAccounts = mycdArray;
		numberOfCDAccounts[numberOfCDAccounts.length - 1] = CDA;

	}

	public void addCDAccount(CDAccount cdAccount) {
		CDAccount[] mycdArray = new CDAccount[numberOfCDAccounts.length + 1];
		for (int i = 0; i < numberOfCDAccounts.length; i++) {
			mycdArray[i] = numberOfCDAccounts[i];
		}
		numberOfCDAccounts = mycdArray;
		numberOfCDAccounts[numberOfCDAccounts.length - 1] = cdAccount;

	}

	public CDAccount[] getCDAccounts() {
		return numberOfCDAccounts;

	}

	public int getNumberOfCDAccounts() {
		return numberOfCDAccounts.length;

	}

	public double getCDBalance() {
		double CDBalance = 0.0;
		for (int i = 0; i < numberOfCDAccounts.length; i++) {
			CDBalance += numberOfCDAccounts[i].getBalance();
		}
		return CDBalance;
		

	}

	public double getCombinedBalance() {
	 return getCheckingBalance() + getSavingsBalance () + getCDBalance();
	 
	}

}