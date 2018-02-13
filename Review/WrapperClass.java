public class WrapperClass {
	public static void main(String[] args) {
		// 使用包装类的好处：
		// 避免不合理的数据表示：
		// 比如：缺考=0分
		Integer integer = null;
		System.out.println(integer);
		Integer zero = Integer.valueOf(0);
		System.out.println(zero);
	}
}