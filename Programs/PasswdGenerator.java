/*
 * Author: Pengyue Jiang
 * Date: 2017 December 20
 * Version: 1.0
 * Description:
 * Password generator based on converting random decimal numbers to hexadecimal numbers.
 * Update log:
 */

public class PasswdGenerator {

	public static void main(String[] args) {
		long passwd = (long)(Math.random() * Long.parseLong("FFFFFFFFFF", 16));
		System.out.println("passwd key: " + passwd);
		System.out.println("passwd: 0x" + Long.toHexString(passwd));
	}

}
