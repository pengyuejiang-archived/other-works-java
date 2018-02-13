/*
 * Author: Pengyue Jiang
 * Date: 2017 December 20
 * Version: 1.0
 * Description:
 * An improved decryption algorithm..
 * Update log:
 */

import java.util.Scanner;

public class DecryptionImproved {

	public static void main(String[] args) {
		long max = 1000000000000L;
		Scanner scanner = new Scanner(System.in);
		System.out.print("passwd key: ");
		long passwd0 = scanner.nextLong();
		long passwd1 = max - 1 - passwd0;
		passwd1 = Long.parseLong(new StringBuilder(Long.toString(passwd1)).reverse().toString());
		String passwd = Long.toHexString(passwd0 + passwd1);
		System.out.println("passwd: 0x" + passwd);
	}

}
