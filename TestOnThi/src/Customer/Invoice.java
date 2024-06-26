package Customer;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public double getAmountAfterDiscount() {
		return getAmount()-getAmount()*customer.getDiscount()*0.01;
	}
	
	
	
	
}
