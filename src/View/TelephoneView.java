package View;

public class TelephoneView extends View {
	@Override
	public void showDetails(String data) {
		System.out.print("Telephone: ");
		super.showDetails(data);
	}
}
