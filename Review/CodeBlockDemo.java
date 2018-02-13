// 用来体现静态代码块和初始化代码块执行的先后顺序
public final class CodeBlockDemo {
	// 应当在字节码加载进方法区时执行
	static {
		System.out.println("静态代码块");
	}
	// 应当在每一个对象创建之时执行
	{
		System.out.println("初始化代码块");
	}
	private CodeBlockDemo() {
		System.out.println("构造器");
	}
	public static void main(String[] args) {
		System.out.println("主方法");
		new CodeBlockDemo();
	}
}