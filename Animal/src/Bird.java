
public class Bird extends Animal {

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("I'm flying");
	}
	@Override
	public void eat() {
		System.out.println("Toi an sau");
	}
	@Override
	public void makeSound() {
		System.out.println("Liu lo");
	}
	
}
