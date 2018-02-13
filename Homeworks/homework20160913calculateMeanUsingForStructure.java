import java.util.Scanner;
public class homework20160913calculateMeanUsingForStructure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的学科数目：");
		int subjects = in.nextInt();
		int sum = 0;
		for (int i = 1; i <= subjects; i++) {
			System.out.println("请输入第" + i + "门学科的成绩：");
			int temp = in.nextInt();
			sum = sum + temp;
		}
		double avg = ((double)sum / (double)subjects);
		System.out.println("你的平均分是：" + avg + "分。");
	}
}