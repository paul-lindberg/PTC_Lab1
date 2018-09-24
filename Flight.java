import java.util.ArrayList;

//CSI - 340 - 01: Software Specialties
//Lab 01 - Airline Reservation System
//9/24/18
//Group Members:
//Tynan Matthews - tynan.matthews@mymail.champlain.edu
//Paul Lindberg - paul.lindberg@mymail.champlain.edu
//Chase Bertram - chase.bertram@mymail.champlain.edu

public class Flight {

	public int number;
	public String originAirport;
	public String destinationAirport;
	public String date;
	public String departureTime;
	public Plane plane;
	public ArrayList<Seat> seats;
	
	public Flight(Plane plane, int number, String originAirport, String destinationAirport, String date, String departureTime) {
		
		this.plane = plane;
		this.number = number;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.date = date;
		this.departureTime = departureTime;
		this.seats = (ArrayList<Seat>) plane.seats.clone();
		
	}
	
	public Boolean reserveSeat(String seatNum, Customer customer) {
		
		for (Seat seat : seats) {
			
			if (seat.number == seatNum) {
				
				customer.tickets.add(new Ticket(this, seat));
				this.seats.remove(seat);
				return true;
				
			}
			
		}
		
		return false;
		
	}

	@Override
	public String toString() {
		return "Flight [number=" + number + ", originAirport=" + originAirport + ", destinationAirport="
				+ destinationAirport + ", date=" + date + ", departureTime=" + departureTime + ", plane=" + plane + "]";
	}
	
}
