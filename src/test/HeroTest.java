package test;

import main.java.model.Unit.Hero;
import main.java.model.Unit.Unit;

public class HeroTest{
	public static void main(String[] args){
		Unit axe = new Hero("axe");
		axe.setHp(100);
		axe.setAttack(4);
		
		Unit puck = new Hero("puck");
		puck.setHp(20);
		
		System.out.println(puck.toString());

		
		axe.attackUnit(puck);
		
		System.out.println(puck.toString());
		
	}
}