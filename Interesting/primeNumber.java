// Created in 2016.12.29, Suzhou, China. By Pengyue Jiang.
class primeNumber {
	public static void main(String[] args) {
		boolean[] number = new boolean[10000];
		for (int i = 0; i < 10000; i++) {
			number[i] = true;
		}
		for (int i = 0; i < 10000; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					number[i] = false;
				}
			}
			if (number[i] && i > 1) {
				System.out.print(i + " ,");
			}
		}
	}
}
// Update history:
// 1.0.0 Enable user to print prime numbers within 10000. Date: 2016.12.29.