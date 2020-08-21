package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductFactory {
	
	private static final ProductFactory INSTANCE = new ProductFactory(new ArrayList<>(), 1);
	private List<AbstractProduct> products;
	private Integer id;
	
	private ProductFactory(List<AbstractProduct> products, Integer id) {
		this.products = products;
		this.id = id;
	}
	
	
	public AbstractProduct getProduct(String name, Money price, Integer quantity, Date expiration, String manufactured, Category category) {
		AbstractProduct p = new Product(getId(), name, price, quantity, expiration, manufactured, category);
		INSTANCE.products.add(p);
		return p;
	}
	
	
	public void printAllProducts() {
		INSTANCE.products.forEach(System.out::println);
	}
	
	public Integer getId() {
		return INSTANCE.id++;
	}
	
	public static ProductFactory getProductFactory() {
		return INSTANCE;
	}
	
	public List<AbstractProduct> getAllProducts() {
		return INSTANCE.products;
		}
	
	public Product castProduct(AbstractProduct abstractProduct) {
		return (Product)abstractProduct;
	}
	
}