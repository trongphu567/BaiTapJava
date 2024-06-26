import java.util.Scanner;
public class Student {
	private String mssv;
	private Address address;
	private FullName fullname;
	
	public Student(String mssv, Address address, FullName fullname) {
		this.mssv = mssv;
		this.address = address;
		this.fullname = fullname; 
	}
	

	public Student() {
		address=new Address();
		fullname=new FullName();
	}
	


	public String getMssv() {
		return mssv;
	}


	public void setMssv(String mssv) {
		this.mssv = mssv;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public FullName getFullname() {
		return fullname;
	}

 
	public void setFullname(FullName fullname) {
		this.fullname = fullname;
	}
	public void nhap() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap mssv:");
		mssv=sc.nextLine();
		fullname.nhap();
		address.nhap();
	}
	public void printStudent( ) {
		System.out.println("MSSV: "+getMssv());
		System.out.println("Ho ten: "+fullname.toString());
		System.out.println("Dia chi: "+address.toString());
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address();
		FullName fn=new FullName();
		Student student=new Student();
		student.nhap();
		student.printStudent();

	}

}
