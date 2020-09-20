package Controller;

import Model.ClientModel;
import View.ClientView;

public class ClientController {
	ClientModel model;
	ClientView view;

	public ClientController(ClientModel model, ClientView view) {
		this.model = model;
		this.view = view;
	}

	public String getClientName() {
		return model.getName();
	}

	public void setClientName(String name) {
		model.setName(name);
	}

	public String getClientEmail() {
		return model.getEmail();
	}

	public void setClientEmail(String email) {
		model.setEmail(email);
	}

	public String getClientCpf() {
		return model.getCpf();
	}

	public void setClientCpf(String cpf) {
		model.setCpf(cpf);
	}

	public String getClientRg() {
		return model.getRg();
	}

	public void setClientRg(String rg) {
		model.setRg(rg);
	}

	public String getClientBornDate() {
		return model.getBornDate();
	}

	public void setClientBornDate(String bornDate) {
		model.setBornDate(bornDate);
	}

	public int getIdClient() {
		return model.getIdClient();
	}

	public void updateView() {
		view.showDetails(model.toString());
	}
}