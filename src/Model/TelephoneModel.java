package Model;

public class TelephoneModel {
	private int ddd;
	private String number;
	private int fkClient;

	public TelephoneModel(int ddd, String number, int fkClient) {
		this.ddd = ddd;
		this.number = number;
		this.fkClient = fkClient;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getFkClient() {
		return fkClient;
	}

	@Override
	public String toString() {
		return String.format("{ \"ddd\": %d, \"number\": \"%s\", \"fk_client\": %d }", ddd, number, fkClient);
	}
}
