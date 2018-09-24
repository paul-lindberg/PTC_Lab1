// CSI - 340 - 01: Software Specialties
// Lab 01 - Airline Reservation System
// 9/24/18
// Group Members:
//   Tynan Matthews - tynan.matthews@mymail.champlain.edu
//   Paul Lindberg - paul.lindberg@mymail.champlain.edu
//   Chase Bertram - chase.bertram@mymail.champlain.edu

public class Seat {

	public String number;
	public seatType type;
	public String location;
	
	public Seat(String number, seatType type, String location) {
		
		this.number = number;
		this.type = type;
		this.location = location;
		
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public seatType getType() {
		return type;
	}
	public void setType(seatType type) {
		this.type = type;
	}
	
}
