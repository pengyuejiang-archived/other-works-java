// This program is a simple model of various ways of generating random numbers in a certain range.
// The preferred way of doing this is not in comment.
/*
import java.util.Random;
public class randomModel20160911 {
	public static void main(String[] args) {
		Random number = new Random();
		int number1 = number.nextInt(10); //Because 0~9 has 10 numbers.
		System.out.println(number1);
	}
}
*/
public class randomModel20160911 {
	public static void main(String[] args) {
		int number = (int)(Math.random()*10); //Because 0~9 has 10 numbers. (int) forced "number" to be an integer.
		System.out.println(number);
	}
}