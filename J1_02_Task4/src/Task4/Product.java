package Task4;

import java.util.UUID;

public class Product {
	protected UUID id; // список GUID товаров
	protected String article; // список артикулов товаров
	protected String title; // список названий товаров
	protected int quantity; // список количества шт. товаров
	protected double price; // список цен товаров
	Product(UUID id, String article, String title, int quantity, double price){
		this.id = id;
		this.article = article;
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
}
