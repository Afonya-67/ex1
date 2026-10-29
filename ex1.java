import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintStream;

class ex1calc {

	private int x;
	private int a;
	private int b;

	public ex1calc() {
	}

	public ex1calc(int x) {
		this.x = x;
	}

	public ex1calc(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public ex1calc(int a, int b, int x) {
		this.x = x;
		this.a = a;
		this.b = b;
	}

	public int metod1(int x) { // y = 3 * x + 5
		return 3 * x + 5;
	}

	public int metod1() {
		return metod1(x);
	}

	public int metod2(int a, int b) { // y = (a + b) / (a - b)
		if (a == b)
			return 0;
		return (a + b) / (a - b);
	}

	public int metod2() {
		return metod2(a, b);
	}

	public BigInteger metod3(int a, int b, int x) { // y =(a * x / b)!
		if (b == 0)
			return BigInteger.ZERO;

		return factorial(a * x / b);
	}

	public BigInteger metod3() {
		return metod3(a, b, x);
	}

	public BigInteger factorial(int x) {
		if (x < 0)
			return BigInteger.ZERO;

		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= x; i++) {
			result = result.multiply(BigInteger.valueOf(i));

		}
		return result;
	}
}

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintStream o = System.out;
		o.println("Введи x");
		int x = sc.nextInt();
		ex1calc o1 = new ex1calc(x);
		o.println("y = 3 * x + 5");
		int y1 = o1.metod1();
		o.println("y = "+y1);
		o.println("Введи (через пробел) a и b");

		int a = sc.nextInt();
		int b = sc.nextInt();
		ex1calc o2 = new ex1calc(a, b);
		int y2 = o2.metod2();
		o.println("y = (a + b) / (a - b)");
		o.println("y = "+y2);
		ex1calc o3 = new ex1calc(a, b, x);
		BigInteger y3 = o3.metod3();
		o.println("y = (a * x / b)!");
		o.println("y = "+y3);
		sc.close();

	}
}
