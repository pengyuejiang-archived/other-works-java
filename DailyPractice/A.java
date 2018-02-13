public class A extends B {
	public static void main(String[] args) {
		new A().count();
	}
	public void doWork() {
		String str = "";
		for (int i = 0; i < 30000; i++) {
			str += i;
		}
	}
}

abstract class B {
	public void count() {
		long begin = System.currentTimeMillis();
		this.doWork();
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
	public abstract void doWork();
}