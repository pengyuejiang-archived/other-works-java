// 该文件由姜芃越在2016年09月15日创建于常熟。
// 说明：我记得这是壁虎老师准备制作万年历时的一个测试小程序，用来计算从1900年到2015年一共有多少天。现在来看我感觉好像有一些错误，具体是什么我就不管了。
public class A4_22static {
	public static void main(String[] args) {
		int sum = 0;
		for (int year = 1900; year <= 2015; year++) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				sum = sum + 366;
			} else {
				sum = sum + 365;
			}
		}
		for (int month = 1; month <= 4; month++) {
			if (month == 2) {
				if (2016 % 4 == 0 && 2016 % 100 != 0 || 2016 % 400 == 0) {
					sum += 29;
				} else {
					sum += 28;
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				sum += 30;
			} else {
				sum += 31;
			}
		}
		System.out.println(sum + 7);
	}
}
// 更新历史：
// 1.0.0 计算1900年至2015年一共有多少天。时间：2016年09月15日。