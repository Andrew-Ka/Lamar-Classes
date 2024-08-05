/**
 * Objective: Make an interference class called edible
 * Algorithm: Description how to resolve the problem.
 *Input and Output: Input many things, output if they are edible
 *					and if so what can be made with them
 * Created by: Andrew Kalathra
 * Date:2/19/22
 * Version:1
 */
public class Testedible {

	public static void main(String[] args) {
		Object[] objects = {new Chicken(), new Bat(), new Lion(), new Apple(), new Orange()};
		//main class to print and call everything
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Edible) {
				System.out.println(((Edible)objects[i]).howToEat());
				System.out.println(((Edible)objects[i]).popDish());
			}
			if (objects[i] instanceof Animal) {
				System.out.println(((Animal)objects[i]).sound());
			}
			if(objects[i] instanceof Feed) {
				System.out.println(((Feed)objects[i]).howToFeed());

			}
		}
	}

}
abstract class Animal {
	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/** Return animal sound */
	public abstract String sound();
}

class Chicken extends Animal implements Edible, Feed{
	//overriding everything in the Animal class
	//and in the Feed and Edible interferences
	@Override
	public String howToEat() {
		return "Chicken: Fry it!";
	}
	@Override 
	public String sound() {
		return "Chicken: cock-a-doodle-doo";
	}
	@Override
	public String popDish() {
		return "Chicken: Chicken nuggets";
	}
	@Override
	public String howToFeed() {
		return "Chicken: Seeds";
	}
}
class Bat extends Animal{
	//overriding everything in the animal class
	@Override
	public String sound() {
		return "Bat: Want to start a pandemic?";
	}
}
class Lion extends Animal{
	//overriding everything in the animal class
	@Override
	public String sound() {
		return "Lion: Who's edible here, me or you? RROOAAAARR";
	}
}
//making a class of fruit that implements so 
//I don't have to keep telling the classes to implement
abstract class Fruit implements Edible{}

class Apple extends Fruit{
	//overriding everything in edible
	@Override
	public String howToEat(){
		return "Apple: Slice it";
	}
	@Override
	public String popDish() {
		return "Apple: Apple Pie";
	}
}
class Orange extends Fruit{
	//overriding everything in edible
	@Override
	public String howToEat() {
		return "Orange: squeeze it";
	}
	@Override
	public String popDish() {
		return "Orange: Orange juice";
	}
}