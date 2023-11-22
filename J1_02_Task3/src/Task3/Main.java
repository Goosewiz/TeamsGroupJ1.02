package Task3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Manufacturer manufacturer1 = ProviderFabric.createManufacturer("2275436853", "Компания1", "ул. Пушкина д. 19");
		Manufacturer manufacturer2 = ProviderFabric.createManufacturer("5594197981", "Компания2", "ул. Некрасова д. 20");
		Manufacturer manufacturer3 = ProviderFabric.createManufacturer("8216372581", "Компания3", "ул. Ломоносова д. 21");

		Dealer dealer1 = ProviderFabric.createDealer("7673824967", "Поставщик1", "ул. Обухова д. 22", manufacturer1, 10);
		Dealer dealer2 = ProviderFabric.createDealer("2345664253", "Поставщик2", "ул. Картошки д. 23", manufacturer2, 20);
		
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
		Scanner sc = new Scanner(System.in);
		while (!input.equals("0")) {
			input = sc.next();
			System.out.println(input);
			System.out.println("");
		}
		System.out.println("we are done");
		sc.close();
	}
}
