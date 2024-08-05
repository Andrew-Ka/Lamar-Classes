

public class Circle {
	// data field
	private double radius;
	private static int numberOfObject=0; // record the number of circle objects created in the test program
	
	// default constructor
	Circle(){
		radius = 0.0; 
		numberOfObject++;
	}
	// constructor
	Circle(double newRadius){
		// check validation
		if (newRadius>0){
			radius = newRadius;
			numberOfObject++;
		
		}
		else
			System.out.println("radius must be greater than 0");
	}

	// method
	public double getArea(){
		return radius*radius*Math.PI;
	}
	// method 2
	public double getCircumference(){
		return 2*Math.PI*radius;
	}
	// accessor method for private data field
	public double getRadius(){
		return radius;
	}
	//mutator method for private data field
	public void setRadius (double newRadius){
		// check validation
		if (newRadius>0)
			radius = newRadius;
		else
			System.out.println("radius must be greater than 0");
		
	}
	
	
	public static int getNumberOfObject(){
		return numberOfObject;
	}  
	
}
