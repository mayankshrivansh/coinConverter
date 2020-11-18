package com.mayank.fidelity;

public class Quarter {
	public static void calculateQuarter(int amount) {
		int quarterAmount;
		quarterAmount = (amount%100)/25;
		if(quarterAmount>0) {
			System.out.println(quarterAmount+" Quarter");
		}
	}
}
