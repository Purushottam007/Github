package Model;

public class Origin 
{
	private int id;
	private String ship_from;
	private String street_adress;
	private String city;
	private String state;
	private String country;
	private String pickup_start;
	private String pickup_end;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShip_from() {
		return ship_from;
	}
	public void setShip_from(String ship_from) {
		this.ship_from = ship_from;
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
	public String getPickup_start() {
		return pickup_start;
	}
	public void setPickup_start(String pickup_start) {
		this.pickup_start = pickup_start;
	}
	public String getPickup_end() {
		return pickup_end;
	}
	public void setPickup_end(String pickup_end) {
		this.pickup_end = pickup_end;
	}
	public Origin(int id, String ship_from, String street_adress, String city, String state, String country,
			String pickup_start, String pickup_end) {
		super();
		this.id = id;
		this.ship_from = ship_from;
		this.street_adress = street_adress;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pickup_start = pickup_start;
		this.pickup_end = pickup_end;
	}
	public Origin() {
		
	
	}

	
	
	
	
}
