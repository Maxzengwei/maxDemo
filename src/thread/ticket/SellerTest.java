package thread.ticket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


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