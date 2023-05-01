package Train;

public class Train 
{
	public String tname = "MAHALAKSHMI EXPRESS";
	public int tno = 3874;
	
	Passenger p;
//	Ticket t;
	
//	public void ticketDetails(Ticket t)
//	{
//		if(this.t==null)
//		{
//			this.t=t;
//			System.out.println("PASSSENGER DETAILS");
//		}
//		else {
//			 t.toString();
//		}
//	}
	
	public Train(String tname,int tno)
	{
		this.tno = tno;
		this.tname = tname;
	}
	
	public String getTicket(Passenger p)
	{
		if(this.p==null)
		{
			this.p=p;
			return "TICKET BOOKED SUCCESSFUL";
		}
		else
		{
//			System.out.println("");
			return "NO SEAT AVAILABLE";
		}			
	}
	public void cancelTicket()
	{
		if(this.p==null)
		{
			System.out.println("NO DATA FOUND");
		}
		else
		{
			this.p=null;
			System.out.println("TICKET CANCELLED SUCCESSFULL...");
		}
	}
	public void journeyDetails()
	{
		if(this.p==null)
		{
			System.out.println("NO PASSENGER FOUND...");
		}
		else
		{
				System.out.println("THE TRAIN NAME IS : "+tname);
				System.out.println("THE TRAIN NUMBER IS : "+tno);
				System.out.println(p.getPname());
				System.out.println(p.getPcno());
				System.out.println(p.getPgender());
				System.out.println(p.getPage());
		}
	}
}
