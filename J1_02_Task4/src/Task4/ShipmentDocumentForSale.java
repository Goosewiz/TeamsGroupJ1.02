package Task4;

public class ShipmentDocumentForSale extends ShipmentDocument {
	private String customer; // получатель (только для продажи)

	/**
	 * Является ли продажа оптовой для переданного минимального объема. Для
	 * перемещений неприменимо!
	 */
	public boolean isWholesale(double minQuantity) {
		double sumQuantity = 0;
		for (int i = 0; i < itemsCount; i++) {
			if (itemsQuantity[i] >= minQuantity) {
				return true;
			}
			sumQuantity += itemsQuantity[i];
		}
		return sumQuantity >= minQuantity;
	}

	public double promoSum(String[] promoArticles, double[] discounts) {
		double sum = 0;
		for (int i = 0; i < itemsCount; i++) {
			for (int j = 0; j < promoArticles.length; j++) {
				if (itemsArticle[i] == promoArticles[j]) {
					sum += Math.round(itemsQuantity[i] * itemsPrice[i] * 100 * ((100 - discounts[j]) / 100)) / 100.0;
					break;
				}
			}
		}
		return sum;
	}
}