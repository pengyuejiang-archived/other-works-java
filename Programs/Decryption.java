/*
 * Author: Pengyue Jiang
 * Date: 2017 December 20
 * Version: 1.0
 * Description:
 * Complementary program for decrypt passwd key.
 * Update log:
 */

import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("passwd key: ");
		String passwd = Long.toHexString(scanner.nextLong());
		System.out.println("passwd: 0x" + passwd);
	}

}
