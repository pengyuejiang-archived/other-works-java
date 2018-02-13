public class fibonacci {
	public static void main(String[] args) {
		long fibonacci[] = new long[92];
		System.out.print(1 + ", ");
		System.out.print(1 + ", ");
		for (int i = 2; i <= 91; i++) {
			fibonacci[0] = 1;
			fibonacci[1] = 1;
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			if (i == 91) {
				System.out.print(fibonacci[91]);
			} else {
				System.out.print(fibonacci[i] + ", ");
			}
		}
	}
}