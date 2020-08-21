package main;

import java.io.IOException;
import java.sql.Date;

import domain.Category;
import domain.DataRepository;
import domain.Money;
import domain.Product;
import domain.ProductFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ProductSaveController {
	
	@FXML
	private TextField inputName;
	@FXML
	private TextField inputPrice;
	@FXML
	private TextField inputCurrencyCode;
	@FXML
	private TextField inputQuantity;
	@FXML
	private TextField inputExpDate;
	@FXML
	private TextField inputManufactured;
	@FXML
	private TextField inputCategory;
	
	

	public void saveProduct() {
		String name = inputName.getText();
		Money price = new Money(
								inputCurrencyCode.getText(),
								Float.valueOf(inputPrice.getText())
								);
		Integer quantity = Integer.valueOf(inputQuantity.getText());
		Date expiration = Date.valueOf(inputExpDate.getText());
		String manufactured = inputManufactured.getText();
		Category category = new Category(inputCategory.getText());
		
		DataRepository.save((Product) ProductFactory.getProductFactory().getProduct(name, price, quantity, expiration, manufactured,category));
	}
	
	public void loadProduct() throws IOException {
		MainFX.setRoot("resources/showMenu.fxml");
	}
}
