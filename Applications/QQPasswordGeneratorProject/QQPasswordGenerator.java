/*
需求：根据QQ账号加密密码的程序。
需要包含的功能：
1. 一个用于获取补数的方法。
2. 一个用于将补数翻转的方法。
3. 一个用于将补数加到原QQ账号上的方法。
4. 一个用于将结果转化为十六进制的方法。
*/
import java.util.Scanner;

public class QQPasswordGenerator {

	static long getComplement(long account, int length) {
		/*
		思路：
		1. 获取对应位数的最大数。
		2. 返回“用该数减去QQ账号”的值。
		*/
		long max = 0;
		long multiplier = 1;
		for (int i = 1; i <= length; i++) {
			max += multiplier * 9;
			multiplier *= 10;
		}
		return max - account;
	}
	static long numberFlip(long number, int length) {
		/* 思路：
		1. 用一个数组用来存储原来的每一位数。
		2. 将存储的值逆序提取、相加。
		*/
		/* 实例：
		1234如何变成4321？
		1234 % 10 = 4;
		4 / (10 / 10) => num[0];
		1234 - 4;
		1230 % 100 = 30;
		30 / (100 / 10) => num[1];
		…
		*/
		long divisor = 1;
		int[] numbers = new int[length];
		for (int i = 0; i < length; i++) {
			divisor *= 10;
			numbers[i] = (int)(number % divisor / (divisor / 10));
			number -= numbers[i];
		}
		long result = 0;
		for (int i = 0; i < length; i++) {
			divisor /= 10;
			result += numbers[i] * divisor;
		}
		return result;
	}
	static long addition(long account, long number) {
		return account + number;
	}
	static String hexadecimal(long number) {
		/*
		思路：
		1. 通过短除法获取每一位的值。
		2. 通过判断(switch分支结构)将其存储到一个数组中去。
		3. 将数组打印出来。
		*/
		/* 实例：
		如何将1234变成十六进制？
		1234 % 16 => num[0];
		(int)(1234 / 16);
		77 % 16 => num[1];
		(int)(77 / 16);
		…
		*/
		/* 草稿本（短除法）：
		16  |  1234  ......  2  => num[0];
			_________
		16  |  77    ......  13 => num[1];
			_________
			   4				=> num[2];
		13 => D;
		写成：0x4D2
		*/
		String[] numbers = new String[16];
		int terminalValue = 0; // 这个变量是万不得已之策。
		// 因为0x后面的一大堆null我没法去掉，所以只能从numbers[terminalValue]开始打印。
		for (int i = 0; number != 0; i++) {
			numbers[i] = Long.toString(number % 16);
			number = number / 16;
			switch (numbers[i]) {
				case "10":
					numbers[i] = "A";
					break;
				case "11":
					numbers[i] = "B";
					break;
				case "12":
					numbers[i] = "C";
					break;
				case "13":
					numbers[i] = "D";
					break;
				case "14":
					numbers[i] = "E";
					break;
				case "15":
					numbers[i] = "F";
					break;
			}
			terminalValue = i;
		}
		String result = numbers[terminalValue]; // 不能一开始定义，否则无法去除null。
		for (int i = terminalValue - 1; i >= 0; i--) {
			result += numbers[i];
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入QQ账号：");
		long account = input.nextLong();
		System.out.print("请输入QQ账号的位数：");
		int length = input.nextInt();
		long number = account;
		number = QQPasswordGenerator.getComplement(number, length);
		System.out.println(number); // 测试
		number = QQPasswordGenerator.numberFlip(number, length);
		System.out.println(number); // 测试
		number = QQPasswordGenerator.addition(account, number);
		System.out.println(number); // 测试
		System.out.println("加密之后的密码是：0x" + QQPasswordGenerator.hexadecimal(number));
	}

}