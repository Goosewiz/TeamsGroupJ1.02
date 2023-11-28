package Task3;

public class Dealer extends Provider {
	private Manufacturer organization;
	private int overpricePercentage;

	public Dealer(String INN, String name, String address, Manufacturer organization, int overpricePercentage) {
		super(INN, name, address);
		this.organization = organization;
		this.overpricePercentage = overpricePercentage;
	}

	public Manufacturer getOrganization() {
		return this.organization;
	}

	public void setOrganization(Manufacturer organization) {
		this.organization = organization;
	}

	public int getOverpricePercentage() {
		return this.overpricePercentage;
	}

	public void setOverpricePercentage(int overpricePercentage) {
		this.overpricePercentage = overpricePercentage;
	}

	public String toString() {
		return super.toString() + '\t' + this.organization.getINN() + '\t' + this.organization.getName() + '\t'
				+ this.organization.getAddress() + '\t' + this.getOverpricePercentage();
	}
}
