package Task4;

public class LowMultithreading {
	public static void main(final String[] args) {
		final FirstLowThread ls1 = new FirstLowThread();
		final SecondLowThread ls2 = new SecondLowThread();
		ls1.start();
		ls2.start();
	}

	public static class FirstLowThread extends Thread {
		@Override
		public void run() {
			Operations.sum(14, 5);
		}
	}

	public static class SecondLowThread extends Thread {
		@Override
		public void run() {
			Operations.dif(45, 27);
		}
	}
}
