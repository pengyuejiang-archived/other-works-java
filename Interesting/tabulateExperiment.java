public class tabulateExperiment {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 16 == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + "\t");
			}
		}
	}
}