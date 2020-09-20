package View;

public class ClientView extends View {
	@Override
	public void showDetails(String data) {
		System.out.print("Client: ");
		super.showDetails(data);
	}
}