// 该文件由姜芃越在2016年09月15日创建于常熟。
// 说明：这段代码是根据一个年份来计算日期差以及目标日期的星期的，有很多不合理性，而且功能过于局限。
import java.util.Scanner;
public class A4_23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please type in the beginning year: ");
		int initialYear = in.nextInt();
		System.out.print("Please type in the ending year: ");
		int finalYear = in.nextInt();
		System.out.print("Please type in the month of the ending year: ");
		int month = in.nextInt();
		System.out.print("Please type in the day of the ending year: ");
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
		System.out.println("There are " + sum + " days between these two years.");
		System.out.println("The final date is 星期" + sum % 7);
	}
}
// 更新历史：
// 1.0.0 计算源年份与目标日期的日期差并且计算目标日期的星期。时间：2016年09月15日。