import java.util.Scanner;

public class NhanVien {
	private String maNV,tenNV,phongBan,chucVu;
	private double heSoLuong;
	private int thamNienCongTac;
	private int soNgayLamViec;
	
	final int luongCoBan=1490;
	
	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		if (chucVu.equalsIgnoreCase("Lanh dao") || chucVu.equalsIgnoreCase("Nhan vien"))
			this.chucVu = chucVu;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getThamNienCongTac() {
		return thamNienCongTac;
	}

	public void setThamNienCongTac(int thamNienCongTac) {
		this.thamNienCongTac = thamNienCongTac;
	}

	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public NhanVien(String maNV, String tenNV, String phongBan, String chucVu, double heSoLuong, int thamNienCongTac,
			int soNgayLamViec) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.phongBan = phongBan;
		this.chucVu = chucVu;
		this.heSoLuong = heSoLuong;
		this.thamNienCongTac = thamNienCongTac;
		this.soNgayLamViec = soNgayLamViec;
		
	}
	public double xacDinhHeSoThiDua() {
		double heSoThiDua=0;
		if (this.chucVu=="Lanh dao") 
			heSoThiDua=1;
		else {
			if (this.soNgayLamViec>22)
				heSoThiDua=1.0;
			else if (this.soNgayLamViec>20)
				heSoThiDua=0.8;
			else
				heSoThiDua=0.6;
		}
		return heSoThiDua;
	}
	public NhanVien() {}
	public int xacDinhPhuCap() {
		return this.chucVu=="Lanh dao"?2000:0;
	}
	public double tinhLuong() {
		return heSoLuong*luongCoBan*xacDinhHeSoThiDua()+1100+xacDinhPhuCap();
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma nhan vien:");
		maNV=sc.nextLine();
		System.out.println("Nhap ten nhan vien:");
		tenNV=sc.nextLine();
		System.out.println("Nhap phong ban:");
		phongBan=sc.nextLine();
		System.out.println("Nhap chuc vu:");
		chucVu=sc.nextLine();
		System.out.println("Nhap he so luong:");
		heSoLuong=Double.parseDouble(sc.nextLine());
		System.out.println("Nhap tham nien cong tac:");
		thamNienCongTac=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap so ngay lam viec trong thang:");
		soNgayLamViec=Integer.parseInt(sc.nextLine());
	}
	
	
}
