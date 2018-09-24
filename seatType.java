// CSI - 340 - 01: Software Specialties
// Lab 01 - Airline Reservation System
// 9/24/18
// Group Members:
//   Tynan Matthews - tynan.matthews@mymail.champlain.edu
//   Paul Lindberg - paul.lindberg@mymail.champlain.edu
//   Chase Bertram - chase.bertram@mymail.champlain.edu

public enum seatType {

	 REGULAR, VIP;

	  public String toString() {
	    switch(this) {
	      case REGULAR: return "regular";
	      case VIP: return "vip";
	      default:       return "unspecified";
	    }
	  }
	
}
