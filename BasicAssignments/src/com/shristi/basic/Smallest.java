package com.shristi.basic;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("No of elements: ");
		int number = input.nextInt();
		int values[] = new int[number];

		// populating
		System.out.println("Enter input array");// three numbered array
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}
		// the work

		int smallest = values[0];
		for (int i = 0; i < values.length; i++) {
			if (smallest > values[i]) {
				smallest = values[i];
			}
		}
		System.out.println("Smallest is : " + smallest);
		input.close();
	}

}
