package Task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighMultithreading {
	public static void main(final String[] args) {
		final ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(()->Operations.sum(13,7));
		executor.submit(()->Operations.dif(88,77));
		executor.submit(()->Operations.square(7));

		try {
			executor.shutdown();
		} catch (final Exception e){
			executor.shutdown();
		}
	}
}
