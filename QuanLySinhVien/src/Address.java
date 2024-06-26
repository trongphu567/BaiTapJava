import java.util.Scanner;

public class Address {
	private String soNha;
	private String duong;
	private String quan;
	private String thanhPho;
	
	public Address(String soNha, String duong, String quan, String thanhPho) {
		this.soNha = soNha;
		this.duong = duong;
		this.quan = quan;
		this.thanhPho = thanhPho;
	}
	public Address() {}
	
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public String getDuong() {
		return duong;
	}
	public void setDuong(String duong) {
		this.duong = duong;
	}
	public String getQuan() {
		return quan;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public String getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so nha:");
		soNha=sc.nextLine();
		System.out.println("Nhap duong:");
		duong=sc.nextLine();
		System.out.println("Nhap quan:");
		quan=sc.nextLine();
		System.out.println("Nhap thanh pho:");
		thanhPho=sc.nextLine();
	}
	@Override 
	public String toString() {
		return soNha+","+duong+","+quan+","+thanhPho;
	}
	
	
	
}
