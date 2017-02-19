package Dealers;

import java.util.ArrayList;
import Demo.Demo;
import CommercialObjects.CommercialObject;
import CommercialObjects.StreetVendorPocket;
import Deliverers.Deliverer;

public class StreetVendor extends Dealer {

	public StreetVendor(String name, String address, double capital) {
		super(name, address, capital);

	}

	@Override
	public String toString() {
		return "StreetVendor [getCommercialObjects()=" + getCommercialObjects().get(0) + ", getDeliverers()="
				+ getDeliverers() + "]";
	}

	@Override
	public void addCommercialObject(CommercialObject commercialObject) {
		this.getCommercialObjects().clear();

		CommercialObject vendorCommercialObject = new StreetVendorPocket(0, 0);
		this.getCommercialObjects().add(vendorCommercialObject);
		Demo.comercialObjects.add(vendorCommercialObject);

	}

	@Override
	public void addDeliverers(Deliverer deliverer) {
		this.getCommercialObjects().clear();

	}

}
