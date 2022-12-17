
public class PC extends Device {
	private int RAM;
	private String CPU;
	private String GPU;
	public PC(String brand, String name, String type,int price , int RAM, String GPU, String CPU) {
		super(brand, name, type, price);
		this.RAM = RAM;
		this.CPU = CPU;
		this.GPU = GPU;
		
		// TODO Auto-generated constructor stub
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getGPU() {
		return GPU;
	}
	public void setGPU(String gPU) {
		GPU = gPU;
	}
	
	

}
