public class Flight {

	public int number;
	public String originAirport;
	public String destinationAirport;
	public String date;
	public String departureTime;
	public Plane plane;
	
	public Flight(Plane plane, int number, String originAirport, String destinationAirport, String date, String departureTime) {
		
		this.plane = plane;
		this.number = number;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.date = date;
		this.departureTime = departureTime;
		
	}

	@Override
	public String toString() {
		return "Flight [number=" + number + ", originAirport=" + originAirport + ", destinationAirport="
				+ destinationAirport + ", date=" + date + ", departureTime=" + departureTime + ", plane=" + plane + "]";
	}
	
}
