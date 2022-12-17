
public class Camera extends Device {
	private String Ctype; // camera type (example: 360 camera, Action camera, Body camera)
	public Camera(String brand, String name, String type, int price, String Ctype) {
		super(brand, name, type, price);
		this.Ctype = Ctype;
		// TODO Auto-generated constructor stub
	}
	public String getCtype() {
		return Ctype;
	}
	public void setCtype(String ctype) {
		Ctype = ctype;
	}
	
}
