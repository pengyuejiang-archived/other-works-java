// This program is a simple model which compares if/if else/else structure to switch structure.
// Compare to if/else structure, boolean value is not required.
// The preferred way of doing this is not in comment.
public class switchModel20160912 {
	public static void main(String[] args) {
		int number = (int)(Math.random()*4);
		/*
		if (number == 0) {
			System.out.println("You got a 0!");
		} else if (number == 1) {
			System.out.println("You got a 1!");
		} else if (number == 2) {
			System.out.println("You got a 2!");
		} else {
			System.out.println("You got nothing!");
		}
		*/
		switch (number) {
			case 0:
				System.out.println("You got a 0!");
				break;
			case 1:
				System.out.println("You got a 1!");
				break;
			case 2:
				System.out.println("You got a 2!");
				break;
			default:
				System.out.println("You got nothing!");
				break;
		}
	}
}