// CSI - 340 - 01: Software Specialties
// Lab 01 - Airline Reservation System
// 9/24/18
// Group Members:
//   Tynan Matthews - tynan.matthews@mymail.champlain.edu
//   Paul Lindberg - paul.lindberg@mymail.champlain.edu
//   Chase Bertram - chase.bertram@mymail.champlain.edu

import java.util.ArrayList;

public class Customer {

	public String firstName;
	public String lastName;
	public ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void printItinerary() {
		
		for (Ticket ticket : tickets) {
				
				System.out.println("\nName: " + this.firstName + " " + this.lastName + "\nAirline: " + ticket.flight.plane.airline.name + 
						"\nFlight Number: " + ticket.flight.number + "\nPlane Number: " + ticket.flight.plane.number + "\nSeat Number: " + 
						ticket.seat.number + "\nSeat Location: " + ticket.seat.location + "\nSeat Type: " + ticket.seat.type +  
						"\nOrigin Airport: " + ticket.flight.originAirport + 
						"\nDestination Airport: " + ticket.flight.destinationAirport +"\nDate: " + ticket.flight.date + 
						"\nDeparture Time: " + ticket.flight.departureTime);
			
		}
		
	}
	
	public void bookFlight(String seatNum, Flight flight) {
		
		if (flight.reserveSeat(seatNum, this)) {
			
			//this.tickets.add(new Ticket(flight, ));
			System.out.println("Thank you, " + this.firstName + " " + this.lastName + ", " + seatNum + " for flight " + flight.number + " has been reserved");
				
		}
		
		else {
			
			System.out.println("Sorry, " + this.firstName + " " + this.lastName + ", " + seatNum + " is taken");
			
		}
	}
	
}
