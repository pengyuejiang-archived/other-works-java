// 需求：录入班级人数和学员成绩，计算平均成绩
import java.util.Scanner;

// 养成良好习惯，一个类单独一个文件，类名大写，符合标识符规范，有意义：
public class Grades {
	public static void main(String[] args) throws NumberFormatException {
		Scanner scanner = new Scanner(System.in);
		// 在恰当的时候使用print而不是println方法来使界面更美观：
		System.out.print("班级人数（学员数量）：");
		// 存储学生数量在number中：
		int number = scanner.nextInt();
		// 用number变量创建数组：
		int[] grades = new int[number];
		int sum = 0;
		// for循环用于次数已知的迭代，用它更方便：
		for (int i = 0; i < number; i++) {
			// 注意：迭代从0开始，因此需要加一，但是记住
			// 任何和String相加的数据都会成为String，因此用括号先括起来：
			System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
			// 数组从0开始：
			grades[i] = scanner.nextInt();
			// 用+=更优雅：
			sum += grades[i];
		}
		System.out.println("学员们的平均成绩是：" + (sum / number));
		scanner.close();
		System.exit(0);
	}
}
