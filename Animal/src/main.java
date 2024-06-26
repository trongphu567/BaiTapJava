
public class main {
	public static void main(String[] args) {
		System.out.println("Test dog:");
		Dog d=new Dog(null);
		d.eat();
		d.makeSound();
		d.sleep();
		d.bark();
		System.out.println("---");
		System.out.println("Test babydog:");
		BaByDog bbd=new BaByDog(null);
		bbd.bark();
		bbd.weep();
		System.out.println("---");
		System.out.println("Test cat:");
		Cat cat=new Cat(null);
		cat.eat();
		cat.makeSound();
		cat.sleep();
		System.out.println("---");
		System.out.println("Test bird:");
		Bird bird=new Bird(null);
		bird.eat();
		bird.makeSound();
		bird.sleep();
	}
}
