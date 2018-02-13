import java.util.Scanner;
class sqrt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = input.nextDouble();
		double result;
		if (number < 0) {
			System.out.println("Sorry, the number is negative.");
		} else {
			result = Math.sqrt(number);
			System.out.println("The square root of " + number + " is " + result + ".");
		}
	}
}