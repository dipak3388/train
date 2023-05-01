package Train;

import java.util.Scanner;

public class TrainDriver {
	public static void main(String[] args)
	{
		Train tn = new Train("MAHALAXMI EXPRESS",223311);
		Scanner s = new Scanner(System.in);
		boolean exit = true;
		
		while(exit)
		{
			System.out.println("ENTER \n 1. GET TICKET \n 2. CANCEL TICKET \n 3. DISPLAY PASSENGER DETAILS \n 4. DISPLAY TICKET DETAILS \n 5. EXIT");
			int choice = s.nextInt();
		{
				switch(choice)
				{
					case 1:
					{
						System.out.println("ENTER PASSENGER NAME");
						String name=s.next();
						System.out.println("ENTER PASSENGER AGE");
						int age=s.nextInt();
						System.out.println("ENTER PASSENGER GENDER");
						String gen=s.next();
						System.out.println("ENTER PASSENGER MOBILE NUMBER");
						long cnum=s.nextLong();
						
						System.out.println(tn.getTicket(new Passenger(name,age,gen,cnum)));
					}
					break;
					case 2:
					{
						tn.cancelTicket();
					}
					break;
					case 3:
					{
						tn.journeyDetails();
					}
					case 4:
					{
						
						Ticket t=new Ticket(101,201,"mumbai","25/04/23",101);
						System.out.println(t.toString());
					}
					break;
					case 5:
					{
						exit=false;
						System.out.println("THANK YOU !!");
						s.close();
					}
					break;
					default:
						System.out.println("INVALID CHOICE");
				}
		}
	}

	}}
