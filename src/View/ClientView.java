package View;

public class ClientView {
	public void printClientDetails(int clientId, String clientName, String clientEmail, String clientCpf,
			String clientRg, String clientBornDate) {
		System.out.println("Client Details:");
		System.out.println();
		System.out.println("Id: " + clientId);
		System.out.println("Name: " + clientName);
		System.out.println("E-Mail: " + clientEmail);
		System.out.println("CPF: " + clientCpf);
		System.out.println("RG: " + clientRg);
		System.out.println("Born Date: " + clientBornDate);
		System.out.println("---------- X ----------");
		System.out.println();
	}
}