// Created in 2016.09.11, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class priceOfMeal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String response;
		do {
			System.out.println("Please enter the price of the meal in RMB:");
			double totalPrice = in.nextDouble();
			System.out.println("Please enter how many people you have:");
			int people = in.nextInt();
			double pricePerPerson = totalPrice / people;
			if (pricePerPerson >= 100) {
				System.out.println("This meal is too expensive!");
			} else if (pricePerPerson >= 75) {
				System.out.println("This meal is expensive!");
			} else if (pricePerPerson >= 50) {
				System.out.println("This meal is a little expensive.");
			} else if (pricePerPerson >= 25) {
				System.out.println("This meal has a reasonable price.");
			} else if (pricePerPerson > 0) {
				System.out.println("This is a very economical meal!");
			} else {
				System.out.println("This is a meal for free!");
			}
			System.out.println("Do you want to continue? ('y'/'n')");
			response = in.next();
		} while (response.equals("y"));
		System.out.println("Program ended.");
	}
}
// Update history:
// 1.0.0: Enable user to check their meal price.
// 1.1.0: Enable user to check for multiple times. Date: 2016.09.14.