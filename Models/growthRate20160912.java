// This simple program is a model which is based on the "while" structure.
class growthRate20160912 {
	public static void main(String[] args) {
		int year = 2006;
		double number = 80000;
		while (number < 200000) {
			number = number * 1.25;
			year++;
		}
		System.out.println("They achieved 200,000 people at the year of " + year + ".");
	}
}