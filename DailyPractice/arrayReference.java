// 用来证明数组不可以直接拷贝，否则就共享内存引用。
public class arrayReference {
	public static void main(String[] args) {
		int[] src = new int[]{ 3, 4, 5 };
		int[] dest = new int[3];
		dest = src;
		src[2] = 1;
		System.out.println(dest[2]);
		/* 正确的方式应该是：
		for (int i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
		*/
	}
}