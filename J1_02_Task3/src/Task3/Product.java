package Task3;

public class Product {
	String article; // vendor code
	String nameOfProduct;
	Double price;
	Provider provider;
	Product(String article, String nameOfProduct, Double price, Provider provider){
		this.article = article;
		this.nameOfProduct = nameOfProduct;
		this.price = price;
		this.provider = provider;
	}
}
