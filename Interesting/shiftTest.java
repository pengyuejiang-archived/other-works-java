class shiftTest {
	public static void main(String[] args) {
		byte number = 0b01101110;
		number >>= 2;
		number &= 1;
		System.out.println(number);
	}
}