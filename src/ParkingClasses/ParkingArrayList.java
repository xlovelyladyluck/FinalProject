package ParkingClasses;

import java.util.ArrayList;


public class ParkingArrayList {

	public int parkingSpots;
	ArrayList<ParkingLot> finalizeList;

	ParkingArrayList(int p) {
		finalizeList = new ArrayList<ParkingLot>(p);
		this.parkingSpots = p;
	}

	public int getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(int parkingSpots) {
		this.parkingSpots = parkingSpots;
	}

	// method to display the string of cars and their number of days sorted in
	// priority queue
	@Override
	public String toString() {
		String list = "";

		for (int j = 0; j < finalizeList.size(); j++) {
			list += "Car " + finalizeList.get(j).getKey() + " is staying " + finalizeList.get(j).getKey() + " days.";
		}
		return list;
	}
}
