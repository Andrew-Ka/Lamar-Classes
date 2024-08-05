// this is a test program to see if the person
//program ran correctly, mainly seeing if the 
//override constructors were made correctly
public class TestPerson {
	
	public static void main(String[] args) {
		
		Person person = new Person("Peter");
		Student student = new Student("Susan");
		Employee employee = new Employee("Eva");
		Faculty faculty = new Faculty("Frank");
		Staff staff = new Staff("Shane");
					    
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
		}

		
	}
