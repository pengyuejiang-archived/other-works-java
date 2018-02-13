// 概述：检查三角形是否成立。 
/* 思路：
1. 二维数组的元素作为参数。
2. 用方法求最长边。
3. 用方法检查其他两边之和。
*/
public class checkTrianglePOP {
	static int getHypotenuse(int[][] var, int var1) {
		/* 设计方法：
		1. 参数：包含一组三角形的数组以及检查哪一个三角形。
		2. 返回类型：需要返回长边的索引。
		*/
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < 3; i++) {
			// 以下if结构增强了代码的健壮性。
			if (var[var1][i] <= 0) {
				System.out.println("Error");
				return -1;
			}
			if (var[var1][i] > max) {
				max = var[var1][i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	static boolean examine(int[][] var, int var1) {
		/* 设计方法：
		1. 参数：包含三角形的二维数组，确定哪一个三角形。
		2. 返回类型：三角形成立或者不成立。
		*/
		int hypotenuseIndex = getHypotenuse(var, var1);
		switch (hypotenuseIndex) {
			case 0:
				if ((var[var1][1] + var[var1][2]) > var[var1][hypotenuseIndex]) {
					return true;
				};
				break;
			case 1:
				if ((var[var1][0] + var[var1][2]) > var[var1][hypotenuseIndex]) {
					return true;
				};
				break;
			case 2:
				if ((var[var1][0] + var[var1][1]) > var[var1][hypotenuseIndex]) {
					return true;
				};
				break;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] triangles = new int[][]{
			{4, 2, 5},
			{5, 5, 2},
			{4, 16, 5},
			{8, 2, 12},
			{1, 3, 6}
		};
		if (examine(triangles, 4)) {
			System.out.println("This triangle exists.");
		} else {
			System.out.println("This triangle does not exist.");
		}
	}
}