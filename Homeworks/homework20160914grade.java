public class homework20160914grade {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int grade = (int)(Math.random()*100)+1;
			sum = sum + grade;
		}
		double avg = (double)sum / 100;
		System.out.println(avg);
	}
}