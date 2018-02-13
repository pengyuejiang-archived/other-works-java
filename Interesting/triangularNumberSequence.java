public class triangularNumberSequence {
	// recursive definition:
	static int sequence(int n) {
		if (n == 1) {
			return 1;
		} else {
			return sequence(n - 1) + n;
		}
	}
	// deductive rules:
	static int sequnce2(int n) {
		return n * (n + 1) / 2;
	}
	public static void main(String[] args) {
		int u = 25;
		int[] triangularNumber = new int[u];
		for (int i = 1; i <= u; i++) {
			triangularNumber[i - 1] = sequence(i);
			System.out.println(triangularNumber[i - 1]);
		}
		int[] triangularNumber2 = new int[u];
		for (int i = 1; i <= u; i++) {
			triangularNumber2[i - 1] = sequnce2(i);
			System.out.println(triangularNumber2[i - 1]);
		}
	}
}