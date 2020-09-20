package Controller;

import Model.OrderModel;
import View.OrderView;

public class OrderController {
	OrderModel model;
	OrderView view;

	public OrderController(OrderModel model, OrderView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getOrderEi() {
		return model.getEi();
	}
	
	public void setOrderEi(String ei) {
		model.setEi(ei);
	}
	
	public String getOrderEmissionDate() {
		return model.getEmissionDate();
	}
	
	public void setOrderEmissionDate(String emissionDate) {
		model.setEmissionDate(emissionDate);
	}
	
	public String getOrderStatus() {
		return model.getStatus();
	}
	
	public void setOrderStatus(String status) {
		model.setStatus(status);
	}
	
	public double getOrderTotal() {
		return model.getTotal();
	}
	
	public int getOrderFkClient() {
		return model.getFkClient();
	}
	
	public void updateView() {
		view.showDetails(model.toString());
	}
}
