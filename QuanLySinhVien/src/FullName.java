import java.util.Scanner;

public class FullName {
	private String ho;
	private String tenDem;
	private String ten;
	
	public FullName(String ho, String tenDem, String ten) {
		this.ho = ho;
		this.tenDem = tenDem;
		this.ten = ten;
	}

	public FullName() {}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTenDem() {
		return tenDem;
	}

	public void setTenDem(String tenDem) {
		this.tenDem = tenDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
	public void nhap() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap ho:");
		ho=sc.nextLine();
		System.out.println("Nhap ten dem:");
		tenDem=sc.nextLine();
		System.out.println("Nhap ten:");
		ten=sc.nextLine();
	}
	@Override
	public String toString() {
		return ho+" "+tenDem+" "+ten;
	}
	
	
	
	
}
