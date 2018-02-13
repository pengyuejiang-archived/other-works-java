// 该文件由姜芃越在2016年09月17日创建于常熟。
// 说明：我还记得这是我在壁虎老师的班里头初次接触while循环结构时写下的代码，能够累加1到100的整数。
public class A4_4 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1+2+3+…+100=" + sum);
	}
}
// 更新历史：
// 1.0.0 提供计算1到100的累加结果的服务。时间：2016年09月17日。