package SideProject1;

import java.util.Scanner;

public class MoneyCounter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many pennies do you have: ");
		int penny = scan.nextInt();

		System.out.print("How many nickels do you have: ");
		int nickel = scan.nextInt();

		System.out.print("How many dimes do you have: ");
		int dime = scan.nextInt();

		System.out.print("How many quarters do you have: ");
		int quarter = scan.nextInt();

		double total = MoneyCalculator.CalculateCoinTotal(penny, nickel, dime, quarter);

		System.out.print("Total: $" + total);
	}
}
