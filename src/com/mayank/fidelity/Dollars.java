package com.mayank.fidelity;

public class Dollars {
	public static void calculateDollars(int amount) {
		int dollarAmount;
		dollarAmount = amount/100;
		if(dollarAmount>0) {
			System.out.println(dollarAmount+" Dollar");
		}	
	}
}
