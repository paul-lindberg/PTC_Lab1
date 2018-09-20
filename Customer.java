import java.util.ArrayList;

public class Customer {

	public String firstName;
	public String lastName;
	public ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void printItinerary(Flight flight) {
		
		for (Ticket ticket : tickets) {
			
			if (ticket.flight == flight) {
				
				System.out.println("Name: " + this.firstName + " " + this.lastName + "\nAirline: " + ticket.flight.plane.airline.name + 
						"\nFlight Number: " + ticket.flight.number + "\nOrigin Airport: " + ticket.flight.originAirport + 
						"\nDestination Airport: " + ticket.flight.destinationAirport +"\nDate: " + ticket.flight.date + 
						"\nDeparture Time: " + ticket.flight.departureTime);
				
			}
			
		}
		
	}
	
	public void bookFlight(Flight flight) {
		
		this.tickets.add(new Ticket(flight));
		
	}
	
}
