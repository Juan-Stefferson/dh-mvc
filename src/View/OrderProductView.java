package View;

public class OrderProductView extends View {
	@Override
	public void showDetails(String data) {
		System.out.print("Order-Product: ");
		super.showDetails(data);
	}
}
