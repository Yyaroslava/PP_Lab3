package Task4;

public class Fibonacci extends Thread {
	public Fibonacci(String name) {	super(name); }
	public void run(){
		int n = 16;
		System.out.println(fibonacci(n));
		System.out.println(this);
	}
	static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		// n1 = 1, n2 = 1, n3 = 2, n4 = 3 ... n16 = 987, it will return 987
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
