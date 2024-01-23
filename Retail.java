package com.basic.pkg;

import java.util.Scanner;

public class Retail {
	public static void main(String[] args) {
		double total = 0.0;
		int p = 0;
		double q;
		Scanner scan = new Scanner(System.in);
		System.out.println("**.. WELCOME..**");
		while (true) {
			System.out.println("enter your product code:");
			p = scan.nextInt();
			if (p == 6) {
				scan.close();
				break;
			}
			System.out.println("enter your quantity :");
			q = scan.nextDouble();
			switch (p) {
			case 1:
				total = total + (20 * q);
				break;

			case 2:
				total = total + (25 * q);
				break;

			case 3:
				total = total + (45 * q);
				break;

			case 4:
				total = total + (40 * q);
				break;

			case 5:
				total = total + (15 * q);
				break;
			}
		}
		System.out.println("your total amount is:" + total);
		System.out.println("*** THANK_YOU....*****");
		System.out.println("******* VISIT_AGAIN *******");
	}
}
