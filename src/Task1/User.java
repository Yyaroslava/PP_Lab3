package Task1;

public class User {
	public final String lastname;
	public final String fistname;
	public final String middlename;
	public final int age;
	public final Address address;

	public User(String lastname, String fistname, String middlename, int age, Address address) {
		this.lastname = lastname;
		this.fistname = fistname;
		this.middlename = middlename;
		this.age = age;
		this.address = address;
	}

	public void out() {
		System.out.println("Lastname: " + lastname + '\n' + "Name: " + fistname + '\n'	+ "Middle name: " + middlename + '\n'
				+ "Age: " + age + '\n'	+ "Address: " + address.out());
	}
}

