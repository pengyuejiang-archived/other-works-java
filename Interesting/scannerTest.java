// Created in 2016.09.10, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class scannerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的姓名：");
		String name = in.next();
		System.out.println("请输入你的年龄：");
		int age = in.nextInt();
		System.out.println("请输入你的性别：");
		String gender = in.next();
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
		System.out.println("性别：" + gender);
	}
}