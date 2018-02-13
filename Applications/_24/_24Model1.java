import java.util.Scanner;

public class _24Model1 {

	static Scanner scanner = new Scanner(System.in);
	static int[] number = new int[4];
	static String[] operator = new String[] {"+", "-", "*", "/"};

	// 数据输入
	public static void setValue() throws Exception {
		for (int i = 1; i <= 4; i++) {
			System.out.print("请输入第" + i + "个数字：");
			number[i - 1] = scanner.nextInt();
			if (number[i - 1] < 1 || number[i - 1] > 10) {
				throw new Exception("输入无效");
			}
		}
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
									System.out.println(number[i] + operator[m] + number[j] + operator[n] + number[k] + operator[o] + number[l]);
									System.out.println("(" + number[i] + operator[m] + number[j] + ")" + operator[n] + number[k] + operator[o] + number[l]);
									System.out.println("(" + number[i] + operator[m] + number[j] + operator[n] + number[k] + ")" + operator[o] + number[l]);
									System.out.println(number[i] + operator[m] + "(" + number[j] + operator[n] + number[k] + ")" + operator[o] + number[l]);
									System.out.println(number[i] + operator[m] + "(" + number[j] + operator[n] + number[k] + operator[o] + number[l] + ")");
									System.out.println(number[i] + operator[m] + number[j] + operator[n] + "(" + number[k] + operator[o] + number[l] + ")");
									System.out.println("(" + number[i] + operator[m] + number[j] + ")" + operator[n] + "(" + number[k] + operator[o] + number[l] + ")");
								}
							}
						}
					}
				}
			}
		}
	}

}