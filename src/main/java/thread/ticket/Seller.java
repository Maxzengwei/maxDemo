package main.java.thread.ticket;



public class Seller implements Runnable{
	int sellerID;
	Ticket ticket;
	public Seller(int id,Ticket t){
		this.sellerID = id;
		this.ticket = t;
	}
	
	@Override
	public void run() {
		while(ticket.getTotal()>0){
			ticket.sellTicket(this.sellerID);
			try{
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}	
	}
	
	
}





