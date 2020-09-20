import Controller.ClientController;
import Model.ClientModel;
import View.ClientView;

public class Program {
	private static int currentClientId;

	public static void main(String[] args) {
		ClientModel clientModel = getClientFromDatabase();

		ClientView clientView = new ClientView();

		ClientController clientController = new ClientController(clientModel, clientView);
		
		clientController.updateView();
	}

	private static ClientModel getClientFromDatabase() {
		ClientModel client = new ClientModel(currentClientId, "Test Client", "test.client@somemail.com",
				"123.456.789-00", "12.345.678-90", "1996-01-11");
		
		currentClientId++;
		
		return client;
	}

}
