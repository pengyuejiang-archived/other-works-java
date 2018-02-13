// This model is a simple program to test how the Scanner works.
// Scanner is a very useful implement that will be used through out the java course.
import java.util.Scanner;
public class scannerModel20160912 {
	public static void main(String[] args) {
		Scanner scannerName = new Scanner(System.in);
		System.out.println("Plase type in the numebr you want to print.");
		int number = scannerName.nextInt();
		System.out.println(number + " printed.");
	}
}