public class Haha extends EfficiencyTester {
	public static void main(String[] args) {
		Haha haha = new Haha();
		haha.getEfficiency();
	}
	
	public void work() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}
}