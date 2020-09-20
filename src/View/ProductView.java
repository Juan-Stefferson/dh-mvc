package View;

public class ProductView extends View {
	@Override
	public void showDetails(String data) {
		System.out.print("Product: ");
		super.showDetails(data);
	}
}
