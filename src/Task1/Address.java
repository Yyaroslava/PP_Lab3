package Task1;

public class Address {
	// standard
	private final String continent;
	private final String country;
	private final String city;
	private final String street;
	private final int house;
	private final int flat;
	private final int postalCode;

	public Address(String continent, String country, String city, String street, int house, int flat, int postalCode) {
		this.continent = continent;
		this.country = country;
		this.city = city;
		this.street = street;
		this.house = house;
		this.flat = flat;
		this.postalCode = postalCode;
	}

	public String out() {
		return continent + ", " + country + ", " +	city + ", " +	street + ", "
				+	house + ", " +	flat + ". \nPostal code: " +	postalCode + '.';
	}

}

