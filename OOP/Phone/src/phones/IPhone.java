package phones;

public class IPhone extends Phone implements Ringable{

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		String ringer = getRingTone();
		return ringer;
	}
	
	@Override
	public String unlock() {
		return "Unlocked";
	}
	
	@Override 
	public void displayInfo() {
		System.out.println("IPhone " + getVersionNumber() + "from " + getCarrier() + "with " + getBatteryPercentage() + " % battery");
	}
}
