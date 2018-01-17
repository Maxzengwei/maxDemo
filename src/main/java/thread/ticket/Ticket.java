package thread.ticket;


public class Ticket{
	int  total = 30;
	
	public Ticket(int total){
		this.total = total;
	}
	
	public int getTotal(){
		return this.total;
	}
	
	public void setTotal(int total){
		this.total=total;
	}
	
	public  void sellTicket(int sellerID){
		if(total > 0)
			total--;
		System.out.println(sellerID+" "+this.getTotal());	
	}
	
}