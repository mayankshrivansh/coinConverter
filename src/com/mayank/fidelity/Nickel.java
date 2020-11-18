package com.mayank.fidelity;

public class Nickel {
	public static void calculateNickel(int amount) {

		int nickelAmount;
		nickelAmount = (amount%100%25%10)/5;
		if(nickelAmount>0) {
			System.out.println(nickelAmount+" Nickel");
		}		
	}		
}
