package com.DesafioJS.entities;

import com.DesafioJS.entities.boundingbox.BoundingBoxNormal;
import com.DesafioJS.entities.boundingbox.BoundingBoxSpecial;
import com.DesafioJS.entities.boundingbox.BoundingBoxSpecialEnd;
import com.DesafioJS.entities.enums.ClientPriority;

public final class ClientPriorityClass {

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

}
