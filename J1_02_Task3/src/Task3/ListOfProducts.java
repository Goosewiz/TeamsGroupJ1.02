package Task3;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducts {
	private List<Product> array; // vendor code
	private int size;

	public ListOfProducts() {
		this.array = new ArrayList<Product>();
		this.size = 0;
	}

	public List<Product> getArray() {
		return this.array;
	}

	public void setArray(List<Product> array) {
		this.array = array;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
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
