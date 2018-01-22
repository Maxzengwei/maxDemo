package dota2;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import model.Unit.Hero;
import model.Unit.Unit;



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

		Unit creep = new Unit("creep");
		creep.setHp(100);
		creep.setAttack(4);
		
		Unit wolf = new Unit("wolf");
		wolf.setHp(20);
		wolf.setAttack(4);
		
		Hero axe = new Hero("axe");
		axe.setHp(100);
		axe.setAttack(4);
		axe.setLevel(2);
		
		Hero puck = new Hero("puck");
		puck.setHp(100);
		puck.setAttack(4);
		axe.setLevel(5);
		
		List<Unit> units = Arrays.asList(wolf,creep);
		

		List<Unit> heros = Arrays.asList(axe,puck);
		
		Object[] d = {units,heros};
		
		Arrays.toString(d);
		System.out.println(Arrays.toString(d));

		System.out.println(Arrays.deepToString(d));
		
		
	}
}