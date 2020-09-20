package Controller;

import Model.OrderProductModel;
import View.OrderProductView;

public class OrderProductController {
	private OrderProductModel model;
	private OrderProductView view;
	
	public OrderProductController(OrderProductModel model, OrderProductView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getOrderProductFkProduct() {
		return model.getFkProduct();
	}
	
	public String getOrderProductFkOrder() {
		return model.getFkOrder();
	}
	
	public int getOrderProductProductQuantity() {
		return model.getProductQuantity();
	}
	
	public void updateView() {
		view.showDetails(model.toString());
	}
}
