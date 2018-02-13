class ExtendDemo {
	public static void main(String[] args) {
		String name;
		int age;
		B b = new B("John", 16);
		System.out.println(b.name + b.age);
		b.printa();
	}
}

class A {
	String name;
	A(String name) {
		this.name = name;
	}
}

class B extends A {
	public void printa() {
		System.out.println(super.name);
	}
	int age;
	B(String name, int age) {
		super(name);
		this.age = age;
	}
}