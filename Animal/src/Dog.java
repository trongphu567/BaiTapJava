

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public void eat() {
		System.out.println("Toi an xuong!");
	}
	public void bark() {
		System.out.println("geow geow");
	}
	@Override
	public void makeSound() {
		System.out.println("Gau gau");
	}
	
	
}
