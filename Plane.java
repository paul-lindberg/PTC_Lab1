public class Plane {

	public int vipSeats = 20;
	public int regSeats = 100;
	public Airline airline;
	
	public Plane(Airline airline) {
		
		this.airline = airline;
		
	}

	@Override
	public String toString() {
		return "Plane [vipSeats=" + vipSeats + ", regSeats=" + regSeats + ", airline=" + airline + "]";
	}
	
}
