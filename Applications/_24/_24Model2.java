import java.util.Scanner;

public class _24Model2 {
	private static Scanner scanner = new Scanner(System.in);
	static double[] num = new double[4];
	static String[] oprt = new String[] {"+", "-", "*", "/"};

	// 数据输入
	public static void setValue() throws Exception {
		for (int i = 1; i <= 4; i++) {
			System.out.print("请输入第" + i + "个数字：");
			num[i - 1] = scanner.nextInt();
			if (num[i - 1] < 1 || num[i - 1] > 10) {
				throw new Exception("输入无效");
			}
		}
	}

	// 五种计算模式
	// 计算模式1
	private static void calculate(String brkt1, String brkt2, double num1, int op1, double num2, String brkt3, int op2, double num3, String brkt4, int op3, double num4) {
		if (calc(calc(calc(num1, op1, num2), op2, num3), op3, num4) == 24) {
			System.out.println("" + brkt1 + brkt2 + (int)num1 + oprt[op1] + (int)num2 + brkt3 + oprt[op2] + (int)num3 + brkt4 + oprt[op3] + (int)num4 + "=24");
		}
	}
	private static void calculate(String brkt1, double num1, int op1, String brkt2, double num2, int op2, double num3, String brkt3, String brkt4, int op3, double num4) {
		if (calc(calc(num1, op1, calc(num2, op2, num3)), op3, num4) == 24) {
			System.out.println("" + brkt1 + (int)num1 + oprt[op1] + brkt2 + (int)num2 + oprt[op2] + (int)num3 + brkt3 + brkt4 + oprt[op3] + (int)num4 + "=24");
		}
	}
	private static void calculate(double num1, int op1, String brkt1, String brkt2, double num2, int op2, double num3, String brkt3, int op3, double num4, String brkt4) {
		if (calc(num1, op1, calc(calc(num2, op2, num3), op3, num4)) == 24) {
			System.out.println("" + (int)num1 + oprt[op1] + brkt1 + brkt2 + (int)num2 + oprt[op2] + (int)num3 + brkt3 + oprt[op3] + (int)num4 + brkt4 + "=24");
		}
	}
	private static void calculate(double num1, int op1, String brkt1, double num2, int op2, String brkt2, double num3, int op3, double num4, String brkt3, String brkt4) {
		if (calc(num1, op1, calc(num2, op2, calc(num3, op3, num4))) == 24) {
			System.out.println("" + (int)num1 + oprt[op1] + brkt1 + (int)num2 + oprt[op2] + brkt2 + (int)num3 + oprt[op3] + (int)num4 + brkt3 + brkt4 + "=24");
		}
	}
	private static void calculate(String brkt1, double num1, int op1, double num2, String brkt2, int op2, String brkt3, double num3, int op3, double num4, String brkt4) {
		if (calc(calc(num1, op1, num2), op2, calc(num3, op3, num4)) == 24) {
			System.out.println("" + brkt1 + (int)num1 + oprt[op1] + (int)num2 + brkt2 + oprt[op2] + brkt3 + (int)num3 + oprt[op3] + (int)num4 + brkt4 + "=24");
		}
	}

	private static double calc(double num1, int op, double num2) {
		switch (op) {
			case 0:
				return num1 + num2;
			case 1:
				return num1 - num2;
			case 2:
				return num1 * num2;
			case 3:
				if (num2 == 0) {
					return 0;
				}
				return num1 / num2;
		}
		return 0;
	}

	// 主方法
	public static void main(String[] args) {
		try {
			setValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 暴力算法：
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == i) {
					continue;
				}
				for (int k = 0; k < 4; k++) {
					if (k == i || k == j) {
						continue;
					}
					for (int l = 0; l < 4; l++) {
						if (l == i || l == j || l == k) {
							continue;
						}
						for (int m = 0; m < 4; m++) {
							for (int n = 0; n < 4; n++) {
								for (int o = 0; o < 4; o++) {
									calculate("(", "(", num[i], m, num[j], ")", n, num[k], ")", o, num[l]);
									calculate("(", num[i], m, "(", num[j], n, num[k], ")", ")", o, num[l]);
									calculate(num[i], m, "(", "(", num[j], n, num[k], ")", o, num[l], ")");
									calculate(num[i], m, "(", num[j], n, "(", num[k], o, num[l], ")", ")");
									calculate("(", num[i], m, num[j], ")", n, "(", num[k], o, num[l], ")");
								}
							}
						}
					}
				}
			}
		}
	}

}