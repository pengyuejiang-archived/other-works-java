// 该文件由姜芃越在2017年02月13日创建于常熟。
// 说明：这段代码是当天在老师讲解过如何计算IB分数之后写的，虽然程序非常简单，但是也是一次不错的练习和复习。
import java.util.Scanner;
class IBMarks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 收集数据：
		System.out.print("Please type in your grade for Criterion A: ");
		int mark = input.nextInt();
		System.out.print("Please type in your grade for Criterion B: ");
		mark += input.nextInt();
		System.out.print("Please type in your grade for Criterion C: ");
		mark += input.nextInt();
		System.out.print("Please type in your grade for Criterion D: ");
		mark += input.nextInt();
		// 换算表：
		if (mark < 4) {
			mark = 1;
		} else if (mark < 8) {
			mark = 2;
		} else if (mark < 13) {
			mark = 3;
		} else if (mark < 18) {
			mark = 4;
		} else if (mark < 23) {
			mark = 5;
		} else if (mark < 28) {
			mark = 6;
		} else {
			mark = 7;
		}
		// 输出最终结果：
		System.out.println("Your final mark is " + mark + ".");
	}
}
// 更新历史：
// 1.0.0 允许用户通过输入四个子分数来换算出IB的大分数。时间：2017年02月13日。