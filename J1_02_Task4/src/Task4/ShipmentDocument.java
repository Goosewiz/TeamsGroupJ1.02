package Task4;

import java.util.Date;
import java.util.UUID;

/**
 * Документ отгрузки со склада. Бывает двух типов: перемещение (на другой склад)
 * и продажа (покупателю).
 */
public abstract class ShipmentDocument {
	private UUID documentId; // GUID документа
	private Date documentDate; // дата документа
	// String documentType; // тип отгрузки: sale - продажа, moving - перемещение
	private String storage; // название склада отгрузки
	private String storageOwner = "abc"; // владелец склада отгрузки
	private int itemsCount; // количество товаров в документе
	private Product[] productsList;

	public UUID getDocumentId() {
		return this.documentId;
	}

	public void setDocumentID(UUID documentId) {
		this.documentId = documentId;
	}

	public Date getDocumentDate() {
		return this.documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	public String getStorage() {
		return this.storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getStorageOwner() {
		return this.storageOwner;
	}

	public void setStorageOwner(String storageOwner) {
		this.storageOwner = storageOwner;
	}

	public int getItemsCount() {
		return this.itemsCount;
	}

	public void setItemsCount(int itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Product[] getProductsList() {
		return this.productsList;
	}

	public void setProductsList(Product[] productsList) {
		this.productsList = productsList;
	}

	/**
	 * Суммарная стоимость товаров в документе.
	 */
	public double totalAmount() {
		double sum = 0;
		for (int i = 0; i < itemsCount; i++) {
			sum += Math.round(productsList[i].getQuantity() * productsList[i].getPrice() * 100) / 100.0;
		}
		return sum;
	}

	/**
	 * Стоимость товара с переданным id.
	 */
	public double itemAmount(String id) {
		UUID uuid = UUID.fromString(id);
		for (int i = 0; i < itemsCount; i++) {
			if (productsList[i].getId() == uuid) {
				return Math.round(productsList[i].getQuantity() * productsList[i].getPrice() * 100) / 100.0;
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
				if (productsList[i].getArticle() == promoArticles[j]) {
					sum += Math.round(productsList[i].getQuantity() * productsList[i].getPrice() * 100) / 100.0;
					break;
				}
			}
		}
		return sum;
	}
}