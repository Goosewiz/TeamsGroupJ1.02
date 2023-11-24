package Task3;

public abstract class Provider {
	String INN;
	String name;
	String address;

	Provider(String INN, String name, String address) {
		this.INN = INN;
		this.name = name;
		this.address = address;
	}

	public abstract String toString();
}
