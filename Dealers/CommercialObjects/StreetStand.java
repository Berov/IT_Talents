package CommercialObjects;

import java.util.Random;

public class StreetStand extends CommercialObject {

	public StreetStand() {
		super(4 + new Random().nextInt(3), 50);
	}

}