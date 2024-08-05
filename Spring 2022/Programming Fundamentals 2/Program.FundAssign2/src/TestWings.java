
public class TestWings {

	public static void main(String[] args) {
		System.out.println("I didn't want to make a for look with this stuff so I just wrote the code");
		
	}

}

abstract class Fly implements Wings{
	public boolean hasWings() {
		return true;
	}
	public abstract String wingColor();
}
class pigeon extends Fly{
	public String wingColor() {
		return "Usually black, varies between dark color";
	}
}
class peacock extends Fly{
	public String wingColor() {
		return"Bright colors, i think";
	}
}
class buffalo implements Wings{
	public boolean hasWings() {
		return false;
	}
}