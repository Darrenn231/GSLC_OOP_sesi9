
public class Mouse extends Device {
	private String WorB;
	
	public Mouse(String brand, String name, String type, int price, String WorB) {
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
