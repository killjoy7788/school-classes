package com.myapp.A1prj;

import java.util.Random;
import com.codename1.charts.util.ColorUtil;
public class SpaceShip extends rescuers{
	// set variables
	//door state variables
	public static final boolean Closed = false;
	public static final boolean Open = true;
	private static SpaceShip SS;
	boolean doorstate;
	// implements sigleton design pattern.
	private SpaceShip(int width,int height) {
		super(width,height);
		super.setsize(100);
		super.setcolor(ColorUtil.GREEN);
		//set door state
		doorstate=Closed;
	}
	public static SpaceShip getspaceship() {
		if(SS==null) {
			SS=new SpaceShip(1024,768);
		}
		return SS;
	}
	public static SpaceShip getspaceship(int width,int height)
	{
		if(SS==null) {
			SS= new SpaceShip(width,height);
		}
		return SS;
	}
	
	// this objects size can change according to game
	public void setsize(int size) {
		if(size>super.getheight()) {
			//do nothing
		}
		else if(size<50) {
			//do nothing
		}
		else {
			super.setsize(size);
		}
	}
	
	// this objects color cannot change
	public void setcolor(int color) {
		
	}
	
	//controls for opening and closing the space ship door
	public void opendoor() {
		doorstate=Open;
		closedoor();
		
	}
	
	public void closedoor() {
		doorstate=Closed;
		
	}
	// expand space ship door
	public void expand() {
		setsize(super.getsize()+50);
	}
	// expand space ship door
	public void contract() {
		setsize(super.getsize()-50);
	}
	public String toString() {
		String parent=super.toString();
		String me = "SpaceShip: " + parent + " Size: " + super.getsize();
		return me;
		
	}
	public boolean contains(double x,double y) {
		if(x>=(super.getlocation().getx()-(super.getsize()/2))&& x<=(super.getlocation().getx()+(super.getsize()/2))
				&& y>=(super.getlocation().gety()-(super.getsize()/2)) && y<=(super.getlocation().gety()+(super.getsize()/2))) {
			return true;
		}else
			return false;
	}
}
