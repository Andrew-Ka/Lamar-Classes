//**********************************
// COSC 1336 CS 1 Fundamentals
// Name: Andrew Kalathra
// Data: 11/27/2021
// describe a point
//**********************************

public class MyPoint {

	private double x;
	private double y;

	MyPoint(){
		x = 0;
		y = 0;
	}

	MyPoint(double xVal, double yVal){
		x = xVal;
		y = yVal; 
	}
	
	public double getX(){
		return x;
	}
	public double getY() {
		return y;
	}
	
	public void setX(double newX) {
		x = newX;
	}
	public void setY(double newY) {
		y = newY;
	}
	
	public double distance(MyPoint a) {
		return distance(a.x, a.y);
	}
	
	public double distance(double x2, double y2) {
		double distance;
		double a = Math.pow(x2-x, 2);
		double b = Math.pow(y2-y, 2);
		distance = Math.pow(a + b, .5);
		return distance;
	}

}
