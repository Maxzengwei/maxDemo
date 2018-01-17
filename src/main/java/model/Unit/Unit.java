package model.Unit;


public class Unit{
	private long UnitID;
	private String UnitName;
	private int level;
	private String UnitDesc;
	private int hp;
	private int mp;
	private int attack;
	
	public String toString(){
		return this.UnitName+": HP"+this.hp+", MP"+this.mp+", Attack"+this.attack;
		
	}
	
	public void attackUnit(Unit u){
		u.setHp(u.getHp()-this.getAttack());
		System.out.println(u.toString());

	}
	
	public Unit(String UnitName){
		this.UnitName = UnitName;
	}
	

	public long getUnitID() {
		return UnitID;
	}
	public void setUnitID(long UnitID) {
		this.UnitID = UnitID;
	}
	public String getUnitName() {
		return UnitName;
	}
	public void setUnitName(String UnitName) {
		this.UnitName = UnitName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getUnitDesc() {
		return UnitDesc;
	}
	public void setUnitDesc(String UnitDesc) {
		this.UnitDesc = UnitDesc;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
}