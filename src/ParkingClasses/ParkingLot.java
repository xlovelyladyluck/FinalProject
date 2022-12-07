package ParkingClasses;

public class ParkingLot implements Comparable<ParkingLot>{
	private String key;
	private int value;
	
	public ParkingLot(String k, int v) {
		this.key = k;
		this.value = v;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	 @Override
	    public int compareTo(ParkingLot other) {
	        return this.getKey().compareTo(other.getKey());
	    }

}
