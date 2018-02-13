// Created in 2016.09.13, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class numberGuess {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("---------猜数字---------");
		String response;
		int result;
		do {
			// Real code.
			System.out.println("请输入一个1～100之间的数字。");
			int number = (int)(Math.random()*100)+1;
			do {
				result = in.nextInt();
				if (result > number) {
					System.out.println("你的数字大了。");
				}
				if (result < number) {
					System.out.println("你的数字小了。");
				}
			} while (result != number);
			System.out.println("恭喜你猜对了！");
			// Real code ends.
			System.out.println("是否继续游戏？('y'/'n')");
			response = in.next();
		} while (response.equals("y"));
		System.out.println("游戏结束");
	}
}
// Update history:
// 1.0.0 Enable user to play number guess.
// 1.1.1 Enable user to play multiple times and deleted unnecessary codes. Date: 2016.09.14.
// 1.2.1 Fixed a serious bug and deleted unnecessary codes. Date: 2016.09.14.