import java.util.*;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Device> device = new ArrayList<Device>();
	// prints the menu
	void printMenu() {
		System.out.println("Device");
		System.out.println("1. Add device");
		System.out.println("2. View device");
		System.out.println("3. Delete device");
		System.out.println("4. Exit");
		System.out.print(">> ");
	}
	
	
	//Adds device to the list
	void addDevice() {
		String brand;
		String name;
		String type;
		int price;
		
		System.out.print("Input brand: ");
		brand = scan.next();
		
		System.out.print("Input name: ");
		name = scan.next();
		
		do {
			System.out.print("Input type[PC | MoblieDevice | headphones | Camera | Mouse]: ");
		
			type = scan.next();
		}
		while(!type.equals("PC") && !type.equals("MobileDevice") && !type.equals("headphones") && !type.equals("Camera") && !type.equals("Mouse"));
		
		System.out.println("Input price: ");
		price = scan.nextInt();
		
		if(type.equals("PC")) {
			int RAM;
			String CPU;
			String GPU;
			
			System.out.print("Input RAM: ");
			RAM = scan.nextInt();
			
			
			System.out.print("Input CPU: ");
			CPU = scan.next();
			
			
			System.out.print("Input GPU:");
			GPU = scan.nextLine();
			GPU += scan.nextLine();
			
			device.add(new PC(brand, name, type, price, RAM, GPU, CPU));
			
		}
		else if(type.equals("MoblieDevice")) {
			String MDT;
			int Storage;
			int RAM;
			
			System.out.print("Input MDT: ");
			MDT = scan.next();
			
			System.out.print("Input Storage: ");
			Storage = scan.nextInt();
			
			System.out.print("Input RAM: ");
			RAM = scan.nextInt();
			
			
			device.add(new MobileDevice(brand, name, type, price, MDT, Storage, RAM));
		}
		
		else if(type.equals("headphones")) {
			String WorB;
			
			do {
				System.out.print("Input whether headphone is wired or bluetooth[Yes|No]: ");
				WorB = scan.next();
			}while(!WorB.equals("Yes") && !WorB.equals("No"));
			
			device.add(new headphone(brand, name, type, price, WorB));
		}
		else if(type.equals("Camera")) {
			String Ctype;
			
			System.out.print("Input camera type:");
			Ctype = scan.next();
			
			device.add(new Camera(brand, name, type, price, Ctype));
		}
		else if(type.equals("Mouse")) {
			String WorB;
			
			do {
				System.out.print("Input whether the mouse is wired or bluetooth[Yes|No]: ");
				WorB = scan.next();
			}while(!WorB.equals("Yes") && !WorB.equals("No"));
			device.add(new Mouse(brand, name, type, price, WorB));
		}
		
	}
	
	
	void viewDevice(){
		if(device.isEmpty()) {
			System.out.println("No Device found");
			System.out.println("");
		}
		
		else {
			for (Device d: device) {
				int i=1;
				System.out.println("Device" + i);
				System.out.println("=============================");
				if(d instanceof PC) {
					System.out.printf("%d - %s - %s - %s - %d - %d - %s - %s", i, d.getBrand(), d.getName(), d.getType(), d.getPrice(), ((PC)d).getRAM(), ((PC)d).getCPU(), ((PC)d).getGPU());
				}
				else if(d instanceof MobileDevice) {
					System.out.printf("%d - %s - %s - %s - %d - %s - %d - %d", i, d.getBrand(), d.getName(), d.getType(), d.getPrice(), ((MobileDevice)d).getMDT(), ((MobileDevice)d).getStorage(), ((MobileDevice)d).getRAM());
					
				}
				else if(d instanceof headphone) {
					System.out.printf("%d - %s - %s - %s - %d - %s", i, d.getBrand(), d.getName(),d.getType(),d.getPrice(), ((headphone)d).getWorB());;
				}
				else if(d instanceof Camera) {
					System.out.printf("%d - %s - %s - %s - %d - %s", i, d.getBrand(), d.getName(),d.getType(),d.getPrice(),((Camera)d).getCtype());
				}
				else if(d instanceof Mouse) {
					System.out.printf("%d - %s - %s - %s - %d - %s", i, d.getBrand(), d.getName(),d.getType(),d.getPrice(), ((Mouse)d).getWorB());;
				}
				for(int j = 0; j < 5 ; j++){
					System.out.println("");
				}
			}
		}
	}
	
	void delete() {
		if(device.isEmpty()) {
			System.out.println("No Data");
		}
		else {
			int choice;
			System.out.print("Delete index:");
			choice  = scan.nextInt();
			
			device.remove(choice);
		}
	}
	
	public Main() {
		int opt=0;	
		do {
			printMenu();
			opt = scan.nextInt();
			switch(opt) {
			case 1:
				addDevice();
				break;
			
			case 2:
				viewDevice();
				break;
				
			case 3:
				delete();
				break;
				
			case 4:
				break;
			}
			
		}while(opt!=4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
		
		
	}

}
