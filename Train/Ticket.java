package Train;

public class Ticket {
	int ticketno;
	int boarding;
	String destination;
	String date;
	int seatno;
	
	public Ticket(int ticketno, int boarding, String destination, String date, int seatno) {
		this.ticketno = ticketno;
		this.boarding = boarding;
		this.destination = destination;
		this.date = date;
		this.seatno = seatno;
	}
	public int getTicketno() {
		return ticketno;
	}
	public int getBoarding() {
		return boarding;
	}
	public void setBoarding(int boarding) {
		this.boarding = boarding;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	
	public void getTicketDetails()
	{
		System.out.println(this.getTicketno());
		System.out.println(this.getBoarding());
		System.out.println(this.getDestination());
		System.out.println(this.getSeatno());
		System.out.println(this.getDate());
	}
	@Override
	public String toString() {
		return "ticketno=" + ticketno + ", \nboarding=" + boarding + ", \ndestination=" + destination + ", \ndate="
				+ date + ", \nseatno=" + seatno + "";
	}

	
}
