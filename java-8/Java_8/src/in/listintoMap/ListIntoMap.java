package in.listintoMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListIntoMap {
	// Converting Product List into a Map
	public static void listIntoMap(List<Product> products) {

		// Product List change into Map
		Map<Integer, String> productMap = products.stream()
				.collect(Collectors.toMap(k -> k.productId, v -> v.productName));
		System.out.println(productMap);

		// Filtering Data & collect into Map
		Map<String, Double> collect = products.stream().filter(p -> p.price == 200)
				.collect(Collectors.toMap(n -> n.productName, p -> p.price));
		System.out.println(collect);

		//Sorting The product With Help of stream().sorted() Method 
		List<Product> collect2 = products.stream().sorted().collect(Collectors.toList());
		System.out.println(collect2);
	}

	public static void main(String[] args) {
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(101, "Mango", 200));
		productlist.add(new Product(102, "Orange", 100));
		productlist.add(new Product(103, "Papaya", 150));
		productlist.add(new Product(104, "Gvava", 50));
		productlist.add(new Product(105, "Grapes", 120));
		productlist.add(new Product(106, "Banana", 200));
		listIntoMap(productlist);
	}
}

//class Product
class Product implements Comparable<Product> {
	public int productId;
	public String productName;
	public double price;

	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return productId + "\t" + productName + "\t=" + price;
	}

	@Override
	public int compareTo(Product o) {
		int compareTo = this.productName.compareTo(o.productName);
		return compareTo;
	}

}
