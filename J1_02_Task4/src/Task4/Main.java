package Task4;

public class Main {
	public static void main(String args[]) {
		ShipmentDocumentForMoving sdfm = new ShipmentDocumentForMoving();
		ShipmentDocumentForSale sdfs = new ShipmentDocumentForSale();
		String[] articles = new String[] { "abc", "bcd" };
		double[] discounts = new double[] { 10, 10 };
		sdfm.itemsArticle = articles;
		sdfs.itemsArticle = articles;
		int[] amount = new int[] { 4, 2 };
		sdfm.itemsQuantity = amount;
		sdfs.itemsQuantity = amount;
		double[] prices = new double[] { 123.45, 12.34 };
		sdfm.itemsPrice = prices;
		sdfs.itemsPrice = prices;
		sdfm.itemsCount = 2;
		sdfs.itemsCount = 2;
		double answer = sdfs.promoSum(articles, discounts);
		System.out.println("Метод для продажи - " + answer);
		answer = sdfm.promoSum(articles);
		System.out.println("Метод для перемещения - " + answer);
	}
}
