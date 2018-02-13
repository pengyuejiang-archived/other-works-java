// 该文件由姜芃越在2016年12月11日创建于常熟。
// 说明：这段代码是作为characterConverter的补充插件。
import java.util.Scanner;
class characterCalibrator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入需要校验的字符数量：");
		int n = input.nextInt();
		int[] u = new int[n]; // 建立用来接收Unicode的数组。
		char[] c = new char[n]; // 建立用来存储最终输出结果的数组。
		for (int i = 0; i < n; i++) {
			System.out.print("请输入第" + (i + 1) + "个字符的Unicode编码：");
			u[i] = input.nextInt(); // 循环输入。
			c[i] = (char)u[i]; // 强制转换输入的Unicode编码，从整数类型强制转换到字符类型。
		}
		for (int i = 0; i < n; i++) {
			System.out.print(c[i]); // 循环输出结果。
		}
	}
}
// 更新历史：
// 1.0.0 提供将Unicode编码转化成汉字的服务。时间：2016年12月11日。