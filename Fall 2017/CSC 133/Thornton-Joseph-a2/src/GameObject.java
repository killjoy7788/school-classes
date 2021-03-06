package com.mycompany.a2;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.geom.*;
public abstract class GameObject {
	private static int width = 1024;
	private static int height = 768;
	public static final int speedconstant=1;
	private int size,color;
	private Location L;
	private Random rn = new Random();
	
	// constructs object of this type
	public GameObject() {
		setlocation(new Location(rn.nextInt(width), rn.nextInt(height)));
	}
	public GameObject(int width,int height) {
		this.width=width;
		this.height=height;
		setlocation(new Location(rn.nextInt(width), rn.nextInt(height)));
	}
	public int getheight() {
		return height;
	}
	public int getwidth() {
		return width;
	}
	public void setsize(int size) {
		this.size=size;
	}
	public int getsize() {
		return size;
	}
	
	public Location getlocation() {
		return L;
	}
	// set location of this object
	public void setlocation(Location l) {
			L=l;
	}
	// returns this objects color
	public int getcolor() {
		return color;
	}
	// sets this objects color
	public void setcolor(int color) {
		this.color=color;
	}
	
	public String toString() {
	 return "Location: " + this.getlocation().toString() +" Color:"+ "["+ ColorUtil.red(color)+","+ColorUtil.green(color)+
			 ","+ ColorUtil.blue(color)+"]";
			 }
}
