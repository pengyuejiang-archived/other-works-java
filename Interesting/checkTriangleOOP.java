class Triangle {
	int hypotenuse, side1, side2;
	Triangle(int var, int var1, int var2) {
		hypotenuse = var;
		side1 = var1;
		side2 = var2;
	}
	static void examine(int var, int var1, int var2) {
		if ((var1 + var2) > var) {
			System.out.println("This triangle exists.");
		} else {
			System.out.println("This triangle does not exist.");
		}
	}
}
public class checkTriangleOOP {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(9, 5, 4);
		Triangle.examine(t1.hypotenuse, t1.side1, t1.side2);
	}
	
}