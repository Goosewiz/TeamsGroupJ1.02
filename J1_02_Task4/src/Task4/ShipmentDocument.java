package Task4;

import java.util.Date;
import java.util.UUID;

/**
 * Документ отгрузки со склада. Бывает двух типов: перемещение (на другой склад)
 * и продажа (покупателю).
 */
public class ShipmentDocument {
	protected UUID documentId; // GUID документа
	protected Date documentDate; // дата документа
	// String documentType; // тип отгрузки: sale - продажа, moving - перемещение
	protected String storage; // название склада отгрузки
	protected String storageOwner = "abc"; // владелец склада отгрузки
	protected int itemsCount; // количество товаров в документе
	protected UUID[] itemsId; // список GUID товаров
	protected String[] itemsArticle; // список артикулов товаров
	protected String[] itemsTitle; // список названий товаров
	protected double[] itemsQuantity; // список количества шт. товаров
	protected double[] itemsPrice; // список цен товаров

	/**
	 * Суммарная стоимость товаров в документе.
	 */
	public double totalAmount() {
		double sum = 0;
		for (int i = 0; i < itemsCount; i++) {
			sum += Math.round(itemsQuantity[i] * itemsPrice[i] * 100) / 100.0;
		}
		return sum;
	}

	/**
	 * Стоимость товара с переданным id.
	 */
	public double itemAmount(String id) {
		UUID uuid = UUID.fromString(id);
		for (int i = 0; i < itemsCount; i++) {
			if (itemsId[i] == uuid) {
				return Math.round(itemsQuantity[i] * itemsPrice[i] * 100) / 100.0;
			}
		}
		return 0;
	}

	/**
	 * Суммарная стоимость товаров, попадающих в список промо-акции.
	 */
	public double promoSum(String[] promoArticles) {
		double sum = 0;
		for (int i = 0; i < itemsCount; i++) {
			for (int j = 0; j < promoArticles.length; j++) {
				if (itemsArticle[i] == promoArticles[j]) {
					sum += Math.round(itemsQuantity[i] * itemsPrice[i] * 100) / 100.0;
					break;
				}
			}
		}
		return sum;
	}
}