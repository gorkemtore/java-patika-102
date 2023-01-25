package sigortaYonetimSistemi;

public abstract class Address {
	private String country;
	private String city;
	private String town;
	private String neighborhood;
	private String street;

	public Address(String country, String city, String town, String neighborhood, String street) {
		super();
		this.country = country;
		this.city = city;
		this.town = town;
		this.neighborhood = neighborhood;
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
