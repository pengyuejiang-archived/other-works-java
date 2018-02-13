import java.util.Scanner;
public class homework20160911pig {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int pig = in.nextInt();
		if (pig == 0) {
			System.out.println("系统生成了一只白猪。");
		} else if (pig == 1) {
			System.out.println("系统生成了一只黑猪。");
		} else if (pig == 2) {
			System.out.println("系统生成了一只红猪。");
		} else {
			System.out.println("系统生成了一只变形猪。");
		}
	}
}