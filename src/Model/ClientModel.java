package Model;

public class ClientModel {
	private int idClient;
	private String name;
	private String email;
	private String cpf;
	private String rg;
	private String bornDate;
	
	public ClientModel(int id_client, String name, String email, String cpf, String rg, String born_date) {
		this.idClient = id_client;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.bornDate = born_date;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getBornDate() {
		return bornDate;
	}
	
	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}
	
	public int getIdClient() {
		return idClient;
	}
}

