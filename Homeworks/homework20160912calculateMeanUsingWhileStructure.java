import java.util.Scanner;
public class homework20160912calculateMeanUsingWhileStructure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("---------Welcome to mean caculator!---------");
		System.out.println("Please type in the number of data:");
		int input = in.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= input) {
			System.out.println("Please type in the value of data " + i + ".");
			int result = in.nextInt();
			sum = sum + result;
			i++;
		}
		double avg = ((double)sum / (double)input);
		System.out.println("The mean of this dataset is " + avg + ".");
	}
}