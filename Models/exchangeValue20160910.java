// This model is a simple program which displays how to exchange the value of two variables.
import java.util.Scanner;
public class exchangeValue20160910 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please type in the value of number A:");
		int A = in.nextInt();
		System.out.println("Please type in the value of number B:");
		int B = in.nextInt();
		System.out.println("Previous A: " + A);
		System.out.println("Previous B: " + B);
		int temp = A;
		A = B;
		B = temp;
		System.out.println("After A: " + A);
		System.out.println("After B: " + B);
	}
}