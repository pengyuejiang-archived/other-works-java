/*
 * 制作步骤：
 * 1. 声明全局变量扫描仪、数独矩阵和坐标。
 * 2. 制作collectData()数据输入方法。
 * 3. 写fill()方法，编写填入空格的暴力算法。
 * 4. 填写三个Check()方法，完成算法。
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Sudoku {

	private static Scanner scanner = new Scanner(System.in);
	private static int[][] matrix = new int[9][9];
	private static int[][] matrixa = new int[9][9];

	public static void collectData() {
		System.out.println("请输入数独矩阵，没有的用\"0\"填充，数字用\",\"隔开：");
		String[] arr = new String[9];
		for (int i = 0; i < 9; i++) {
			arr = scanner.next().split(",");
			for (int j = 0; j < 9; j++) {
				matrix[i][j] = Integer.parseInt(arr[j]);
			}
		}
	}

	public static void fill() {
		outter:for (int r = 0; r < 9; r++) {
			for (int c = 0; c < 9; c++) {
				if (matrix[r][c] == 0) {
					// 问题分析：如果错误的数字不是空的就不会改
					// 解决方案：先存一个副本
					matrix[r][c] = (int)(Math.random() * 9 + 1);
					if (!horizontalCheck(matrix, c, r)) {
						c = 0;
						r = 0;
						reset();
						continue;
					} else if (!verticalCheck(matrix, c, r)) {
						c = 0;
						r = 0;
						reset();
						continue;
					} else if (!blockCheck(matrix, c, r)) {
						c = 0;
						r = 0;
						reset();
						continue;
					}
				}
			}
		}
	}

	public static void reset() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				matrix[i][j] = matrixa[i][j];
			}
		}
	}

	public static boolean horizontalCheck(int[][] matrix, int column, int row) {
		for (int i = 0; i < 9; i++) {
			if (matrix[row][column] == matrix[row][i] && i != column) {
				return false;
			}
		}
		return true;
	}

	public static boolean verticalCheck(int[][] matrix, int column, int row) {
		for (int i = 0; i < 9; i++) {
			if (matrix[row][column] == matrix[i][column] && i != row) {
				return false;
			}
		}
		return true;
	}

	public static boolean blockCheck(int[][] matrix, int column, int row) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int nr = row / 3 * 3 + i;
				int nc = column / 3 * 3 + i;
				if (matrix[row][column] == matrix[nr][nc] && row != nr && column != nc) {
					return false;
				}
			}
		}
		return true;
	}

	public static void showResult(int[][] matrix) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(matrix[i][j]);
				if (j != 8) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		matrixa = matrix;
		collectData();
		fill();
		System.out.println();
		showResult(matrix);
	}

}