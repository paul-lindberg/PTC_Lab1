// CSI - 340 - 01: Software Specialties
// Lab 01 - Airline Reservation System
// 9/24/18
// Group Members:
//   Tynan Matthews - tynan.matthews@mymail.champlain.edu
//   Paul Lindberg - paul.lindberg@mymail.champlain.edu
//   Chase Bertram - chase.bertram@mymail.champlain.edu

public class AirlineTest {

	public static void main(String[] args) {
		
		Airline JetBlue = new Airline("JetBlue");
		Plane plane1 = new Plane(JetBlue, 1);
		Plane plane2 = new Plane(JetBlue, 2);
		Flight flight1 = new Flight(plane1, 1, "Burlington International Airport", "JFK International Airport", "9/18/18", "12:00PM");
		Flight flight2 = new Flight(plane2, 2, "JFK International Airport", "Hartsfield-Jackson Atlanta International Airport", "9/18/18", "4:30PM");
		
		Customer customer1 = new Customer("Tynan", "Matthews");
		Customer customer2 = new Customer("Paul", "Lindberg");
		Customer customer3 = new Customer("Chase", "Bertram");
		
		customer1.bookFlight("1a", flight1);
		customer1.bookFlight("1a", flight2);
		customer2.bookFlight("5b", flight2);
		customer3.bookFlight("5a", flight2);
		customer2.bookFlight("5a", flight2);
		
		customer1.printItinerary();
		customer2.printItinerary();
		customer3.printItinerary();
		
	}
	
}
