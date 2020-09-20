package Controller;

import Model.ProductModel;
import View.ProductView;

public class ProductController {
	private ProductModel model;
	private ProductView view;

	public ProductController(ProductModel model, ProductView view) {
		this.model = model;
		this.view = view;
	}

	public String getProductName() {
		return model.getName();
	}

	public void setProductName(String name) {
		model.setName(name);
	}

	public String getProductDescription() {
		return model.getDescription();
	}

	public void setProductDescription(String description) {
		model.setDescription(description);
	}

	public int getProductStock() {
		return model.getStock();
	}

	public void setProductStock(int stock) {
		model.setStock(stock);
	}

	public double getProductPrice() {
		return model.getPrice();
	}

	public void setProductPrice(double price) {
		model.setPrice(price);
	}

	public int getProductId() {
		return model.getId();
	}
	
	public void updateView() {
		view.showDetails(model.toString());
	}
}
