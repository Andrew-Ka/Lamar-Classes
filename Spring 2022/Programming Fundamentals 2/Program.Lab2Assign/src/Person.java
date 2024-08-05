// Objective: To use inheritance and polymorphism to give characteristics to different types of people
//  Algorithm: Set different variables for different objects
// Input and Output: No input, output the test people
//  Created by: Andrew Kalathra
//  Date: 1/30/2022
// Version: 1

//this class makes the super class person and sets the basic instance variables
public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;
	
	Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Person: " + name;
	}
}

//this subclass of person creates the instance variable class status, 
//telling what classification the student is
class Student extends Person{
	protected String classStatus;
	
	Student(String name){
		super(name);
	}
	@Override
	public String toString() {
		return "Student: " + getName();
	}
}

//this subclass of person creates the instance variables of
//their office, their salary, and when they were hired
class Employee extends Person{
	protected String office;
	protected int salary;
	protected java.util.Calendar dateHired;
	
	Employee(String name){
		super(name);
	}
	
	@Override
	public String toString() {
		return "Employee: " + getName();
	}
}

//this subclass of employee creates the instance variables 
//that describe a faculty member, such as lecture, ap, professor, 
//office hours, and ranking
class Faculty extends Employee{
	public static int LECTURER = 1;
	public static int ASSISTANT_PROFESSOR = 2;
	public static int ASSOCIATE_PROFESSOR = 3;
    public static int PROFESSOR = 4;

    protected String officeHours;
    protected int rank;

    Faculty(String name) {
      super(name);
    }
    
    @Override
    public String toString() {
      return "Faculty: " + name;
    }
  }

//this subclass of employee creates the instance variables
//for staff members, mainly being their title
  class Staff extends Employee {
    protected String title;

    Staff(String name) {
      super(name);
    }
    
    @Override
    public String toString() {
      return "Staff: " + getName();
    }
  }