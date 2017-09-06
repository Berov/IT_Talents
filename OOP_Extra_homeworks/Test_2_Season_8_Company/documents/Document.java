package documents;

import java.util.Random;

public class Document {
	private static int ID = 0;
	private int incomingНumber;
	private String name;
	private int complexity;
	private String password = "";
	private boolean isSecret = false;

	public Document(String name, int complexity, boolean isSecret) {
		if ((name.isEmpty() || complexity < 1 || complexity > 20)) {
			name = "Auto generated document " + ID++;
			complexity = new Random().nextInt(20);
		}
		this.name = name;
		this.complexity = complexity;
		this.incomingНumber = ID++;
		if (isSecret) {
			for (int i = 0; i < 8; i++) { // how long is password - 8 chars
				this.password += (char) (new Random().nextInt(122 - 48) + 48);
			}
			this.isSecret = true;
		}
		//		if (new Random().nextBoolean()) {
		////			// secret document
		////			for (int i = 0; i < 8; i++) { // how long is password - 8 chars
		////				final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		////				this.password += chars.charAt(new Random().nextInt(chars.length()));
		////				this.password += (char) (new Random().nextInt(122 - 48) + 48);
		////			}
		//		}
	}

	public int getIncomingНumber() {
		return incomingНumber;
	}

	public String getName() {
		return name;
	}

	public int getComplexity() {
		return complexity;
	}

	public boolean isSecret() {
		return isSecret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + incomingНumber;
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
		Document other = (Document) obj;
		if (incomingНumber != other.incomingНumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "		Document [ name=" + name + ", complexity=" + complexity
				+ ",  isSecret=" + isSecret + "]\n";
	}

	
	
}
