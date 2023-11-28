package Task4;

public class ShipmentDocumentForSale extends ShipmentDocument {
	private String customer; // получатель (только для продажи)

	/**
	 * Является ли продажа оптовой для переданного минимального объема. Для
	 * перемещений неприменимо!
	 */
	public boolean isWholesale(double minQuantity) {
		double sumQuantity = 0;
		for (int i = 0; i < getItemsCount(); i++) {
			if (getProductsList()[i].quantity >= minQuantity) {
				return true;
			}
			sumQuantity += getProductsList()[i].quantity;
		}
		return sumQuantity >= minQuantity;
	}

	public double promoSum(String[] promoArticles, double[] discounts) {
		double sum = 0;
		for (int i = 0; i < getItemsCount(); i++) {
			for (int j = 0; j < promoArticles.length; j++) {
				if (getProductsList()[i].article == promoArticles[j]) {
					sum += Math.round(getProductsList()[i].quantity * getProductsList()[i].price * 100
							* ((100 - discounts[j]) / 100)) / 100.0;
					break;
				}
			}
		}
		return sum;
	}
}