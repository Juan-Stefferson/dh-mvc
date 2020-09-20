package View;

public class AddressView extends View {
	@Override
	public void showDetails(String data) {
		System.out.print("Address: ");
		super.showDetails(data);
	}
}
