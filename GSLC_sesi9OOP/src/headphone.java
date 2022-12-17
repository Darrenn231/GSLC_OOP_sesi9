
public class headphone extends Device {
	private String WorB; // Wireless or Bluetooth
	public headphone(String brand, String name, String type, int price, String WorB) {
		super(brand, name, type, price);
		this.WorB = WorB;
		// TODO Auto-generated constructor stub
	}
	public String getWorB() {
		return WorB;
	}
	public void setWorB(String worB) {
		WorB = worB;
	}
	
}
