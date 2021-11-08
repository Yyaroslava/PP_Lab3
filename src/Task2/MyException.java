package Task2;

public class MyException implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("closed MyException");
	}
}
