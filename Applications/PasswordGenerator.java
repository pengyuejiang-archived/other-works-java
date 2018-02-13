// 根据用户名生成密码
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// 接收用户输入：
		Scanner scanner = new Scanner(System.in);
		System.out.print("Username: ");
		String username = scanner.next();
		byte[] b = username.getBytes();
		Long code = new Long(1L);
		for (byte i : b) {
			code *= i;
		}
		System.out.println("Password: " + Long.toHexString(code));
	}

}