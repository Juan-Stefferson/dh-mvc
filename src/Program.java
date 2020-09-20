import Controller.*;
import Model.*;
import View.*;

public class Program {
	private static int currentClientId;
	private static int currentProductId;

	public static void main(String[] args) {
		ClientModel clientModel = getClientFromDatabase();
		ClientView clientView = new ClientView();
		ClientController clientController = new ClientController(clientModel, clientView);

		AddressModel addressModel = getAddressFromDatabase(clientController.getIdClient());
		AddressView addressView = new AddressView();
		AddressController addressController = new AddressController(addressModel, addressView);
		
		TelephoneModel telephoneModel = getTelephoneFromDatabase(clientController.getIdClient());
		TelephoneView telephoneView = new TelephoneView();
		TelephoneController telephoneController = new TelephoneController(telephoneModel, telephoneView);
		
		ProductModel productModel = getProductFromDatabase();
		ProductView productView = new ProductView();
		ProductController productController = new ProductController(productModel, productView);
		
		OrderModel orderModel = getOrderFromDatabase(clientController.getIdClient());
		OrderView orderView = new OrderView();
		OrderController orderController = new OrderController(orderModel, orderView);
		
		OrderProductModel orderProductModel = getOrderProductFromDatabase(productController.getProductId(), orderController.getOrderEi());
		OrderProductView orderProductView = new OrderProductView();
		OrderProductController orderProductController = new OrderProductController(orderProductModel, orderProductView);

		clientController.updateView();
		addressController.updateView();
		telephoneController.updateView();
		productController.updateView();
		orderController.updateView();
		orderProductController.updateView();
	}

	private static ClientModel getClientFromDatabase() {
		ClientModel client = new ClientModel(currentClientId, "Test Client", "test.client@somemail.com",
				"123.456.789-00", "12.345.678-90", "1996-01-11");

		currentClientId++;

		return client;
	}
	
	private static TelephoneModel getTelephoneFromDatabase(int fkClient) {
		TelephoneModel telephone = new TelephoneModel(91, "91234-5678", fkClient);

		return telephone;
	}

	private static AddressModel getAddressFromDatabase(int fkClient) {
		AddressModel address = new AddressModel(0, "Fool's Street", "Bar", "Next to Neverland", "Belém", "Pará",
				fkClient);

		return address;
	}

	private static OrderModel getOrderFromDatabase(int fkClient) {
		OrderModel order = new OrderModel("", "", 1234.5, "PAYMENT PENDING", fkClient);
		
		return order;
	}
	
	private static ProductModel getProductFromDatabase() {
		ProductModel product = new ProductModel(currentProductId, "Test Product", "Doggo approves that product", 5, 123.45);
		
		return product;
	}
	
	private static OrderProductModel getOrderProductFromDatabase(int fkProduct, String fkOrder) {
		OrderProductModel orderProduct = new OrderProductModel(fkProduct, fkOrder, 10);
		
		return orderProduct;
	}

}
