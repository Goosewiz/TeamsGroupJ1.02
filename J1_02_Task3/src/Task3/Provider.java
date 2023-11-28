package Task3;

public abstract class Provider {
	private String INN;
	private String name;
	private String address;

	public Provider(String INN, String name, String address) {
		this.INN = INN;
		this.name = name;
		this.address = address;
	}

	public String getINN() {
		return this.INN;
	}

	public void setINN(String INN) {
		this.INN = INN;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return this.INN + '\t' + this.name + '\t' + this.address;
	}
}
