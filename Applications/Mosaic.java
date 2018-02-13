// Created by Pengyue Jiang @Changshu @Augest 29, 2017.
import java.util.Scanner;

public class Mosaic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入需要打码的字符：");
		String str = s.next();
		for (int i = 0; i < str.length(); i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}