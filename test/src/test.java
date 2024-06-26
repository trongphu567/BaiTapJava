import java.util.Objects;
import java.util.Scanner;

public class test {
//	private String tenCaPhe;
//	private double khoiLuong;
//	private long donGia;
//	
//	public test(String tenCaPhe,double khoiLuong,long donGia) {
//		this.tenCaPhe=tenCaPhe;
//		this.khoiLuong=khoiLuong;
//		this.donGia=donGia;
//	}
//	public test() {}
//	public void input() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("tenCaPhe=");
//		tenCaPhe=sc.nextLine();
//		System.out.println("khoiLuong=");
//		khoiLuong=Double.parseDouble(sc.nextLine());
//		System.out.println("donGia=");
//		donGia=Long.parseLong(sc.nextLine());
//	}
//	public double tinhTongTien() {
//		return khoiLuong*donGia;
//	}
//	public boolean kiemTraKhoiLuong(double kl) {
//		return this.khoiLuong>kl;
//	}
//	public boolean kiemTraTongTien() {
//		return tinhTongTien()>500000;
//	}
//	public double giamGia(double sale) {
//		if (tinhTongTien()>500000)
//			return (sale*tinhTongTien())/100;
//		return 0;
//		
//	}
//	public double giaSauKhiGiam(double sale) {
//		return tinhTongTien()-giamGia(sale);
//	}
//	public static void main(String[] args) {
//		test t=new test();
//		t.input();
//		System.out.println("Tong tien="+t.tinhTongTien());
//		System.out.println("Kiem tra khoi luong:"+t.kiemTraKhoiLuong(2));
//		System.out.println("Kiem tra tong tien >500000:"+t.kiemTraTongTien());
//		System.out.println("So tien giam gia:"+t.giamGia(20));
//		System.out.println("Tong tien sau khi giam:"+t.giaSauKhiGiam(20));
//	}
	
	private int day;
	private int month;
	private int year;
	
	public test(int day, int month, int year) {
		if (day>=1 && day<=31) {
			this.day = day;
		}
		else {
			this.day=1;
		}
		if (month>=1 && month<=12) {
			this.month=month;
		}
		else {
			this.month=1;
		}
		if (year>=0) {
			this.year=year;
		}
		else {
			this.year = 0;
		}
		
	}
	public test() {}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day>=1 && day<=31)
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month>=1 && month<=12)
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		test other = (test) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public void setYear(int year) {
		if (year>=0)
			this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "test [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		test t1=new test(21,1,2025);
		test t2=new test(32, 18, 1111);
		test t3=new test();
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.equals(null));
	}
	
	
		
		
}