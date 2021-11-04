package Task1;

public class Login {
	public static void main(String[] args) throws ValidateException {
		Address home = new Address("North America", "Canada", "Vancouver", "Green", 85, 27, 51280);
		User user1 = new User("Kirstein", "Jean", "James", 19, home);
		user1.out();
		ValidateException.loginCheck(user1);
	}
}

