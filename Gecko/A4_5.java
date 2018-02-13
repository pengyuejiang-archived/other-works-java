// 该文件由姜芃越在2016年09月17日创建于常熟。
// 说明：这是在学习while循环结构时的一个小应用，不错的练习。
import java.util.Scanner;
public class A4_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学员的人数：");
		int number = input.nextInt();
		// 完整循环结构：
		int initial = 1;
		double sum = 0;
		while (initial <= number) {
			System.out.print("请输入第" + initial + "个学生的成绩：");
			sum += input.nextDouble();
			initial++;
		}
		// 循环结束
		/*
		如果上面那一段是用for循环结构写的，那么会简洁许多：
		double sum = 0; // 需要单独列出来，因为sum不能是局部变量。
		for (int initial = 1; initial <= number; initial++) {
			System.out.print("请输入第" + initial + "个学生的成绩：");
			sum += input.nextDouble();
		}
		System.out.println("这些学生的平均分是：" + sum / number);
		*/
		System.out.println("这些学生的平均分是：" + sum / number);
	}
}
// 更新历史：
// 1.0.0 提供了计算学生平均分的服务。时间：2016年09月17日。
// 1.0.1 简化了代码并且优化了用户界面。时间：2017年2月14日。