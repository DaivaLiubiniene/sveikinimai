package lt2020.sveikinimai.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Greeting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String text;

	private String image;

	private String audioFile;

	private String greeterFirstName;

	private String greeterLastName;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date greetingDate;

	@Enumerated(EnumType.ORDINAL)
	private GreetingType greetingType;

	@ManyToOne
	@JoinColumn(name = "location_id", nullable = false)
	private Location location;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(String audioFile) {
		this.audioFile = audioFile;
	}

	public String getGreeterFirstName() {
		return greeterFirstName;
	}

	public void setGreeterFirstName(String greeterFirstName) {
		this.greeterFirstName = greeterFirstName;
	}

	public String getGreeterLastName() {
		return greeterLastName;
	}

	public void setGreeterLastName(String greeterLastName) {
		this.greeterLastName = greeterLastName;
	}

	public java.util.Date getGreetingDate() {
		return greetingDate;
	}

	public void setGreetingDate(java.util.Date greetingDate) {
		this.greetingDate = greetingDate;
	}

	public GreetingType getGreetingType() {
		return greetingType;
	}

	public void setGreetingType(GreetingType greetingType) {
		this.greetingType = greetingType;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}