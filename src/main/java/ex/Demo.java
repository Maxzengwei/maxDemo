package ex;

import java.util.HashMap;

public class Demo {
	
	public static int a ;
	
	public int b;
	
	public static HashMap map1 = new HashMap();

	public  HashMap map2 = new HashMap();

	public static void doA(){
		int c = 0;
		
		if (a==0) 
			System.out.println("a doA ->T");
		else 
			System.out.println("a doA ->F");
		
//		if (b==0) 
//			System.out.println("b doA ->T");
//		else 
//			System.out.println("b doA ->F");
		
		if (c==0) 
			System.out.println("c doA ->T");
		else 
			System.out.println("c doA ->F");
		
		if(map1 == null)
			System.out.println("map1 doA ->null");
		else
			System.out.println("map1 doA ->not null");

	}

	
	public void doB(){
		
		
		if (a==0) 
			System.out.println("a dB ->T");
		else 
			System.out.println("a dB ->F");
		
		if (b==0) 
			System.out.println("b doA ->T");
		else 
			System.out.println("b doA ->F");
		
		if(map1 == null)
			System.out.println("map1 doB ->null");
		else
			System.out.println("map1 doB ->not null");
		

		if(map2 == null)
			System.out.println("map2 doB ->null");
		else
			System.out.println("map2 doB ->not null");
		
	}
    
    public static void main(String args[]){
    	doA();
    	new Demo().doB();
    }

    
    
    
}