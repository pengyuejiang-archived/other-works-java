/*
 * 说明：
 * 已经好久没有写代码了
 * 东西只要不用就会忘记
 * 今天来做一个小小的需求来复习语法知识点
 */
// 需求：不使用数组打印斐波那契数列
public class Fibonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = a;
		int c = a + b;
		System.out.print(a + ", ");
		for (int i = 0; i < 10; i++) {
			System.out.print(b + ", " + c + ", ");
			a = c;
			b = a + b;
			c = a + b;
		}
	}
}