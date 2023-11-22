package Task3;

public class Manufacturer extends Provider {
	Manufacturer(String INN, String name, String address) {
		super(INN, name, address);
	}

	public void viewInfo() {
		System.out.println(this.INN + '\t' + this.name + '\t' + this.address);
	}
}
