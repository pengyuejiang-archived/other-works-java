// 该文件由姜芃越在2017年06月08日创建于常熟。
// 说明：这段代码是再次学习任小龙老师的Java课程时写下的，用来阐述代码思维。
import java.util.Scanner;
public class roomDistribution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("人数：");
		int n = input.nextInt();
		int r;
		if (n % 10 == 0) {
			r = n / 10;
		} else {
			r = n / 10 + 1;
		}
		System.out.println("一共分配" + r + "个房间。");
	}
}
// 更新历史：
// 1.0.0 提供计算非配房间数目的服务。时间：2017年06月08日。