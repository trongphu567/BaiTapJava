package TinhLuongNhanVien;

public class Main {

	public static void main(String[] args) {
		IEmployee employee1=new PartTimeEmployee("Phu", 50000, 3);
		System.out.println("Name: "+employee1.getName());
		System.out.println("Salary per day: "+employee1.calculateSalary());
		System.out.println();
		IEmployee employee2=new FullTimeEmployee("Phu", 70000);
		System.out.println("Name: "+employee2.getName());
		System.out.println("Salary per day: "+employee2.calculateSalary());
	}

}
