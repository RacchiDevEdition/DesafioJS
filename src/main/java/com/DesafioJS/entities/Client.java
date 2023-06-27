package com.DesafioJS.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.DesafioJS.entities.enums.ClientGender;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	public ClientPriorityClass priority;
	
	@Enumerated(EnumType.STRING)
	private ClientGender gender;
	
	private ClientName name;
	private ClientLocation location;
	private ClientCoordinates coordinates;
	public ClientTimeZone clientTimeZone;
	private String email;
	private Instant birthday;
	private Instant registered;
	private String telephoneNumber;
	private String mobileNumber;
	private String nationality;

	public Client(Long id, ClientPriorityClass priority, ClientGender gender, ClientName first, ClientLocation location,
			ClientCoordinates coordinates, ClientTimeZone clientTimeZone, String email, Instant birthday, Instant registered,
			String telephoneNumber, String mobileNumber, String nationality) {
		this.id = id;
		this.priority = priority;
		this.gender = gender;
		name = new ClientName();
		location = new ClientLocation();
		coordinates = new ClientCoordinates();
		clientTimeZone = new ClientTimeZone();
		this.email = email;
		this.birthday = birthday;
		this.registered = registered;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
		this.nationality = nationality;
	}

	public Client() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClientPriorityClass getPriority() {
		return priority;
	}

	public void setPriority(ClientPriorityClass priority) {
		this.priority = priority;
	}

	public ClientGender getGender() {
		return gender;
	}

	public void setGender(ClientGender gender) {
		this.gender = gender;
	}

	public ClientName getName() {
		return name;
	}

	public void setName(ClientName name) {
		this.name = name;
	}

	public ClientLocation getLocation() {
		return location;
	}

	public void setLocation(ClientLocation location) {
		this.location = location;
	}

	public ClientTimeZone getClientTimeZone() {
		return clientTimeZone;
	}

	public void setClientTimeZone(ClientTimeZone clientTimeZone) {
		this.clientTimeZone = clientTimeZone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instant getBirthday() {
		return birthday;
	}

	public ClientCoordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ClientCoordinates coordinates) {
		this.coordinates = coordinates;
	}

	public void setBirthday(Instant birthday) {
		this.birthday = birthday;
	}

	public Instant getRegistered() {
		return registered;
	}

	public void setRegistered(Instant registered) {
		this.registered = registered;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", priority=" + priority + ", gender=" + gender + ", name=" + name + ", location="
				+ location + ", clientTimeZone=" + clientTimeZone + ", email=" + email + ", birthday=" + birthday
				+ ", registered=" + registered + ", telephoneNumber=" + telephoneNumber + ", mobileNumber="
				+ mobileNumber + ", nationality=" + nationality + "]";
	}

}
