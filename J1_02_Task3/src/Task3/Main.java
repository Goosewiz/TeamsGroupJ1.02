package Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Manufacturer manufacturer1 = new Manufacturer("2275436853", "Компания1", "ул. Пушкина д. 19");
		Manufacturer manufacturer2 = new Manufacturer("5594197981", "Компания2", "ул. Некрасова д. 20");
		Manufacturer manufacturer3 = new Manufacturer("8216372581", "Компания3", "ул. Ломоносова д. 21");

		Dealer dealer1 = new Dealer("7673824967", "Поставщик1", "ул. Обухова д. 22", manufacturer1, 10);
		Dealer dealer2 = new Dealer("2345664253", "Поставщик2", "ул. Картошки д. 23", manufacturer2, 20);

		ListOfProducts listOfProducts = new ListOfProducts();
		Product product = new Product("4040472078066", "стул", 100.0, manufacturer1);
		listOfProducts.addInfo(product);
		product = new Product("13193865222902", "стол", 200.0, manufacturer1);
		listOfProducts.addInfo(product);
		product = new Product("357002294348603", "кровать", 10.0, manufacturer1);
		listOfProducts.addInfo(product);
		product = new Product("7263419425", "компьютерная мышка", 101.0, manufacturer2);
		listOfProducts.addInfo(product);
		product = new Product("43638599343", "карандаш", 102.0, manufacturer2);
		listOfProducts.addInfo(product);
		product = new Product("963011690420", "манго", 103.0, manufacturer2);
		listOfProducts.addInfo(product);
		product = new Product("1447531471045", "книга", 115.0, manufacturer3);
		listOfProducts.addInfo(product);
		product = new Product("79371456311418", "сумка", 125.0, manufacturer3);
		listOfProducts.addInfo(product);
		product = new Product("112584899629673", "гель для душа", 135.0, manufacturer3);
		listOfProducts.addInfo(product);
		product = new Product("2211705465", "швабра", 176.0, dealer1);
		listOfProducts.addInfo(product);
		product = new Product("01614446979", "зубная паста", 190.0, dealer1);
		listOfProducts.addInfo(product);
		product = new Product("688010536622", "фотоаппарат", 145.0, dealer1);
		listOfProducts.addInfo(product);
		product = new Product("6646843024222", "стерка", 1555.0, dealer2);
		listOfProducts.addInfo(product);
		product = new Product("61335958019916", "подушка", 1999.0, dealer2);
		listOfProducts.addInfo(product);
		product = new Product("517739942778164", "телевизор", 1777.0, dealer2);
		listOfProducts.addInfo(product);

		String input = "1";
		System.out.println("Введите артикул товара");
		Scanner sc = new Scanner(System.in);
		boolean resultFound = false;
		while (!input.equals("0")) {
			input = sc.next();
			for (int i = 0; i < listOfProducts.size; i++) {
				Product result = listOfProducts.array.get(i);
				if (input.equals(result.article)) {
					resultFound = true;
					if (result.provider instanceof Manufacturer) {
						System.out.println("Товар - " + result.nameOfProduct);
						System.out.println("Цена - " + result.price);
						System.out.println("Название производителя - " + result.provider.name);
						System.out.println("Адрес производителя - " + result.provider.address);
					} else {
						Dealer temp = (Dealer) result.provider;
						System.out.println("Товар - " + result.nameOfProduct);
						System.out.println("Цена без наценки - " + result.price + ", цена с наценкой "
								+ temp.overpricePercentage + "% составляет "
								+ result.price * (100 + temp.overpricePercentage) / 100);
						System.out.println("Название производителя - " + result.provider.name
								+ " (Название дилера - " + temp.organization.name + ")");
						System.out.println("Адрес дилера - " + result.provider.address);
					}
				}
			}
			if (!resultFound) {
				System.out.println("Товар с таким артикулом не найден");
			}
			resultFound = false;
			System.out.println("Введите артикул товара");
		}
		sc.close();
	}
}
