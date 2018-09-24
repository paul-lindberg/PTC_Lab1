// CSI - 340 - 01: Software Specialties
// Lab 01 - Airline Reservation System
// 9/24/18
// Group Members:
//   Tynan Matthews - tynan.matthews@mymail.champlain.edu
//   Paul Lindberg - paul.lindberg@mymail.champlain.edu
//   Chase Bertram - chase.bertram@mymail.champlain.edu

import java.util.ArrayList;

public class Plane {

	public Airline airline;
	public int number;
	public ArrayList<Seat> seats = new ArrayList<Seat>();
	
	public Plane(Airline airline, int number) {
		
		this.airline = airline;
		this.number = number;
		
		this.seats.add(new Seat("1a", seatType.VIP, "window"));
		this.seats.add(new Seat("1b", seatType.VIP, "aisle"));
		this.seats.add(new Seat("2a", seatType.VIP, "window"));
		this.seats.add(new Seat("2b", seatType.VIP, "aisle"));
		
		this.seats.add(new Seat("3a", seatType.REGULAR, "window"));
		this.seats.add(new Seat("3b", seatType.REGULAR, "aisle"));
		this.seats.add(new Seat("4a", seatType.REGULAR, "window"));
		this.seats.add(new Seat("4b", seatType.REGULAR, "aisle"));
		this.seats.add(new Seat("5a", seatType.REGULAR, "window"));
		this.seats.add(new Seat("5b", seatType.REGULAR, "aisle"));
		this.seats.add(new Seat("6a", seatType.REGULAR, "window"));
		this.seats.add(new Seat("6b", seatType.REGULAR, "aisle"));
		this.seats.add(new Seat("7a", seatType.REGULAR, "window"));
		this.seats.add(new Seat("7b", seatType.REGULAR, "aisle"));
		
	}

	@Override
	public String toString() {
		return "Plane [airline=" + airline + ", seats=" + seats + "]";
	}
	
}
