package main.java.util.pool;

import java.util.Vector;


public class ObjectPool{
	
	private int initSize = 2;
	private int maxSize = 10;
	private int increaseSize = 1;
	private Vector<PooledObject> objects = null;
	
	public synchronized void createObjectPool(){
		if(objects != null){
			return;
		}
		objects = new Vector<PooledObject>();
		for(int i=0;i<initSize;i++){
			Object o = new Object();
			PooledObject po = new PooledObject(o);
			objects.add(po);
		}	
	}
	
	
	public synchronized Object getFreeObject(){
		if(objects == null){
			return null;
		}
		Object o = findFreeObject();
		
		if(o==null){
			addPooledObject(increaseSize);
			o = findFreeObject();
		}
		return o;
	}
	
	public Object findFreeObject(){
		if(objects == null){
			return null;
		}
		for(int i=0;i<objects.size();i++){
			PooledObject po = objects.get(i);
			if(!po.isInUse()){
				po.setInUse(true);
				return po.getO();
			}
		}
		return null;
	}
	
	public void addPooledObject(int increaseSize){
		if(objects == null){
			createObjectPool();
		}
		
		for(int i=0;i<increaseSize;i++){
			if(objects.size()<maxSize){
				Object o = new Object();
				PooledObject po = new PooledObject(o);
				objects.add(po);
			}
		}
	}
	
	public void releaseObject(Object o){
		if(objects == null){
			return;
		}
		for(int i=0;i<objects.size();i++){
			if(objects.get(i).getO()==o){
				objects.get(i).setInUse(false);
			}
		}	
	}
	public void printString(){
		if(objects == null){
			return;
		}
		System.out.println("--------");
		for(int i=0;i<objects.size();i++){
			System.out.println(i+": "+objects.get(i).isInUse());
		}
	}
	
	public static void main(String[] args){
        ObjectPool objPool = new ObjectPool();  
        objPool.createObjectPool(); 
        objPool.printString();
        Object obj = objPool.getFreeObject();   
        objPool.printString();
  //      objPool.releaseObject(obj);  
        Object obj2 = objPool.getFreeObject(); 
        objPool.printString();
        Object obj3 = objPool.getFreeObject(); 
        objPool.printString();

       // objPool.closeObjectPool(); 
	}
}

