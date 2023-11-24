package Task3;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducts {
	List<Product> array; // vendor code
	int size;

	ListOfProducts() {
		this.array = new ArrayList<Product>();
		this.size = 0;
	}

	public void addInfo(Product product) {
		this.array.add(product);
		this.size += 1;
	}

	public String toString() {
		String answer = "";
		for (int i = 0; i < this.size; i++) {
			answer = answer + array.get(i) + " ";
		}
		return answer;
	}
}
