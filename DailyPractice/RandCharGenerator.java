public class RandCharGenerator {
	public static void main(String[] args) {
		char c = (char)(Math.random() * 0xfffff);
		int i = (int)c;
		System.out.println("Unicode: 0x" + Integer.toHexString(i));
		System.out.println("Character: " + c);
	}
}
