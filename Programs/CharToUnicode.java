/*
 * Author: Pengyue Jiang
 * Date: 2017 December 17
 * Version: 1.0
 * Description:
 * A super-simple but useful tool at converting characters to unicode.
 * Update log:
 * v1.1 @ 2017 December 17: Display unicode in hexadecimal format.
 */

import java.util.Scanner;

public class CharToUnicode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("字符：");
		System.out.println(Integer.toHexString((int)(scanner.next().charAt(0))));
	}

}
