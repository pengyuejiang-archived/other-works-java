// 该文件由姜芃越在2016年09月15日创建于常熟。
// 说明：这段代码是介绍for循环结构时的练习，用于计算两年之间的日期差，不过功能非常局限。
import java.util.Scanner;
public class A4_21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please type in the beginning year: ");
		int initialYear = in.nextInt();
		System.out.print("Please type in the ending year: ");
		int finalYear = in.nextInt();
		int sum = 0;
		for (; initialYear <= finalYear - 1; initialYear++) {
			if (initialYear % 400 == 0 || initialYear % 4 == 0 && initialYear % 100 != 0) {
				sum = sum + 366;
			} else {
				sum = sum + 365;
			}
		}
		System.out.println("There are " + sum + " days between these two years.");
	}
}
// 更新历史：
// 1.0.0 提供计算两年之间的日期差。时间：2016年09月15日。