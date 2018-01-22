package model.Unit;


public class Hero extends Unit{

	private int level;
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Hero(String name){
		super(name);
	}
	
	public String toString(){
		return super.toString()+"level: "+this.level;
		
	}
	
	
	
}