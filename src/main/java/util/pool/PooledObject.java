package util.pool;


public class PooledObject{
	private Object o;
	private boolean inUse = false;
	
	public PooledObject(Object o){
		this.o = o;
	}
	
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	public boolean isInUse() {
		return inUse;
	}
	public void setO(Object o) {
		this.o = o;
	}
	public Object getO() {
		return o;
	}
	
}