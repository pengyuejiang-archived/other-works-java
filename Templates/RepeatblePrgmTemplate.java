import java.util.Scanner;

public class /*File Name*/ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response;
		do {
			/*Code*/
			System.out.print("Would you like to continue? (y/n): ");
			response = input.next();
		} while (response.equals("y"));
		System.out.println("Program ended");
	}

}
