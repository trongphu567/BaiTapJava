
public abstract class NhanVien {
	private String maNV,tenNV;
	private int namSinh;
	private String gioiTinh;
	private double heSoLuong;
	private int namVaoLam;
	
	final int luongCoBan=1490;
	
	public NhanVien(String maNV, String tenNV, int namSinh, String gioiTinh, double heSoLuong, int namVaoLam) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.heSoLuong = heSoLuong;
		this.namVaoLam = namVaoLam;
	}
	public NhanVien() {}
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
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public int getNamVaoLam() {
		return namVaoLam;
	}
	public void setNamVaoLam(int namVaoLam) {
		this.namVaoLam = namVaoLam;
	}
	
	
	public int phuCapThamNien() {
		int soNamLamViec=2023-this.namVaoLam;
		if (soNamLamViec>5)
			return (soNamLamViec*luongCoBan)/100;
		return 0;
	}
	 public abstract double tinhLuong();
	
}

