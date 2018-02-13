// Created in 2016.09.12, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class rockPaperScissors {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("---------猜拳游戏---------");
		String response;
		do {
			System.out.println("请出拳（1.剪刀／2.石头／3.布）");
			int result = in.nextInt();
			int computer = (int)(Math.random()*3);
			if (result == 1) {
				switch (computer) {
					case 0:
						System.out.println("你出的是剪刀，电脑也出了剪刀，平局。");
						break;
					case 1:
						System.out.println("你出的是剪刀，电脑出了石头，你输了。");
						break;
					case 2:
						System.out.println("你出的是剪刀，电脑出了布，你赢了。");
						break;
				}
			}
			if (result == 2) {
				switch (computer) {
					case 0:
						System.out.println("你出的是石头，电脑出了剪刀，你赢了。");
						break;
					case 1:
						System.out.println("你出的是石头，电脑也出了石头，平局。");
						break;
					case 2:
						System.out.println("你出的是石头，电脑出了布，你输了。");
						break;
				}
			}
			if (result == 3) {
				switch (computer) {
					case 0:
						System.out.println("你出的是布，电脑出了剪刀，你输了。");
						break;
					case 1:
						System.out.println("你出的是布，电脑出了石头，你赢了。");
						break;
					case 2:
						System.out.println("你出的是布，电脑也出了布，平局。");
						break;
				}
			}
			System.out.println("是否继续进程？('y'/'n')");
			response = in.next();
		} while (response.equals("y"));
		System.out.println("游戏结束");
	}
}
// Update history:
// 1.0.0 Enable user to play rock-paper-scissors.
// 1.1.0 Enable user to play multiple times. Date: 2016.09.14.