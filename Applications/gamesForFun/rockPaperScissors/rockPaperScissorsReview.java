// 该文件由姜芃越在2016年12月29日创建于苏州。
// 说明：我原来写过两个版本的猜拳游戏，这次其实就是为了复习一下相关的知识才写的。
import java.util.Scanner;
public class rockPaperScissorsReview {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----------猜拳游戏----------");
		String response;
		do {
			System.out.print("请出拳(1.剪刀 2.石头 3.布)：");
			int player = input.nextInt();
			switch (player) {
				case 1:
					System.out.print("你出了剪刀，");
					break;
				case 2:
					System.out.print("你出了石头，");
					break;
				case 3:
					System.out.print("你出了布，");
					break;
			}
			int computer = (int)(Math.random()*3)+1;
			switch (computer) {
				case 1:
					System.out.print("电脑出了剪刀，");
					break;
				case 2:
					System.out.print("电脑出了石头，");
					break;
				case 3:
					System.out.print("电脑出了布，");
					break;
			}
			if (player == 3 && computer == 2 || player == 2 && computer == 1 || player == 1 && computer == 3) {
				System.out.println("你赢了。");
			} else if (player == computer) {
				System.out.println("平局。");
			} else {
				System.out.println("你输了。");
			}
			System.out.print("是否继续进程？(y/n): ");
			response = input.next();
		} while (response.equals("y"));
	}
}
// 更新历史：
// 1.0.0 提供猜拳游戏的服务。时间：2016年12月29日。