//**********************************
// COSC 1336 CS 1 Lab
// Name: Andrew Kalathra
// Data: 11/28/2021
// describe a rectangle
//**********************************
public class Rectangle {
	private double width = 0.0;
	private double length = 0.0;
	private static int numberOfObjects = 0;
	
	//default
	Rectangle(){
		width = 0.0;
		length = 0.0;
		numberOfObjects++;
	}
	Rectangle(double newWidth, double newLength){
		if((newWidth > 0) && (newLength > 0)){ 
			width = newWidth;
			length = newLength;
			numberOfObjects++;
		}
		else {
			System.out.println("Length and width must be positive.");
		}
	}
	
	public double getArea() {
		double area = Double.parseDouble(String.format("%.3f",(double) length*width));
		return area;
	}
	
	public double getPerimeter() {
		return (2*length) + (2*width);
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public int getNumberOfObjects() {
		return numberOfObjects;
	}
	public void setWidth(double newWidth){
		if(newWidth > 0) {
			width=newWidth;
		}else {
			System.out.println("Width must be greater than 0");
		}
		
	}
	public void setLength(double newLength){
		if(newLength > 0) {
			length=newLength;
		}else {
			System.out.println("Length must be greater than 0.");
		}
		
	}
	public String toString() {
		String a = "The number of rectangles is: " + this.getNumberOfObjects();
		return a;
	}
	public static void arrayOfRect(Rectangle [][] array) {
		for( int m=0; m< array.length; m++) {
			for(int j =0; j < 1; j++) {
				System.out.printf("%27s",array[m][j].getWidth());
				System.out.printf("%15s ",array[m][j].getLength());
				System.out.printf("%15s",array[m][j].getArea());
				System.out.printf("%15s\n",array[m][j].getPerimeter());
				
				
			}
		
		}
	}
	
	public static double sumOfArray(Rectangle [][] array) {
		double sum = 0;
		for( int m=0; m< array.length; m++) {
			for(int j =0; j < 1; j++) {
				sum += array[m][j].getArea();
			}
		}
		return sum;
	}
	
}

