// 该文件由姜芃越在2016年10月11日创建于常熟。
// 说明：这一段代码实现了二进制与十进制之间的相互转换，其中算法有一些不合理性，但是功能很健全，可以使用。
import java.util.Scanner;
public class binaryConverterModel3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response;
		System.out.println("Welcome to binary converter!");
		do {
			// Real code:
			System.out.println("1. From decimal to binary");
			System.out.println("2. From binary to decimal");
			System.out.print("Please select: ");
			int service = input.nextInt();
			if (service == 1) {
				System.out.print("Please type in a number: ");
				int number = input.nextInt();
				int indicator = 1;
				int sum = 0;
				while (number >= 1) {
					if (number % 2 == 1 || number == 1){
						sum += indicator;
					}
					indicator = indicator * 10;
					number = number / 2;
				}
				System.out.println("The result in binary is: " + sum);
			} else if (service == 2) {
				System.out.print("Please type in a number: ");
				int number = input.nextInt();
				int indicator = 1;
				int sum = 0;
				while (number >= 1) {
					if (number % 10 == 1 || number == 1) {
						sum += indicator;
					}
					indicator = indicator * 2;
					number = number / 10;
				}
				System.out.println("The result in decimaly is: " + sum);
			}
			// Real code ends.
			System.out.println("Do you want to continue? ('y'/'n')");
			response = input.next();
		} while (response.equals("y"));
	}
}
// 更新历史：
// 1.0.0 提供十进制到二进制的转换服务。时间：2016年10月11日。
// 2.0.0 加入了二进制到十进制的转换服务。时间：2016年11月04日。