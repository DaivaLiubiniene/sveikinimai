package lt2020.sveikinimai.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TVAddress extends Address {

	@Column(unique = true)
	private String channel;

	public TVAddress() {
		super();
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
}