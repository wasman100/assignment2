package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	static AccountHolder myAccountHolder[] = new AccountHolder[0];
	static CDOffering myCDOffering[] = new CDOffering[0];
	static CDAccount myCDAccount[] = new CDAccount[0];
	private static long nextAccount = 0;

	public static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] myAccountHolder1 = new AccountHolder[myAccountHolder.length + 1];
		for (int i = 0; i < myAccountHolder.length; i++) {
			myAccountHolder1[i] = myAccountHolder[i];
		}
		myAccountHolder = myAccountHolder1;
		myAccountHolder[myAccountHolder.length - 1] = accountHolder;

	}

	public static AccountHolder[] getAccountHolders() {
		return myAccountHolder;

	}

	public static CDOffering[] getCDOfferings() {
		return myCDOffering;

	}

	public static CDOffering getBestCDOffering(double depositAmount) {
		double best = 00;
		CDOffering CDO = null;
		if (myCDOffering == null) {
			return null;
		}
		for (int i = 0; i < myCDOffering.length; i++) {
			if (futureValue(depositAmount, CDO.getInterestRate(), CDO.getTerm()) > best) {
				CDO = myCDOffering[i];
				best = futureValue(depositAmount, CDO.getInterestRate(), CDO.getTerm());
			}
		}
		return CDO;
	}

	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		double secondbest = 00;
		CDOffering CDO = null;
		CDOffering CDB = null;
		if (myCDOffering == null) {
			return null;
		}
		for (int i = 0; i < myCDOffering.length; i++) {
			if (futureValue(depositAmount, CDO.getInterestRate(), CDO.getTerm()) > secondbest) {
				CDB = CDO;
				CDO = myCDOffering[i];
				secondbest = futureValue(depositAmount, CDO.getInterestRate(), CDO.getTerm());
			}
		}
		return CDB;

	}

	public static void clearCDOfferings() {
		myCDOffering = null;

	}

	public static void setCDOfferings(CDOffering[] offerings) {
		myCDOffering = offerings;
	}

	public static long getNextAccountNumber() {
		return nextAccount += 1;
	}

	public static double totalBalances() {
		double total = 0;
		for (int i = 0; i < myAccountHolder.length; i++) {
			total += myAccountHolder[i].getCombinedBalance();
		}
		return total;

	}

	public static double futureValue(double presentValue, double interestRate, int term) {
		double value = 0.00;
		double powered = Math.pow((1 + interestRate), term);
		value = presentValue * powered;
		return value;
	}

}
