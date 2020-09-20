import Controller.*;
import Model.*;
import View.*;

public class Program {
	private static int currentClientId;

	public static void main(String[] args) {
		ClientModel clientModel = getClientFromDatabase();
		ClientView clientView = new ClientView();
		ClientController clientController = new ClientController(clientModel, clientView);
		
		AddressModel addressModel = getAddressFromDatabase(clientController.getIdClient());
		AddressView addressView = new AddressView();
		AddressController addressController = new AddressController(addressModel, addressView);
		
		clientController.updateView();
		addressController.updateView();
	}

	private static ClientModel getClientFromDatabase() {
		ClientModel client = new ClientModel(currentClientId, "Test Client", "test.client@somemail.com",
				"123.456.789-00", "12.345.678-90", "1996-01-11");
		
		currentClientId++;
		
		return client;
	}
	
	private static AddressModel getAddressFromDatabase(int fkClient) {
		AddressModel address = new AddressModel(0, "Fool's Street", "Bar", "Next to Neverland", "Belém", "Pará", fkClient);
		
		return address;
	}

}
