import java.util.Scanner;
public class homework20160914love {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			System.out.println("老婆，你爱我吗？");
			String response = in.next();
			if (response.equals("yes")) {
				break;
			}
		}
	}
}