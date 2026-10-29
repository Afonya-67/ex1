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
	 public ex1calc(int a, int b,int x) {
		this.x = x;
		this.a = a;
		this.b = b;
	}
	 public int project1(int x) { //расчёт по формуле y = 3 * x + 5
		 return 3 * x + 5;
	 }
	 
	 public int project1() { //перегруженный 1й метод без параметров
		 return project1(x);
	 }
	 public int project2(int a,int b) { //расчёт по формуле y = (a + b) / (a - b)
		 if (a == b)
			 return 0;
		 return (a + b) / (a - b);
	 }
	 public int project2() { //перегруженный2й метод без параметров
		 return project2(a,b);
	 }
	 public BigInteger project3(int a, int b, int x) { //расчёт по формуле y =(a * x / b)!
		 if (b == 0)
			 return BigInteger.ZERO;
		 
		 return factorial(a * x / b);
	 }
	 public BigInteger project3() { //перегруженный3й метод без параметров
		 return project3(a,b,x);
	 }
	 public BigInteger factorial(int x) {
		if ( x < 0)
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
		 int y1 = o1.project1();
		 o.println(y1);
		 o.println("Введи (через пробел) a и b");
		 
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 ex1calc o2 = new ex1calc(a, b);
		 int y2 = o2.project2();
		 o.println("y = (a + b) / (a - b)");
		 o.println(y2);
		 ex1calc o3 = new ex1calc(a, b, x);
		 BigInteger y3 = o3.project3();
		 o.println("y =(a * x / b)!");
		 o.println(y3);
		 sc.close();
		 
	 }
 }