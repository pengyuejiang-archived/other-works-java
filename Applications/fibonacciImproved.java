class fibonacciImproved {
	public static void main(String[] args) {
		int place = 9;
		int a = 1;
		int b = 1;
		int c = 0;
		for (int i = 1; i <= place; i++) {
			c = a + b;
			a = b;
			b = c;
			if (i == place) {
				System.out.println(c);
			} else {
				System.out.print(c + ", ");
			}
		}
	}
}