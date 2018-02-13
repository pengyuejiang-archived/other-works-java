public class Algo {

	private Algo() {

	}

	public static Algo algo = new Algo();

	public static void main(String[] args) {
		System.out.println(algo.gcd(15, 6));
		System.out.println(algo.fibonacci(5));
		algo.printPrimeWithin(4000);
		// int[] primeSet = primeWithin(1000);
	}

	// Euclidean Algorithm for finding the gcd of two ints.
	// Assuming that a ≥ b.
	public int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		// Alternatively, you can do this:
		// But it's one more iteration this way:
		// if (b == 0) {
		// 	return a;
		// }
		return gcd(b, a % b);
	}

	// Will find the n-th term of a Fibonacci sequence.
	public int fibonacci(int n) {
		// 把1的判断放在前面效率会稍微高一丁点儿：
		if (n == 1 || n == 0) {
			return 1;
		}
		return fibonacci(n - 2) + fibonacci(n - 1);
	}

	// Prints out all prime nums within the given range.
	public void printPrimeWithin(int n) {
		boolean[] prime = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			prime[i] = true;
			for (int j = 2; j < i; j++) {
				// 在&&中，把更容易false的情况放在前面可以微量提高效率：
				if (i % j == 0 && i != j) {
					prime[i] = false;
				}
			}
			if (prime[i]) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("\b\b ");
	}

}
