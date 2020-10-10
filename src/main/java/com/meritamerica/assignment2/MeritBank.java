package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;



public class MeritBank {
	
 public	static void addAccountHolder(AccountHolder accountHolder) 
 {
	 
 }
 public	static AccountHolder[] getAccountHolders() {
	 
 }
 public	static CDOffering[] getCDOfferings() {
	 
 }
 public	static CDOffering getBestCDOffering(double depositAmount) {
	 
 }
 public	static CDOffering getSecondBestCDOffering(double depositAmount) {
	 
 }
 public	static void clearCDOfferings() {
	 
 }
 public	static void setCDOfferings(CDOffering[] offerings) {
	 
 }
 public	static long getNextAccountNumber() {
	 
 }
 public	static double totalBalances() {
	 
 }
 public	static double futureValue(double presentValue, double interestRate, int term) {
	 double value = 0.00;
		double powered = Math.pow((1 + interestRate), term);
		value = presentValue * powered;
		return value;
 }

}
