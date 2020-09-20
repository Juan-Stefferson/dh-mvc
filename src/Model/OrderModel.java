package Model;

public class OrderModel {
	private String ei; // stands for electronic invoice
	private String emissionDate;
	private double total;
	private String status;
	private int fkClient;

	public OrderModel(String ei, String emissionDate, double total, String status, int fkClient) {
		this.ei = ei;
		this.emissionDate = emissionDate;
		this.total = total;
		this.status = status;
		this.fkClient = fkClient;
	}

	public String getEi() {
		return ei;
	}

	public void setEi(String ei) {
		this.ei = ei;
	}

	public String getEmissionDate() {
		return emissionDate;
	}

	public void setEmissionDate(String emissionDate) {
		this.emissionDate = emissionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public int getFkClient() {
		return fkClient;
	}

	@Override
	public String toString() {
		return String.format(
				"{ \"ei\": \"%s\", \"emission_date\": \"%s\", \"total\": %.2f, \"status\": \"%s\", \"fk_client\": %d }",
				ei, emissionDate, total, status, fkClient);
	}

}
