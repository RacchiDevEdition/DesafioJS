package com.DesafioJS.entities.enums;

import com.DesafioJS.entities.ClientCoordinates;
import com.DesafioJS.entities.boundingbox.BoundingBoxNormal;
import com.DesafioJS.entities.boundingbox.BoundingBoxSpecial;
import com.DesafioJS.entities.boundingbox.BoundingBoxSpecialEnd;

import jakarta.persistence.Table;

@Table(name = "tb_clientPriority")
public enum ClientPriority {

	SPECIAL(1), NORMAL(2), LABORIOUS(3);

	private int code;

	private ClientPriority(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}


	public static ClientPriority getClientPriority(ClientCoordinates coordinates) {
		if (new BoundingBoxSpecial().insideBoundingBox(coordinates)
				|| new BoundingBoxSpecialEnd().insideBoundingBox(coordinates)) {
			return ClientPriority.SPECIAL;

		}
		if (new BoundingBoxNormal().insideBoundingBox(coordinates)) {
			return ClientPriority.NORMAL;
		}

		return ClientPriority.LABORIOUS;
	}

	public static ClientPriority valueOf(int code) {
		for (ClientPriority value : ClientPriority.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid ClientPriority");
	}
}
