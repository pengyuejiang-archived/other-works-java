// Created in 2016.09.11, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
import java.util.Random;
public class warGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random number = new Random();
		int number1 = number.nextInt(9);
		switch (number1) {
			case 0:
				System.out.println("You won the war, nothing happened to you in the war.");
				break;
			case 1:
				System.out.println("You won the war, but you died in the war.");
				break;
			case 2:
				System.out.println("You won the war, but you lost a leg in the war.");
				break;
			case 3:
				System.out.println("You won the war, but you lost an arm in the war.");
				break;
			case 4:
				System.out.println("You won the war, but you got injured in the war. You healed after 3 months.");
				break;
			case 5:
				System.out.println("You won the war and you got a small medal.");
				break;
			case 6:
				System.out.println("You won the war and you got a large medal.");
				break;
			case 7:
				System.out.println("You won the war and you got a higher position in the army.");
				break;
			case 8:
				System.out.println("You won the war and you became a commander.");
				break;
			default:
				System.out.println(number1);
				break;
		}
	}
}