package ParkingClasses;

import java.util.PriorityQueue;

public class PriorityQ {

	private int maxLotSize = 15;
	public static ParkingLot[] queArray;
	private int inputValue;

	// Constructor for the priority queue which sets the max size and sets the input
	// value to 0 so that the priority queue input is starting properly.
	public PriorityQ(int size) {
		this.maxLotSize = size;
		queArray = new ParkingLot[maxLotSize];
		this.inputValue = 0;
	}

	// Method to insert the input into the priority queue.
	public void insert(ParkingLot input) {
		int i;

		if (isEmpty())
			queArray[inputValue++] = input;
		else {
			for (i = inputValue - 1; i >= 0; i--) {
				if (input.compareTo(queArray[i]) < 1)
					queArray[i + 1] = queArray[i];// might be out of bounds
				else
					break;
			}
			queArray[i + 1] = input;
			inputValue++;
		}
	}

	// Method to remove an input from priority queue, for demonstration only.
	public ParkingLot remove() {
		if (!isEmpty()) {
			return queArray[--inputValue];
		} else
			return null;
	}

	// method to peek at the smallest value, for demonstration only.
	public ParkingLot peekMin() {
		if (!isEmpty()) {
			return queArray[inputValue - 1];
		} else
			return null;
	}

	// method to test if the priority queue is empty, for demonstration only.
	public boolean isEmpty() {
		return (inputValue == 0);
	}

	// method to test if the priority queue is full, for demonstration only.
	public boolean isFull() {
		return (inputValue == maxLotSize);
	}
	
	
	

	// priorityqueue for people in number of days
	// put people in arraylist

	// one button for one person to generate
	// button for park who have a parking tickets where they get put in the
	// arraylist from priority queue and then you can print out the array list.
	// input car 1 and car 2, making cases. for junit testing.
	// making a priority queue of tickets, in park method take priority and put into
	// arraylist.

}
