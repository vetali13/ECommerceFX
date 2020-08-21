package domain;

import java.io.Serializable;
import java.util.Date;
	
public class Product extends AbstractProduct implements Serializable{
		private Integer id;
		private String name;
		private Money price;
		private Integer quantity;
		private Date expiration;
		private String manufactured;
		private Category category;
	
		protected Product(Integer id, String name, Money price, Integer quantity, Date expiration, String manufactured,
				Category category) {
			this.id = id;
			this.name = name;
			this.price = price;
			this.quantity = quantity;
			this.expiration = expiration;
			this.manufactured = manufactured;
			this.category = category;
		}

		public String getName() {		
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public Money getPrice() {
			return this.price;
		}

		public void setPrice(Money price) {
			this.price = price;
			
		}

		public Integer getQuantity() {
			return this.quantity;
		}
		
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
			
		}

		public Date getExpiration() {
			return this.expiration;
		}

		public void setExpiration(Date expiration) {
			this.expiration = expiration;
		}

		public String getManufactured() {
			return this.manufactured;
		}

		public void setManufactured(String manufactured) {
			this.manufactured = manufactured;
			
		}

		public Category getCategory() {
			return this.category;
		}

		public void setCategory(Category category) {
			this.category = category;
			
		}

		@Override
		public String toString() {
			return "Id: " + this.getId() + "; Product: " + this.getName() + "; Price: " + this.getPrice() + "; Quantity: " + this.getQuantity() + "; Exp: "
					+ this.getExpiration() + "; Manufactured in: " + this.getManufactured() + "; " + this.getCategory();
		}

		public Integer getId() {
			return this.id;
		}
		
}