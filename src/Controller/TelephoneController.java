package Controller;

import Model.TelephoneModel;
import View.TelephoneView;

public class TelephoneController {
	private TelephoneModel model;
	private TelephoneView view;

	public TelephoneController(TelephoneModel model, TelephoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getTelephoneDdd() {
		return model.getDdd();
	}
	
	public void setTelephoneDdd(int ddd) {
		model.setDdd(ddd);
	}
	
	public String getTelephoneNumber() {
		return model.getNumber();
	}
	
	public void setTelephoneNumber(String number) {
		model.setNumber(number);
	}
	
	public int getTelephoneFkClient() {
		return model.getFkClient();
	}
	
	public void updateView() {
		view.showDetails(model.toString());
	}
	
}
