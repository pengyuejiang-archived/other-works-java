// Created in 2016.09.12, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class rockPaperScissorsModel2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("---------猜拳游戏---------");
		String response;
		do {
			System.out.println("请出拳（1.剪刀／2.石头／3.布）");
			int result = in.nextInt();
			int computer = (int)(Math.random()*3)+1;
			switch (result) {
				case 1:
					System.out.print("你出的是剪刀，");
					break;
				case 2:
					System.out.print("你出的是石头，");
					break;
				case 3:
					System.out.print("你出的是布，");
					break;
			}
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
			if (result == computer) {
				System.out.println("平局。");
			} else if (result == 1 && computer == 2 || result == 2 && computer == 3 || result == 3 && computer == 1) {
				System.out.println("你输了。");
			} else {
				System.out.println("你赢了。");
			}
			System.out.println("是否继续游戏？('y'/'n')");
			response = in.next();
		} while (response.equals("y"));
		System.out.println("游戏结束");
	}
}
// Update history:
// 1.0.0 Enable user to play rock-paper-scissors.
// 1.1.0 Enable user to play multiple times. Date: 2016.09.14.