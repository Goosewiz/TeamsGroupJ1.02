package Task3;

public class Dealer extends Provider {
	Manufacturer organization;
	int overpricePercentage;

	Dealer(String INN, String name, String address, Manufacturer organization, int overpricePercentage) {
		super(INN, name, address);
		this.organization = organization;
		this.overpricePercentage = overpricePercentage;
	}

	public String toString() {
		return this.INN + '\t' + this.name + '\t' + this.address + '\t' + this.organization.INN + '\t'
				+ this.organization.name + '\t' + this.organization.address + '\t' + this.overpricePercentage + '\t';
	}
}
