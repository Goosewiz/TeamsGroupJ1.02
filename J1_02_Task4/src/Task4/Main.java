package Task4;

import java.util.UUID;

public class Main {
	public static void main(String args[]) {
		ShipmentDocumentForMoving sdfm = new ShipmentDocumentForMoving();
		ShipmentDocumentForSale sdfs = new ShipmentDocumentForSale();
		UUID uuid = UUID.randomUUID();
		Product product1 = new Product(uuid,"111", "abc", 4, 123.45);
		Product product2 = new Product(uuid,"222", "bcd", 2, 12.34);
		Product[] products = {product1, product2};
		sdfm.productsList = products;
		sdfs.productsList = products;
		String[] articles = new String[] { "111", "222" };
		double[] discounts = new double[] { 10, 10 };
		sdfm.itemsCount = 2;
		sdfs.itemsCount = 2;
		double answer = sdfs.promoSum(articles, discounts);
		System.out.println("Метод для продажи - " + answer);
		answer = sdfm.promoSum(articles);
		System.out.println("Метод для перемещения - " + answer);
	}
}
