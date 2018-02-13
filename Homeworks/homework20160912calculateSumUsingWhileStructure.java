public class homework20160912calculateSumUsingWhileStructure {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("1+2+3+4+…+100=" + sum + ".");
	}
}