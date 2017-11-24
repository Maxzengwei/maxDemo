package test;

import org.apache.log4j.Logger;



public class Ex{
	
	Logger logger  = Logger.getLogger(Ex.class);
	public Ex(){

	}
	
	public int testTryCatch() throws Exception{
		logger.info(1);
		int result=0;
		try{
			String s =null;
			String r= s.substring(2);
			logger.info(2);
		}finally{
			logger.info(3);
		}
		logger.info(4);
		result = 4;
		return result;
	}
	
	public String cutString(String str,int maxLength){
		int length = str.length();
		if(length>maxLength){
			return  str.substring(0,maxLength/2)+str.substring(length-(maxLength+1)/2);
		}
		return str;
	}
	
	public static void main (String[] args){
		try{
			System.out.println(new Ex().testTryCatch());
		}catch(Exception e){
	//		e.printStackTrace();
			System.out.println("="+e.getCause()+" @@@ "+e.getStackTrace()[0]+"=");
		}
		
	}
}