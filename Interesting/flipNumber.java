// 在学习了String的reverse方法之后我笑了。
import java.util.Scanner;

class flipNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("digit: ");
		int d = input.nextInt(); // Confirm digits
		System.out.print("number: ");
		int n = input.nextInt(); // Confirm the number
		int[] a = new int[d]; // Confirm arrays
		int ind = 10;
		for (int i = 0; i < d; i++) {
			a[i] = n - (n / ind) * ind;
			ind *= 10;
			if (i != 0) {
				for (int c = 1; c <= i; c++) {
					a[i] -= a[i - c];
				}
			}
		}
		int f = 1;
		for (int i = 0; i < d; i++) {
			a[i] /= f;
			System.out.print(a[i]);
			f *= 10;
		}
	}

}