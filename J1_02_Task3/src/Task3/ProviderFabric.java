package Task3;

public class ProviderFabric {
	public static Manufacturer createManufacturer(String INN, String name, String address) {
		return new Manufacturer(INN, name, address);
	}
	public static Dealer createDealer(String INN, String name, String address, Manufacturer organization, int overpricePercentage) {
		return new Dealer(INN, name, address, organization, overpricePercentage);
	}
}
