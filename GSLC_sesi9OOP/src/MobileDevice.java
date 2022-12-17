
public class MobileDevice extends Device {
	private String MDT;
	private int Storage;
	private int RAM;
	
	public MobileDevice(String brand, String name, String type, int price, String MDT, int Storage, int RAM) {
		super(brand, name, type, price);
		this.MDT = MDT;
		this.Storage = Storage;
		this.RAM = RAM;
		// TODO Auto-generated constructor stub
	}

	public String getMDT() {
		return MDT;
	}

	public void setMDT(String mDT) {
		MDT = mDT;
	}

	public int getStorage() {
		return Storage;
	}

	public void setStorage(int storage) {
		Storage = storage;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}
	
}
