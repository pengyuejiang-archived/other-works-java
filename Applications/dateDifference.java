// 该文件由姜芃越在2017年02月15日创建于常熟。
// 说明：这一段代码是用来计算两个日期之间的天数差的，计算的原理是从源日期一天一天加到目标日期。对于一般的应用来说这个算法已经足够了，只要能完成功能便是万事大吉，但是该算法重复多、速度慢，一定可以有更好的改进方案。
import java.util.Scanner;
public class dateDifference {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 采集数据：
		// 源日期：
		System.out.print("请输入第一个年份：");
		int year1 = input.nextInt();
		System.out.print("请输入第一个月份：");
		int month1 = input.nextInt();
		System.out.print("请输入第一个日期：");
		int day1 = input.nextInt();
		// 目标日期：
		System.out.print("请输入第二个年份：");
		int year2 = input.nextInt();
		System.out.print("请输入第二个月份：");
		int month2 = input.nextInt();
		System.out.print("请输入第二个日期：");
		int day2 = input.nextInt();
		int sum = 0;
		// 计算：
		for (; year1 != year2 || month1 != month2 || day1 != day2; day1++, sum++) {
			// 上一行确立了循环程序的运行条件，也就是源日期不同于目标日期的情况下。一天一天加，知道日期相同为止。
			int dayMax; // 进位上限
			// 下一行确定了什么时候改从“日”向“月”进位。
			if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11) {
				dayMax = 30;
			} else if (month1 == 2) {
				if (year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0) { // 闰年的二月区别对待。
					dayMax = 29;
				} else {
					dayMax = 28;
				}
			} else {
				dayMax = 31;
			}
			if (day1 > dayMax) { // 这就是“日”向“月”进位的代码块。
				day1 = 1;
				if (month1 == 12) { // 这是“月”向“年”进位的代码块。
					month1 = 1;
					year1++;
				} else {
					month1++;
				}
			}
		}
		System.out.println("这两个日期之间有" + sum + "天。");
	}
}
// 更新历史：
// 1.0.0 提供计算两个日期之间日期差的服务。时间：2017年02月15日。