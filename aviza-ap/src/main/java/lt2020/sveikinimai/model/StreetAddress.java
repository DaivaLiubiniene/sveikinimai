package lt2020.sveikinimai.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class StreetAddress extends Address {

	@Column(unique = true)
	private String address;

	private String postalCode;

	private String city;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}