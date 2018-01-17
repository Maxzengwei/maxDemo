package test.model.Unit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.model.Unit.Hero;
import main.java.model.Unit.Unit;

public class HeroTest{
	
	
	
	@Test
	public void testAttackUnit() {

		Unit axe = new Hero("axe");
		axe.setHp(100);
		axe.setAttack(4);
		
		Unit puck = new Hero("puck");
		puck.setHp(20);
		axe.attackUnit(puck);
		assertEquals("测试失败", puck.getHp(),16);  
		
		axe.attackUnit(puck);
		assertEquals("测试失败", puck.getHp(),12); 
	}
	
	@Test
	public void testaa() {

		Unit axe = new Hero("axe");
		axe.setHp(100);
		axe.setAttack(0);
		
		Unit puck = new Hero("puck");
		puck.setHp(20);
		axe.attackUnit(puck);
		assertEquals("测试失败", puck.getHp(),20);  
	}

}