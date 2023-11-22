package Task3;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducts {
	List<String> article; // vendor code
	List<String> nameOfProduct;
	List<Double> price;
	List<String> INN;
	int size;

	ListOfProducts() {
		this.article = new ArrayList<String>();
		this.nameOfProduct = new ArrayList<String>();
		this.price = new ArrayList<Double>();
		this.INN = new ArrayList<String>();
		this.size = 0;
	}

	public void addInfo(String article, String name, double price, String INN) {
		this.article.add(article);
		this.nameOfProduct.add(name);
		this.price.add(price);
		this.INN.add(INN);
		this.size += 1;
	}

	public void viewInfo() {
		for (int i = 0; i < article.size(); i++) {
			System.out.println(article.get(i) + '\t' + nameOfProduct.get(i) + '\t' + price.get(i) + '\t' + INN.get(i));
		}
	}
}
