package View;

public class OrderView extends View {
	@Override
	public void showDetails(String data) {
		System.out.print("Order: ");
		super.showDetails(data);
	}
}

