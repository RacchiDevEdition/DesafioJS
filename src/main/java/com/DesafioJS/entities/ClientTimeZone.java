package com.DesafioJS.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_clientTimeZone")
public class ClientTimeZone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String timeZone;
	private String offSetId;

	public ClientTimeZone(String timeZone, String offsetId) {
		this.timeZone = timeZone;
		this.offSetId = offsetId;
	}

	public ClientTimeZone() {
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getOffsetId() {
		return offSetId;
	}

	public void setOffsetId(String offsetId) {
		this.offSetId = offsetId;
	}

}