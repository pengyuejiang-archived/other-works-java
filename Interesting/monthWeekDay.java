// Created in 2016.09.10, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class monthWeekDay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please type in how many days you have:");
		int days = in.nextInt();
		int month = days / 30;
		int week = (days - month * 30) / 7;
		int day = days - month * 30 - week * 7;
		System.out.println("You have " + month + " months "+ week + " weeks and " + day + " days.");
	}
}