// CSI - 340 - 01: Software Specialties
// Lab 01 - Airline Reservation System
// 9/24/18
// Group Members:
//   Tynan Matthews - tynan.matthews@mymail.champlain.edu
//   Paul Lindberg - paul.lindberg@mymail.champlain.edu
//   Chase Bertram - chase.bertram@mymail.champlain.edu

public class Airline {

	public String name;
	
	public Airline(String name) {
		
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Airline [name=" + name + "]";
	}

}
