// This simple program is a model of how primary operators and tertiary operators work.
public class operatorModel20160912 {
	public static void main(String[] args) {
		int a = 12;
		int b = a++;
		System.out.println(a + b);
		int c = 22;
		int d = ++c;
		System.out.println(c + d);
		int e = a > 13 ? 36 : 44;
		System.out.println(e);
	}
}