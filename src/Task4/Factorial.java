package Task4;

public class Factorial extends Thread {
	public Factorial(String name) { super(name); }
	public void run(){
		int factorial = 1;
		for(int i = 1; i <= 9; i++){
			factorial = factorial*i;
			System.out.println(factorial);
		}
		System.out.println(this);
	}
}
