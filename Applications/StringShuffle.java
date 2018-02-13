// Created by Pengyue Jiang @Changshu @Augest 29, 2017.
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

// 需求：打乱一个字符串列表
// 详情请参见com.pengyue.util.ArrayUtil
public class StringShuffle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		// 实际上下面的步骤可以用正则表达式完成：
		System.out.print("数据条目：");
		int n = s.nextInt();
		String[] str = new String[n];
		String[] $str = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("第" + (i + 1) + "条数据：");
			str[i] = s.next();
		}
		// 乱序算法：
		int[] indexes = new int[n];
		for (int i = 0; i < indexes.length; i++) {
			int temp = (int)(Math.random() * (n + 1));
			for (int j = 0; j <= i; j++) {
				if (temp == indexes[j]) {
					i--;
					break;
				} else if (i == j) {
					indexes[i] = temp;
				}
			}
		}
		// 减去偏移量：
		for (int i = 0; i < indexes.length; i++) {
			indexes[i] -= 1;
		}
		// 赋给副本数组：
		for (int i = 0; i < str.length; i++) {
			$str[i] = str[indexes[i]];
		}
		System.out.println("列表：" + Arrays.toString($str));
	}

}