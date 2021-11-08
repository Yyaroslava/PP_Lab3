package Task1;

public class User {
	private String firstname;
	private String lastname;
	private int age;
	private Address address;

	public User(){}

	public User(String firstname, String lastname, int age, Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
	}

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	public  void setLastname(String lastname){
		this.lastname = lastname;
	}
	public void setAge(int age){
		this.age = age;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public String out() {
		return address.getCountry() + ", " + address.getCity() + ", " +	address.getStreet() + ", "
				+ address.getHouseNumber() + ", ";
	}

	public void validate(){
		if(!firstname.matches("^[a-zA-Zа-яА-Я]{2,50}")){
			throw new MyException(Errors.ERROR_400,"Invalid name");
		}
		if(!lastname.matches("^[a-zA-Zа-яА-Я]{2,50}")){
			throw new MyException(Errors.ERROR_400,"Invalid lastname");
		}
		if(age < 0){
			throw new MyException(Errors.ERROR_400,"Invalid age");
		}
		if(!address.getCountry().matches("^[a-zA-Zа-яА-Я]{2,50}")){
			throw new MyException(Errors.ERROR_500,"Invalid country");
		}
		if(!address.getCity().matches("^[a-zA-Zа-яА-Я]{2,50}")){
			throw new MyException(Errors.ERROR_500,"Invalid city");
		}
		if(!address.getStreet().matches("^[a-zA-Zа-яА-Я]{2,50}")){
			throw new MyException(Errors.ERROR_500,"Invalid street");
		}
	}

}
