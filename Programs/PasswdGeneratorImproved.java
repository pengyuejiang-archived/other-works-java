/*
 * Author: Pengyue Jiang
 * Date: 2017 December 20
 * Version: 1.0
 * Description:
 * An improved encryption algorithm.
 * Update log:
 */

public class PasswdGeneratorImproved {

	public static void main(String[] args) {
		long max = 1000000000000L;
		long passwd0;
		long passwd1;
		String passwd;
		for (;;) {
			passwd0 = (long)(Math.random() * 1000000000000L);
			passwd1 = max - 1 - passwd0;
			passwd1 = Long.parseLong(new StringBuilder(Long.toString(passwd1)).reverse().toString());
			passwd = Long.toHexString(passwd0 + passwd1);
			if (passwd.length() == 10) {
				break;
			}
		}
		System.out.println("passwd key: " + passwd0);
		System.out.println("passwd: 0x" + passwd);
	}

}
