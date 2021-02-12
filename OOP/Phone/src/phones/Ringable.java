package phones;

public interface Ringable {
	
	public default String ring() {
		return "Ring, Ring, Ring";
	}
	
	public default String unlock() {
		return "unlocked";
	}
}
