// 该文件由姜芃越在2016年09月15日创建于苏州。
// 说明：这是当初学习单变量数据分析时的一个小应用。跟皮尔森相关系数计算器一样，这一段代码也是将课上学习到的数学公式转化成代码。在当时看来也是很不错的。
import java.util.Arrays;
import java.util.Scanner;
public class statisticAssistant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to statistic assistant!");
		String response;
		double sum = 0;
		do {
			// Real code:
			// Key in data:
			System.out.print("Please type in the number of data: ");
			int n = in.nextInt();
			double[] data = new double[n];
			for (int i = 1; i <= n; i++) {
				System.out.print("Please type in data No." + i + ": ");
				data[i - 1] = in.nextDouble();
				sum += data[i - 1];
			}
			// Get the mean:
			double avg = sum / n;
			sum = 0;
			for (int i = 1; i <= n; i++) {
				double temp = (data[i - 1] - avg) * (data[i - 1] - avg);
				sum += temp;
			}
			// Sort data.
			Arrays.sort(data);
			System.out.println("The minimum value of this dataset equals: " + data[0] + ".");
			double median;
			if (n % 2 == 0) {
				median = (data[n / 2 - 1] + data[n / 2]) / 2;
			} else {
				median = data[(n + 1) / 2 - 1];
			}
			System.out.println("The median of this dataset equals: " + median + ".");
			System.out.println("The maximum value of this dataset equals: " + data[n-1] + ".");
			System.out.println("The mean value of this dataset equals: " + avg + ".");
			double variance = sum / n;
			System.out.println("The variance of this dataset equals: " + variance + ".");
			double standardDeviation = Math.sqrt(variance);
			System.out.println("The standard deviation of this dataset equals: " + standardDeviation + ".");
			// Real code ends.
			System.out.println("Do you want to continue? ('y'/'n')");
			response = in.next();
		} while (response.equals("y"));
		System.out.println("Program ends.");
	}
}
// 更新历史：
// 1.0.0 提供计算方差的服务。时间：2016年09月15日。
// 2.0.0 加入了计算标准差的服务。时间：2016年09月16日。
// 2.0.1 修改了运行错误（拼写错误）。时间：2016年09月16日。
// 3.0.0 加入了计算最小值、最大值、中位数和平均值的服务。时间：2016年09月19日。