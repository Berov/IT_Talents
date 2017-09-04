package enums;

import enums.demo.Type;
import enums.demo.Vid;

public class Torta {
	private Vid vid;
	private Type type;
	private int price;

	public Torta(Vid vid, Type type) {
		this.vid = vid;
		this.type = type;
		price = vid.getPrice() + type.getPrice();
	}

	public int getPrice() {
		return this.price;
	}

	public Vid getVid() {
		return this.vid;
	}

	public Type getType() {
		return this.type;
	}

	@Override
	public String toString() {
		return "Torta [vid=" + vid.getVid() + ", type=" + type.getType() + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((vid == null) ? 0 : vid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Torta other = (Torta) obj;
		if (price != other.price)
			return false;
		if (type != other.type)
			return false;
		if (vid != other.vid)
			return false;
		return true;
	}

}
