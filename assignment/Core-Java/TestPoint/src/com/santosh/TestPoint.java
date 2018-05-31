package com.santosh;

class Point{
	private int x;
	private int y;
	
	public Point() {
		x=1;
		y=1;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}


	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void printCordinate(){
		System.out.println("X = "+x+", Y = "+y);
	}
	
	
}
public class TestPoint {

	public static void main(String[] args) {
		
		Point p1=new Point();
		p1.printCordinate();
		
		Point p2=new Point(10, 20);
		p2.printCordinate();
		
		Point p3=new Point(p2);
		p3.printCordinate();
		
		Point p4=p2;
		p4.printCordinate();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());

	}

}
