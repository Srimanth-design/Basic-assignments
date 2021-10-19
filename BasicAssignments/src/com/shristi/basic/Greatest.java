package com.shristi.basic;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//greatest number
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

		int greater = values[0];
		for (int i = 0; i < values.length; i++) {
			if (greater < values[i]) {
				greater = values[i];
			}
		}
		System.out.println("The greatest of all is " + greater);
		input.close();
	}

}
