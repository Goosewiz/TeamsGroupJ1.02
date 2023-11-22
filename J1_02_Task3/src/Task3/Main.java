package Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Manufacturer manufacturer1 = ProviderFabric.createManufacturer("2275436853", "Компания1", "ул. Пушкина д. 19");
		Manufacturer manufacturer2 = ProviderFabric.createManufacturer("5594197981", "Компания2", "ул. Некрасова д. 20");
		Manufacturer manufacturer3 = ProviderFabric.createManufacturer("8216372581", "Компания3", "ул. Ломоносова д. 21");
		Map<String, Manufacturer> manufacturersInfo = new HashMap<String, Manufacturer>();
		manufacturersInfo.put(manufacturer1.INN, manufacturer1);
		manufacturersInfo.put(manufacturer2.INN, manufacturer2);
		manufacturersInfo.put(manufacturer3.INN, manufacturer3);

		Dealer dealer1 = ProviderFabric.createDealer("7673824967", "Поставщик1", "ул. Обухова д. 22", manufacturer1, 10);
		Dealer dealer2 = ProviderFabric.createDealer("2345664253", "Поставщик2", "ул. Картошки д. 23", manufacturer2, 20);
		Map<String, Dealer> dealersInfo = new HashMap<String, Dealer>();
		dealersInfo.put(dealer1.INN, dealer1);
		dealersInfo.put(dealer2.INN, dealer2);

		ListOfProducts listOfProducts = new ListOfProducts();
		listOfProducts.addInfo("4040472078066", "стул", 100, "2275436853");
		listOfProducts.addInfo("13193865222902", "стол", 200, "2275436853");
		listOfProducts.addInfo("357002294348603", "кровать", 10, "2275436853");
		listOfProducts.addInfo("7263419425", "компьютерная мышка", 101, "5594197981");
		listOfProducts.addInfo("43638599343", "карандаш", 102, "5594197981");
		listOfProducts.addInfo("963011690420", "манго", 103, "5594197981");
		listOfProducts.addInfo("1447531471045", "книга", 115, "8216372581");
		listOfProducts.addInfo("79371456311418", "сумка", 125, "8216372581");
		listOfProducts.addInfo("112584899629673", "гель для душа", 135, "8216372581");
		listOfProducts.addInfo("2211705465", "швабра", 176, "7673824967");
		listOfProducts.addInfo("01614446979", "зубная паста", 190, "7673824967");
		listOfProducts.addInfo("688010536622", "фотоаппарат", 145, "7673824967");
		listOfProducts.addInfo("6646843024222", "стерка", 1555, "2345664253");
		listOfProducts.addInfo("61335958019916", "подушка", 1999, "2345664253");
		listOfProducts.addInfo("517739942778164", "телевизор", 1777, "2345664253");

		String input = "1";
		System.out.println("Введите артикул товара");
		Scanner sc = new Scanner(System.in);
		boolean resultFound = false;
		while (!input.equals("0")) {
			input = sc.next();
			for (int i = 0; i < listOfProducts.size; i++) {
				String result = listOfProducts.article.get(i);
				if (input.equals(result)) {
					resultFound = true;
					String INN = listOfProducts.INN.get(i);
					if (manufacturersInfo.containsKey(INN)) {
						System.out.println("Товар - " + listOfProducts.nameOfProduct.get(i));
						System.out.println("Цена - " + listOfProducts.price.get(i));
						System.out.println("Название производителя - " + manufacturersInfo.get(INN).name);
						System.out.println("Адрес производителя - " + manufacturersInfo.get(INN).address);
					} else {
						System.out.println("Товар - " + listOfProducts.nameOfProduct.get(i));
						System.out.println("Цена без наценки - " + listOfProducts.price.get(i) + ", цена с наценкой "
								+ dealersInfo.get(INN).overpricePercentage + "% составляет "
								+ listOfProducts.price.get(i) * (100 + (dealersInfo.get(INN)).overpricePercentage) / 100);
						System.out.println("Название производителя - " + dealersInfo.get(INN).name
								+ " (Название дилера - " + (dealersInfo.get(INN)).organization.name + ")");
						System.out.println("Адрес дилера - " + dealersInfo.get(INN).address);
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
