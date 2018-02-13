class brailleCharacters {
	public static void main(String[] args) {
		int braille = 0x2800;
		for (int i = 0; i < 0x40; i++)
		System.out.println((char)(braille + i));
	}
}