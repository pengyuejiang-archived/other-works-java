class primeNumberChapter24 {
	public static void main(String[] args) {
		boolean[] a = new boolean[10001];
		int i, j;
		for (i = 2; i < 10001; i++) {
			a[i] = true;
		}
		for (i = 2; i < 101; i++) {
			if (a[i]) {
				for (j = 2; j <= 10000 / i; j++) {
					a[i*j] = false;
				}
			}
		}
		for (i = 2; i < 10001; i++) {
			if (a[i]) {
				System.out.print(i + ", ");
			}
		}
	}
}