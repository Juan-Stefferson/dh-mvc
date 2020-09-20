package Model;

public class AddressModel {
	private int number;
	private String street;
	private String neighbourhood;
	private String complement;
	private String city;
	private String state;
	private int fkClient;

	public AddressModel(int number, String street, String neighbourhood, String complement, String city, String state,
			int fkClient) {
		this.number = number;
		this.street = street;
		this.neighbourhood = neighbourhood;
		this.complement = complement;
		this.city = city;
		this.state = state;
		this.fkClient = fkClient;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getFkClient() {
		return fkClient;
	}

	@Override
	public String toString() {
		return String.format(
				"{ \"street\": \"%s\", \"number\": %d, \"complement\": \"%s\", \"neighbourhood\": \"%s\", \"city\": \"%s\", \"state\": \"%s\", \"fk_client\": %d }",
				street, number, complement, neighbourhood, city, state, fkClient);
	}

}
