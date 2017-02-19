package CommercialObjects;

import java.util.Random;

public class MarketStand extends CommercialObject {

	public MarketStand() {
		super(2 + new Random().nextInt(9), 50);
	}

}
