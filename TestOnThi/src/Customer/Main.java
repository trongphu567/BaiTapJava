package Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer(1000, "Phu", 20);
		Invoice invoice1=new Invoice(1000, customer1, 50000);
		System.out.println("Customer name: "+customer1.getName());
		System.out.println("Invoice after discount: "+invoice1.getAmountAfterDiscount());
	}

}
