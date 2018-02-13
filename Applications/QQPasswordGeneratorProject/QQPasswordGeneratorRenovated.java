/*
 * 需求：根据QQ账号加密密码的程序。
 * 需要包含的功能：
 * 1. 一个用于获取补数的方法。
 * 2. 一个用于将补数翻转的方法。直接调用reverse()方法即可。
 * 3. 一个用于将补数加到原QQ账号上的方法。
 * 4. 一个用于将结果转化为十六进制的方法。直接调用包装类的toHexString()方法即可。
 */
import java.util.Scanner;

public class QQPasswordGeneratorRenovated {

	public static long getComplement(long number) {
		return getMax(getLength(number)) - number;
	}

	private static int getLength(long number) {
		// 用来判断账号长度的方法：
		int length = 1;
		Long indicator = 1L;
		for(; number / indicator != 0; length++) {
			indicator *= 10;
		}
		// 因为最后一次判断的时候是不会通过的，
		// 所以减去一位的偏移量：
		return length - 1;
	}

	private static long getMax(int length) {
		long max = 0L;
		long indicator = 1L;
		for (; length > 0; length--) {
			max += indicator * 9;
			indicator *= 10;
		}
		return max;
	}

	public static long reverse(long number) {
		Long box = new Long(number);
		box = Long.parseLong(new StringBuilder(Long.toString(box)).reverse().toString());
		return box.longValue();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("账号：");
		long account = scanner.nextLong();
		long number = getComplement(account);
		number = reverse(number);
		System.out.println("密码：0x" + Long.toHexString(account + number));
	}

}
