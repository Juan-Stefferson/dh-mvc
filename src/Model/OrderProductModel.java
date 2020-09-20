package Model;

public class OrderProductModel {
	private int fkProduct;
	private String fkOrder;
	private int productQuantity;

	public OrderProductModel(int fkProduct, String fkOrder, int productQuantity) {
		this.fkProduct = fkProduct;
		this.fkOrder = fkOrder;
		this.productQuantity = productQuantity;
	}

	public int getFkProduct() {
		return fkProduct;
	}

	public String getFkOrder() {
		return fkOrder;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	@Override
	public String toString() {
		return String.format("{ \"fk_product\": %d, \"fk_order\": \"%s\", \"product_quantity\": %d }", fkProduct, fkOrder,
				productQuantity);
	}

}
