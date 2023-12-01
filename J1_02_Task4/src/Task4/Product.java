package Task4;

import java.util.UUID;

public class Product {
	private UUID id; // список GUID товаров
	private String article; // список артикулов товаров
	private String title; // список названий товаров
	private int quantity; // список количества шт. товаров
	private double price; // список цен товаров
	Product(UUID id, String article, String title, int quantity, double price){
		this.id = id;
		this.article = article;
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
	public UUID getId() {
		return this.id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getArticle() {
		return this.article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
