// Created in 2016.09.10, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class leapYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please type in a year to test if it is a leap year:");
		int year = in.nextInt();
		/*
		if (year % 100 == 0) {
		    if (year % 400 == 0) {
				System.out.println("Year " + year + " is a leap year.");
			} else {
				System.out.println("Year " + year + " is not a leap year.");
			}
		} else {
		    if (year % 4 == 0) {
				System.out.println("Year " + year + " is a leap year.");
			} else {
				System.out.println("Year " + year + " is not a leap year.");
			}
		}
		*/
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			System.out.println("Year " + year + " is a leap year.");
		} else {
			System.out.println("Year " + year + " is not a leap year.");
		}
	}
}