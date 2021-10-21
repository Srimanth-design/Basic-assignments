package com.training.AssignmentsDay2;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("enter account type Savings/Current" + " ");
			String accType = input.next();
			Account account = null;

			if (accType.equals("Savings")) {
				account = new Savings(5000);

				while (true) {
					System.out.println("Please enter: ");
					System.out.println("1. Deposit");
					System.out.println("2. Withdraw");
					System.out.println("3. Exit");

					int please_enter = input.nextInt();
					switch (please_enter) {
					case 1:
						System.out.println("To Deposit: ");
						int deposit = input.nextInt();
						account.deposit(deposit);
						break;
					case 2:
						System.out.println("To Withdraw: ");
						int withdraw = input.nextInt();
						account.withdraw(withdraw);
						break;
					default:
						System.exit(0);
					}
				}
			} else if (accType.equals("Current")) {
				while (true) {
					account = new Current(1000);
					System.out.println("Please enter : ");
					System.out.println("1. Deposit");
					System.out.println("2. Withdraw");
					System.out.println("3. Exit");
					int please_enter = input.nextInt();
					switch (please_enter) {
					case 1:
						System.out.println("Enter the amount to Deposit");
						int deposit = input.nextInt();
						account.deposit(deposit);
						break;
					case 2:
						System.out.println("Enter the amount to Withdraw");
						int withdraw = input.nextInt();
						account.withdraw(withdraw);
						break;
					default:
						System.exit(0);
					}
				}

			} else {
				System.out.println("Please enter correctly");

			}
		}

		catch (Exception e) {

			System.out.println("Please enter the correct input");
		}

		input.close();

	}
}
