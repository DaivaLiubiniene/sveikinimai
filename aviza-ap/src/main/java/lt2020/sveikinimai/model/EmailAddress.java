package lt2020.sveikinimai.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EmailAddress extends Address {

	@Column(unique = true)
	private String email;

	public EmailAddress() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}