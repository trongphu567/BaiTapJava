package Abstract_Person;

public class Main {

	public static void main(String[] args) {
		Person person1=new Employee("Phu", "LA", 3000);
		Person person2=new Customer("Linh", "TPHCM", 2000);
		person1.display();
		person2.display();
				

	}

}
