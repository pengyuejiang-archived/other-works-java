// 该文件由姜芃越在2016年12月11日创建于常熟。
// 说明：这段代码原本是为了将汉字加密成Unicode而写的，但是是一个不错的小练习。
import java.util.Scanner;
class characterConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要转换的字符个数：");
		int n = input.nextInt();
		char c[] = new char[n]; // 建立用来接收字符的数组。
		int u[] = new int[n]; // 建立用来存储最终输出结果的数组。
		for (int i = 0; i < n; i++) {
			System.out.print("请输入第" + (i + 1) + "个字符：");
			c[i] = input.next().charAt(0); // 循环输入。
			u[i] = c[i]; // 将字符转化成整数。
		}
		for (int i = 0; i < n; i++) {
			if (i == n - 1) { // 判断最后一个Unicode编码的输出。
				System.out.println(u[i]);
			} else {
				System.out.print(u[i] + ", ");
			}
		}
	}
}
// 更新历史：
// 1.0.0 提供将汉字转化成Unicode编码的服务。时间：2016年12月11日。