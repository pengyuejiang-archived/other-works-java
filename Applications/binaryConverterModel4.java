// 该文件由姜芃越在2016年11月30日创建于常熟。
// 说明：该程序是binaryConverterModel3的改良版，虽然功能毫无区别，也没有更加简洁，但是增加了算法的合理性。
import java.util.Scanner;
class binaryConverterModel4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response;
		do {
			System.out.println("1. Decimal to binary.");
			System.out.println("2. Binary to decimal.");
			System.out.print("Please select a service: ");
			int service = input.nextInt();
			// Real code initiates.
			if (service == 1) {
				System.out.print("Please type in a number in decimal: ");
				int number = input.nextInt();
				int indicator = 2;
				int increase = 1;
				int result = 0;
				while (number > 0) {
					if (number % indicator == 1) {
						result += increase;
					}
					number /= 2;
					increase *= 10;
				}
				System.out.println(result);
			} else if (service == 2) {
				System.out.print("Please type in a number in binary: ");
				int number = input.nextInt();
				int indicator = 10;
				int increase = 1;
				int result = 0;
				while (number > 0) {
					if (number % indicator != 0) {
						result += increase;
					}
					number /= 10;
					increase *= 2;
				}
				System.out.println(result);
			}
			// Real code terminates.
			System.out.println("Would you like to continue?(y/n)");
			response = input.next();
		} while (response.equals("y"));
	}
}
// 更新历史：
// 1.0.0 提供了十进制与二进制的双向转换服务。时间：2016年11月30日。