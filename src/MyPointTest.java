//**********************************
// COSC 1336 CS 1 Fundamentals
// Name: Andrew Kalathra
// Data: 11/27/2021
// test the MyPoint class
//**********************************

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(5, 7);
		MyPoint point2 = new MyPoint(2, 2.2);
		MyPoint point3 = new MyPoint(0, 22);
		
		System.out.println("Distance between (5,7) and (2,2.2) is " + point1.distance(point2));
		System.out.println("Distance between (5,7) and (0,22) is " + point1.distance(point3));
		System.out.println("Distance between (2,2.2) and (0,22) is " + point3.distance(point2));
	}

}
