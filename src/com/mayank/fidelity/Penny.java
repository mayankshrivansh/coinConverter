package com.mayank.fidelity;

public class Penny {
	public static void calculatePenny(int amount) {

		int pennyAmount;
		pennyAmount = (amount%100%25%10%5);
		if(pennyAmount>0) {
			System.out.println(pennyAmount+" Penny");
		}
	}
}
