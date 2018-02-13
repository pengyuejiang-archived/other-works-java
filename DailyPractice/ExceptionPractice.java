// 用来复习关于异常的知识点：
public class ExceptionPractice {

	public static void main(String[] args) {
		System.out.println("begin…");
		try {
			System.out.println("division…");
			System.out.println(10 / 0);
			System.out.println("division ended…");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("end");

		divideZero();
	}

	private static int  divideZero() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

}
