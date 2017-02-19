package CommercialObjects;

import java.util.Random;

public class MallStore extends CommercialObject {

	public MallStore() {
		super(10 + new Random().nextInt(91), 150);
	}

}