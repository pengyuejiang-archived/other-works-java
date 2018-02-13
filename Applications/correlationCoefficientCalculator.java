// 该文件由姜芃越在2016年09月21日创建于常熟。
// 说明：我记得当初我写这段代码的时候我正在学习皮尔森相关系数。当然，对编程的热爱以及想要应用的愿望驱使着我写下了这段代码。其实写这样的代码不需要太多的技术含量，现在看来其实就是将公式用代码的方式带入。不过在当时来看，从代码的长度来讲，也是很有成就感的。
import java.util.Scanner;
public class correlationCoefficientCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response;
		System.out.println("Welcome to correlation coefficient calculator!");
		do {
			// Key in data:
			System.out.print("Please type in how many data you have: ");
			int number = input.nextInt();
			// x:
			double[] x = new double[number];
			double sumx = 0;
			for (int i = 0; i < number; i++) {
				System.out.print("Please type in x No." + (i + 1) + ": ");
				x[i] = input.nextDouble();
				sumx += x[i];
			}
			double meanx = sumx / number;
			sumx = 0;
			for (int i = 0; i < number; i++) {
				sumx += (x[i] - meanx) * (x[i] - meanx);
			}
			double variancex = sumx / number;
			double standardDiviationx = Math.sqrt(variancex);
			// y:
			double[] y = new double[number];
			double sumy = 0;
			for (int i = 0; i < number; i++) {
				System.out.print("Please type in y No." + (i + 1) + ": ");
				y[i] = input.nextDouble();
				sumy += y[i];
			}
			double meany = sumy / number;
			sumy = 0;
			for (int i = 0; i < number; i++) {
				sumy += (y[i] - meany) * (y[i] - meany);
			}
			double variancey = sumy / number;
			double standardDiviationy = Math.sqrt(variancey);
			// combined:
			double sum = 0;
			for (int i = 0; i < number; i++) {
				sum += (x[i] - meanx) * (y[i] - meany);
			}
			double covariance = sum / number;
			// regression line:
			double regressionLineGradient = covariance / (standardDiviationx * standardDiviationx);
			double constant = regressionLineGradient * meanx - meany;
			String sign = "-";
			if (constant < 0) {
				constant = constant * -1;
				sign = "+";
			}
			// Finish.
			System.out.println("The correlation coefficient of this dataset equals to: " + covariance / (standardDiviationx * standardDiviationy));
			System.out.println("Function of regression line is equal to: y = " + regressionLineGradient + "x " + sign + " " + constant);
			// Real code ends.
			System.out.println("Do you want to continue?('y'/'n')");
			response = input.next();
		} while (response.equals("y"));
	}
}
// 更新历史：
// 1.0.0 提供为用户计算皮尔森相关系数的服务。时间：2016年09月22日。
// 1.1.0 允许用户在不重启程序的情况下重复计算。时间：2016年09月28日。
// 2.0.0 加入了回归线的计算。时间：2016年11月04日。