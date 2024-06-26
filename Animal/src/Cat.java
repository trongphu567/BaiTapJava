
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void meow() {
		System.out.println("meow meow");
	}
	@Override
	public void eat() {
		System.out.println("Toi an ca");
	}
	@Override 
	public void makeSound() {
		System.out.println("Meo meo");
	}
	
}
