package com.DesafioJS.entities.boundingbox;

import com.DesafioJS.entities.ClientCoordinates;

public class BoundingBoxCoordinates {

	public Double minLat;
	public Double minLon;
	public Double maxLat;
	public Double maxLon;

	public BoundingBoxCoordinates(Double minLat, Double minLon, Double maxLat, Double maxLon) {
		super();
		this.minLat = minLat;
		this.minLon = minLon;
		this.maxLat = maxLat;
		this.maxLon = maxLon;
	}

	public Double getMinLat() {
		return minLat;
	}

	public void setMinLat(Double minLat) {
		this.minLat = minLat;
	}

	public Double getMinLon() {
		return minLon;
	}

	public void setMinLon(Double minLon) {
		this.minLon = minLon;
	}

	public Double getMaxLat() {
		return maxLat;
	}

	public void setMaxLat(Double maxLat) {
		this.maxLat = maxLat;
	}

	public Double getMaxLon() {
		return maxLon;
	}

	public void setMaxLon(Double maxLon) {
		this.maxLon = maxLon;
	}

	public boolean insideLatitude(Double latitude) {
		return (latitude >= minLat) && (latitude <= maxLat);
	}

	public boolean insideLongitude(Double longitude) {
		return (longitude >= minLon) && (longitude <= maxLon);
	}

	public boolean insideBoundingBox(ClientCoordinates coordinates) {
		return insideLatitude(coordinates.getLatitude()) && insideLongitude(coordinates.getLongitude());
	}
}
