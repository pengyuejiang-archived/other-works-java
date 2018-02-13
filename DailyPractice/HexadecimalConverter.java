import java.util.Scanner;

class HexadecimalConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type in your hexadecimal number: ");
		System.out.println(Integer.parseInt(scanner.nextLine(), 16));
	}

}
