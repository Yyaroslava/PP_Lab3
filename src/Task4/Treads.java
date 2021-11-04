package Task4;

public class Treads {
	public static void main(String[] args) {
		// creating new thread
		new Factorial("Factorial").start();
		// creating new thread
		new Fibonacci("Fibonacci").start();
	}
}
