package Dealers;

import java.util.ArrayList;

import CommercialObjects.CommercialObject;
import Deliverers.Deliverer;

public abstract class Dealer {
	private String name;
	private String address;
	private double capital;
	
	ArrayList<CommercialObject> commercialObjects = new ArrayList<>();
	ArrayList<Deliverer> deliverers = new ArrayList<>();

	 public Dealer(String name, String address, double capital) {
	 if (name != null && name.length() > 0) {
	 this.name = name;
	 }
	 if (address != null && address.length() > 0) {
	 this.address = address;
	 }
	 if (capital > 0) {
	 this.capital = capital;
	 }
	
	 }

	public ArrayList<CommercialObject> getCommercialObjects() {
		return commercialObjects;
	}

	public ArrayList<Deliverer> getDeliverers() {
		return deliverers;
	}

	public abstract void addCommercialObject(CommercialObject commercialObject);

	public abstract void addDeliverers(Deliverer deliverer);

}
