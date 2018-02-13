import java.util.Scanner;

public class NumberOfPositiveFactors {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number input: ");
		int num = scanner.nextInt();
		System.out.println("Number output: " + getNumberOfPositiveFactors(num));
	}
	
	public static int getNumberOfPositiveFactors(int num) {
		int rslt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				rslt++;
			}
		}
		return rslt;
	}
	
}