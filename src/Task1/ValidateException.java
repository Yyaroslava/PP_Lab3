package Task1;

public class ValidateException extends Exception {
	enum http {
		// success
		SUCCESS("200"),
		// error on the client side
		CLIENT_ERROR("400"),
		// error on the server side
		SERVER_ERROR("500");

		private final String httpStatusCode;
		http(String httpStatusCode) { this.httpStatusCode = httpStatusCode; }
	}

	public ValidateException(String message) { super("Code: " + message); }

	// user login checking
	static String loginCheck(User user) throws ValidateException {
		boolean checkUser = checkStrings(user.lastname) && checkStrings(user.fistname) &&
				checkStrings(user.middlename) && checkAge(user.age);

		// if success returns success code
		if (checkUser)
			return http.SUCCESS.httpStatusCode;

		// if checking is not success exception is thrown
		throw new ValidateException(http.CLIENT_ERROR.httpStatusCode);
	}

	private static boolean checkStrings(String name) {
		for (Character i :	name.toCharArray()) {
			if (Character.isDigit(i) || Character.isSpaceChar(i)) return false;
		}
		return Character.isUpperCase(name.charAt(0));
	}

	// age limits checking
	private static boolean checkAge(int age) {
		return age > 18 && age < 100;
	}
}
