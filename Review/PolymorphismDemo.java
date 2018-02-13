class PolymorphismDemo {
	public static void main(String[] args) {
		Thread t = new T();
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("a" + i);
		}
	}
}

class T extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("b" + i);
		}
	}
}