package test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import main.java.thread.ticket.Seller;
import main.java.thread.ticket.Ticket;



public class SellerTest{
	
	public static void main(String[] args){
		
		
		Ticket t= new Ticket(100);
		ExecutorService es = Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++){
			
			Seller s = new Seller(i,t);
			es.execute(new Thread(s));
		}
		
	
	}
}