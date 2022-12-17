
public abstract class Device {
	private String brand;
	private String name;
	private String type;
	private int price;
	
	
	public Device(String brand, String name, String type, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
