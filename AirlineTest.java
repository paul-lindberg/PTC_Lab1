
public class AirlineTest {

	public static void main(String[] args) {
		
		Airline JetBlue = new Airline("JetBlue");
		Plane plane1 = new Plane(JetBlue);
		Flight flight1 = new Flight(plane1, 1, "Burlington International Airport", "JFK International Airport", "9/18/18", "12:00PM");
		Flight flight2 = new Flight(plane1, 2, "JFK International Airport", "Hartsfield-Jackson Atlanta International Airport", "9/18/18", "4:30PM");
		
		Customer customer1 = new Customer("Tynan", "Matthews");
		Customer customer2 = new Customer("Paul", "Lindberg");
		Customer customer3 = new Customer("Chase", "Bertram");
		
		customer1.bookFlight(flight1);
		customer2.bookFlight(flight2);
		customer3.bookFlight(flight2);
		
		customer1.printItinerary(flight1);
		
	}
	
}
