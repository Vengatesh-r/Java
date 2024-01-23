package com.basic.pkg;

import java.util.Scanner;

public class IntputStm {

	double add(double x, double y) {
		double z = x+ y;
		System.out.println("Addition of a andd b is "+z);
		return z;

	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of a:");
		double a = scan.nextDouble();
		System.out.println("enter the value of b:");
		double b = scan.nextDouble();
		
		IntputStm instm = new IntputStm();
		instm.add(a, b);
		
		scan.close();

	}

}
