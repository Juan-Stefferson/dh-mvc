package Controller;

import Model.AddressModel;
import View.AddressView;

public class AddressController {
	private AddressModel model;
	private AddressView view;
	
	public AddressController(AddressModel model, AddressView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getAddressNumber() {
		return model.getNumber();
	}
	
	public void setAddressNumber(int number) {
		model.setNumber(number);
	}
	
	public String getAddressStreet() {
		return model.getStreet();
	}
	
	public void setAddressStreet(String street) {
		model.setStreet(street);
	}
	
	public String getAddressNeighbourhood() {
		return model.getNeighbourhood();
	}
	
	public void setAddressNeighbourhood(String neighbourhood) {
		model.setNeighbourhood(neighbourhood);
	}
	
	public String getAddressComplement() {
		return model.getComplement();
	}
	
	public void setAddressComplement(String complement) {
		model.setComplement(complement);
	}
	
	public String getAddressCity() {
		return model.getCity();
	}
	
	public void setAddressCity(String city) {
		model.setCity(city);
	}
	
	public String getAddressState() {
		return model.getState();
	}
	
	public void setAddressState(String state) {
		model.setState(state);
	}
	
	public int getAddressFkClient() {
		return model.getFkClient();
	}
	
	public void updateView() {
		view.showDetails(model.toString());
	}
	
}
