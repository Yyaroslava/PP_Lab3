package Task2;

public class Main {
	public static void main(String[] args) {
		try (MyException myException = new MyException()) {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
