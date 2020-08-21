package main;
import java.io.IOException;
import java.text.SimpleDateFormat;
import domain.DataRepository;
import domain.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProductLoadController {

	@FXML
	private Label outputName;
	@FXML
	private Label outputPrice;
	@FXML
	private Label outputCurrencyCode;
	@FXML
	private Label outputQuantity;
	@FXML
	private Label outputExpDate;
	@FXML
	private Label outputManufactured;
	@FXML
	private Label outputCategory;
	
	
	public void showContent() throws IOException{
		Product p1 = (Product) DataRepository.load(Product.class);
		
		outputName.setText(p1.getName());
		outputPrice.setText(String.valueOf(p1.getPrice().getAmount()));
		outputCurrencyCode.setText(p1.getPrice().getCurrency().getCode());
		outputQuantity.setText(String.valueOf(p1.getQuantity()));
		System.out.println(p1.getExpiration().toString());
		outputExpDate.setText(p1.getExpiration().toString());
		outputManufactured.setText(p1.getManufactured());
		outputCategory.setText(p1.getCategory().getName());
	}
	
	public void backTo() throws IOException {
		MainFX.setRoot("resources/productMenu.fxml");
	}
}
