// Created in 2016.09.10, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class weekDay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please type in how many days you have:");
		int days = in.nextInt();
		int day = days % 7;
		int week = days / 7;
		System.out.println("You have " + week + " weeks and " + day + " days.");
	}
}