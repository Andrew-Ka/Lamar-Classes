//**********************************
// COSC 1336 CS 1 Fundamentals
// Name: Andrew Kalathra
// Data: 11/8/2021
// test the rectangle class
//**********************************
public class testRectangle {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(4 , 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		Rectangle [][] rectArray= new Rectangle[][]{
				{new Rectangle(5,2)},
				{new Rectangle(8, 5)},
				{new Rectangle(4.2, 2.4)},
				{new Rectangle(1, 8)},
				{new Rectangle(9, 2)},
		};
		
		
		System.out.println("Rectangle:            Width:        Length:         Area:       Perimeter:");
		System.out.print("Rectangle 1 ");
		System.out.printf("%15s",rect1.getWidth());
		System.out.printf("%15s ",rect1.getLength());
		System.out.printf("%15s",rect1.getArea());
		System.out.printf("%15s\n",rect1.getPerimeter());
		System.out.print("Rectangle 2 ");
		System.out.printf("%15s",rect2.getWidth());
		System.out.printf("%15s ",rect2.getLength());
		System.out.printf("%15s",rect2.getArea());
		System.out.printf("%15s\n",rect2.getPerimeter());
		
		System.out.println("Data of rectangles in array:");
		Rectangle.arrayOfRect(rectArray);
		System.out.print("The sum of the rectangles in the array is ");
		System.out.println(Rectangle.sumOfArray(rectArray));
		
		
		System.out.println();
		System.out.println(rect1.toString());

	}
}
