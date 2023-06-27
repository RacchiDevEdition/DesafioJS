package com.DesafioJS.entities;
import java.time.Instant;
import java.util.TimeZone;


public class ClientTimeZone {

	TimeZone timeZone = TimeZone.getDefault();
	String offsetId = timeZone.toZoneId().getRules().getStandardOffset(Instant.now()).getId();

	public ClientTimeZone(TimeZone timeZone, String offsetId) {
		super();
		this.timeZone = timeZone;
		this.offsetId = offsetId;
	}

	public ClientTimeZone() {
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public String getOffsetId() {
		return offsetId;
	}

	public void setOffsetId(String offsetId) {
		this.offsetId = offsetId;
	}
	
}