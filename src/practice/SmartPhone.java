package practice;

//Outer Class Phone
class Phone{
	int price;
	
	
	//2 Nested Classes Android and RAM
	class Android{
		int core;
		String manufacturer;
		
		int getAndroidVersion() {
			return 12;
		}
	}
	
	protected class RAM{
		int memory;
		String manufacturer;
		
		int getInternalStorage() {
			return 256;
		}
	}
}


//Main Class SmartPhone
public class SmartPhone{
	public static void main (String[] args) {
		
		//Created an Instance of an outer class Phone named as phone
		Phone phone = new Phone();
		
		
		//Using the Instance of outer class created objects of inner classes
		Phone.Android android = phone.new Android();
		
		Phone.RAM ram = phone.new RAM();
		
		System.out.println("ANDROID " + android.getAndroidVersion());
		System.out.println(ram.getInternalStorage() + " GB");
	}
	
}
