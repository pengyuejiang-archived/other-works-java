// 该文件由姜芃越在2017年03月06日创建于常熟。
// 说明：今天上物理课的时候封欣雨要同我对局二十四点，我没有纸牌，所以想用计算机来完成这个工作。
import java.util.Scanner;

public class _24Generator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response;
		do {
			// 代码：
			for (int i = 0; i < 4; i++) {
				System.out.print((int)(Math.random()*10)+1 + "\t");
			}
			// 代码结束
			System.out.print("是否继续进程？(y/n)：");
			response = input.next();
		} while (response.equals("y"));
		System.out.println("程序终止");
	}

}
// 更新历史：
// 1.0.0 提供二十四点的发牌服务。时间：2017年03月06日。
// 说实话，我可以弄一个GUI版本的。
