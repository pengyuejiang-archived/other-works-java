import java.util.Scanner;
public class A4_25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please type in the beginning year:");
		int initialYear = in.nextInt();
		System.out.println("Please type in the ending year:");
		int finalYear = in.nextInt();
		System.out.println("Please type in the month of the ending year:");
		int month = in.nextInt();
		System.out.println("Please type in the day of the ending year:");
		int day = in.nextInt();
		int sum = 0;
		for (; initialYear <= finalYear - 1; initialYear++) {
			if (initialYear % 400 == 0 || initialYear % 4 == 0 && initialYear % 100 != 0) {
				sum = sum + 366;
			} else {
				sum = sum + 365;
			}
		}
		for (int c = 1; c <= month - 1; c++) {
			if (c == 2) {
				if (initialYear % 400 == 0 || initialYear % 4 == 0 && initialYear % 100 != 0) {
					sum += 29;
				} else {
					sum += 28;
				}
			} else if (c == 4 || c == 6 || c == 9 || c == 11) {
				sum += 30;
			} else {
				sum += 31;
			}
		}
		sum = sum + day;
		int weekday = sum % 7;
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for (int i = 1; i <= weekday; i++) {
			System.out.print("\t");
		}
		for (int m = 1; m <= 30; m++, sum++) {
			if (sum % 7 == 6) {
				System.out.print(m + "\n");
			} else {
				System.out.print(m + "\t");
			}
		}
	}
}