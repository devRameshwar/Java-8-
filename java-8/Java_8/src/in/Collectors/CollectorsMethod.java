package in.Collectors;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class CollectorsMethod {
	// Adding Total Price of All Product using Collectors method in Stream APIs
	public static void addAllProductPrice(ArrayList<Product> productuList) {
		// This is return only Total Price of all project
		double totelPrice = productuList.stream().collect(Collectors.summarizingDouble(price -> price.price)).getSum();
		System.out.println(totelPrice);

		// A state object for collecting statistics such as count, min, max, sum,
		// average.
		DoubleSummaryStatistics totelSummary = productuList.stream()
				.collect(Collectors.summarizingDouble(price -> price.price));
		System.out.println(totelSummary);
	}

	public static void minAndMaxOfProductPrice(ArrayList<Product> products) {
		// Find the minimum price of product
		Product min = products.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println(min.productName);
		// Find the maximum Price of the product
		Product max = products.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println(max.price);
		// An other way to find Finding min/max of product price
		DoubleSummaryStatistics collect = products.stream().collect(Collectors.summarizingDouble(price -> price.price));
		System.out.println("Max- " + collect.getMax() + "\t Min- " + collect.getMin());
		System.out.println(collect);
	}

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		// Adding product in a list
		productList.add(new Product("I-Phone", 60000.0f));
		productList.add(new Product("One Plus", 30000.0f));
		productList.add(new Product("RealMe", 15000.0f));
		productList.add(new Product("Xmami", 28000.0f));
		productList.add(new Product("Sumsung", 18000.0f));
		// System.out.println(productList);
		addAllProductPrice(productList);
		minAndMaxOfProductPrice(productList);
	}

}

//Product class
class Product {
	public String productName;
	public float price;

	public Product(String productName, float price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return productName + "\t" + price;
	}

}