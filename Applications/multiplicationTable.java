// 该文件由姜芃越在2016年09月18日创建于常熟。
// 说明：这段代码能够打印出九九乘法表，一个相当经典的应用，并且是一个非常不错的for循环嵌套结构的练习。
public class multiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + j*i);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}
// 更新历史：
// 1.0.0 提供打印九九乘法表的服务。时间：2016年09月18日。