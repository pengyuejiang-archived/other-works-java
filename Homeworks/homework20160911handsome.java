import java.util.Scanner;
public class homework20160911handsome {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = info.nextInt();
		System.out.println("请输入你的月薪：");
		int salary = info.nextInt();
		if (age < 25 && salary > 10000) {
			System.out.println("哇！你是高富帅啊？");
		} else {
			System.out.println("我不认识你。");
		}
	}
}