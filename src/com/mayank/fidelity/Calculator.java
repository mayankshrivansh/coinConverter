package com.mayank.fidelity;

public class Calculator{
	public static void calculateAllCoins(int amount) {

		Dollars.calculateDollars(amount);

		Quarter.calculateQuarter(amount);

		Dime.calculateDime(amount);

		Nickel.calculateNickel(amount);

		Penny.calculatePenny(amount);
	}
}
