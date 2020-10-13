package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {


		CDOffering[] CDOfferings = new CDOffering[5];
		CDOfferings[0] = new CDOffering(1, .018);
		CDOfferings[1] = new CDOffering(2, .019);
		CDOfferings[2] = new CDOffering(3, .020);
		CDOfferings[3] = new CDOffering(5, .025);
		CDOfferings[4] = new CDOffering(10, .022);
		MeritBank.setCDOfferings(CDOfferings);	

		AccountHolder ah1 = new AccountHolder("wesley", "Allen", "sharpe", "123456789");

		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);

		ah1.addCDAccount(MeritBank.getBestCDOffering(1000), 1000);
		System.out.println(ah1.getCDAccounts()[0].getTerm());
		MeritBank.addAccountHolder(ah1); 
		
		AccountHolder ah2 = new AccountHolder("Christopher", "Patrick", "Johnson", "111223344");

		ah2.addCheckingAccount(1000);
		ah2.addSavingsAccount(10000);
		ah2.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
		System.out.println(ah2.getCDAccounts()[0].getTerm());
		MeritBank.addAccountHolder(ah2); 

		MeritBank.clearCDOfferings();


		AccountHolder ah3 = new AccountHolder("Shelby", "Lynn", "Johnson", "443322111");

		ah3.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
		System.out.println(ah3.getCDAccounts().length);
		ah3.addCheckingAccount(1000);
		ah3.addSavingsAccount(10000);
		MeritBank.addAccountHolder(ah3); 
		System.out.println("Total aggregate account Balance: $" + MeritBank.totalBalances());

	}
}
