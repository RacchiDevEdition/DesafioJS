package com.DesafioJS.dto;

import com.DesafioJS.entities.Client;
import com.DesafioJS.entities.ClientCoordinates;
import com.DesafioJS.entities.ClientLocation;
import com.DesafioJS.entities.ClientName;
import com.DesafioJS.entities.ClientTimeZone;
import com.DesafioJS.entities.enums.ClientGender;
import com.DesafioJS.entities.enums.ClientPriority;
import com.DesafioJS.entities.enums.ClientRegion;

public class ClientDto {

	private ClientPriority priority;
	private ClientGender gender;
	private ClientName name;
	private ClientRegion region;
	private ClientLocation location;
	private ClientCoordinates coordinates;
	private ClientTimeZone timeZone;

	public ClientDto(Client entity) {
		this.priority = entity.getPriority();
		this.gender = entity.getGender();
		this.name = entity.getName();
		this.region = entity.getRegion();
		this.location = entity.getLocation();
		this.coordinates = entity.getCoordinates();
		this.timeZone = entity.getClientTimeZone();

	}

	public ClientPriority getPriority() {
		return priority;
	}

	public void setPriority(ClientPriority priority) {
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

	public ClientRegion getRegion() {
		return region;
	}

	public void setRegion(ClientRegion region) {
		this.region = region;
	}

	public ClientLocation getLocation() {
		return location;
	}

	public void setLocation(ClientLocation location) {
		this.location = location;
	}

	public ClientCoordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ClientCoordinates coordinates) {
		this.coordinates = coordinates;
	}

	public ClientTimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(ClientTimeZone timeZone) {
		this.timeZone = timeZone;
	}

	@Override
	public String toString() {
		return "ClientDto [priority=" + priority + ", gender=" + gender + ", name=" + name + ", region=" + region
				+ ", location=" + location + ", coordinates=" + coordinates + ", timeZone=" + timeZone + "]";
	}

}
