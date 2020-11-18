package com.mayank.fidelity;

public class Dime {
	public static void calculateDime(int amount) {
		int dimeAmount;
		dimeAmount = (amount%100%25)/10;
		if(dimeAmount>0) {
			System.out.println(dimeAmount+" Dime");
		}
	}
}
