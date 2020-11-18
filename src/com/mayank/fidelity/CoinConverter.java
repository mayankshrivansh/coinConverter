package com.mayank.fidelity;

import java.util.Scanner;

public class CoinConverter {

	public static void main(String[] args) {
		System.out.println("Enter the balance amount:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	

		int amount = scan.nextInt();
		if (amount<=0)
		{
			System.out.println("Error: The balance should be greater than zero");
		}
		Calculator.calculateAllCoins(amount);

	}
}
