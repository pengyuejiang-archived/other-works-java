/*
 * 上次数独失败了，这次要卧薪尝胆
 * 这次一定要先计划再写代码，避免中间卡壳和逻辑不连贯的情况
 * 希望这次规划之后的代码
 * 能够获得成功，完成需求
 */
/*
 * 虽然算法合理，但是效率太低，也算失败
 */
import java.util.Scanner;

public class Sudoku {
	
	// 数独矩阵：
	public static int[][] matrix = new int[9][9];
	public static int[][] matrixa = new int[9][9];
	
	// 收集数据方法：
	public static void collectData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请逐行输入数独矩阵，用\",\"隔开：");
		for (int i = 0; i < 9; i++) {
			matrix[i] = toIntArray(scanner.next().split(","));
		}
	}
	
	// 内部算法：转换字符串类型数组为整数类型数组
	private static int[] toIntArray(String[] arr) {
		int[] rslt = new int[arr.length];
		for (int i = 0; i < 9; i++) {
			rslt[i] = Integer.parseInt(arr[i]);
		}
		return rslt;
	}
	
	// 调试用方法：
	public static void display(int[][] matrix) {
		System.out.println();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(matrix[i][j]);
				if (j != 9 - 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
	
	// 暴力算法：
	public static void solve() {
		fill();
	}
	
	private static boolean horizontalCheck(int r, int c) {
		for (int i = 0; i < 9; i++) {
			if (matrix[r][i] == matrix[r][c] && i != c) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean verticalCheck(int r, int c) {
		for (int i = 0; i < 9; i++) {
			if (matrix[i][c] == matrix[r][c] && i != r) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean blockCheck(int r, int c) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[r / 3 + i][c / 3 + i] == matrix[r][c] && r / 3 + i != r && c / 3 + i != c) {
					return false;
				}
			}
		}
		return true;
	}
	
	private static void fill() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][j] = (int)(Math.random() * 9 + 1);
					if (!horizontalCheck(i, j) || !verticalCheck(i, j) || !blockCheck(i, j)) {
						i = 0;
						j = 0;
						reset();
						break;
					}
				}
			}
		}
	}
	
	private static void reset() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				matrix[i][j] = matrixa[i][j];
			}
		}
	}
	
	// 备份方法：
	public static void backup() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				matrixa[i][j] = matrix[i][j];
			}
		}
	}
	
	// 主方法：负责程序的运行
	public static void main(String[] args) {
		collectData();
		backup();
		solve();
		System.out.println();
		display(matrix);
		display(matrixa);
	}
	
}