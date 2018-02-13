import java.util.Scanner;
class homework20160913calculateSumUsingForStructure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		int sum = 0;
		String response;
		do {
			System.out.println("Please type in the value of 'n' to calculate 1+2+3+…+n:");
			n = in.nextInt();
			for (int i = 1; i <= n; i++) {
				sum = sum + i;
			}
			if (sum != 0) {
				System.out.println("1+2+3+…+n=" + sum);
			}
			System.out.println("Do you want to continue?");
			response = in.next();
		} while (response.equals("y"));
		System.out.println("Program ends.");
	}
}