package Train;

public class Passenger {
	String pname;
	int page;
	String pgender;
	long pcno;
	
	Passenger(String pname, int page,String pgender,long pcno){
		this.pname=pname;
		this.page=page;
		this.pgender=pgender;
		this.pcno=pcno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPgender() {
		return pgender;
	}

	public long getPcno() {
		return pcno;
	}

	public void setPcno(long pcno) {
		this.pcno = pcno;
	}
	


}
