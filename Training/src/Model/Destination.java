package Model;

public class Destination
{
	private int id;
	private String ship_to;
	private String street_adress;
	private String city;
	private String state;
	private String country;
	private String delivery_start;
	private String delivery_end;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShip_to() {
		return ship_to;
	}
	public void setShip_to(String ship_to) {
		this.ship_to = ship_to;
	}
	public String getStreet_adress() {
		return street_adress;
	}
	public void setStreet_adress(String street_adress) {
		this.street_adress = street_adress;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDelivery_start() {
		return delivery_start;
	}
	public void setDelivery_start(String delivery_start) {
		this.delivery_start = delivery_start;
	}
	public String getDelivery_end() {
		return delivery_end;
	}
	public void setDelivery_end(String delivery_end) {
		this.delivery_end = delivery_end;
	}
	public Destination(int id, String ship_to, String street_adress, String city, String state, String country,
			String delivery_start, String delivery_end) {
		super();
		this.id = id;
		this.ship_to = ship_to;
		this.street_adress = street_adress;
		this.city = city;
		this.state = state;
		this.country = country;
		this.delivery_start = delivery_start;
		this.delivery_end = delivery_end;
	}
	public Destination() {
		
	}

	
	

}
