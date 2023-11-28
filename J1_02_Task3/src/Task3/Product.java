package Task3;

public class Product {
	private String article; // vendor code
	private String nameOfProduct;
	private Double price;
	private Provider provider;

	public Product(String article, String nameOfProduct, Double price, Provider provider) {
		this.article = article;
		this.nameOfProduct = nameOfProduct;
		this.price = price;
		this.provider = provider;
	}

	public String getArticle() {
		return this.article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getNameOfProduct() {
		return this.nameOfProduct;
	}

	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Provider getProvider() {
		return this.provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
}
