
public class NhanVienSanXuat extends NhanVien{
	private double heSoNangNhoc=0.1;
	private int soNgayNghi;
	
	public NhanVienSanXuat(String maNV, String tenNV, int namSinh, String gioiTinh, double heSoLuong, int namVaoLam,
			double heSoNangNhoc, int soNgayNghi) {
		super(maNV, tenNV, namSinh, gioiTinh, heSoLuong, namVaoLam);
		this.heSoNangNhoc = heSoNangNhoc;
		this.soNgayNghi=soNgayNghi;
	}

	public double getHeSoNangNhoc() {
		return heSoNangNhoc;
	}

	public void setHeSoNangNhoc(double heSoNangNhoc) {
		this.heSoNangNhoc = heSoNangNhoc;
	}

	public int getSoNgayNghi() {
		return soNgayNghi;
	}

	public void setSoNgayNghi(int soNgayNghi) {
		this.soNgayNghi = soNgayNghi;
	}

	public NhanVienSanXuat() {}
	
	public char tinhSoNgayNghi() {
		char xepLoai;
		if (this.soNgayNghi<=1)
			xepLoai='A';
		else if (this.soNgayNghi<=3)
			xepLoai='B';
		else if (this.soNgayNghi<=5)
			xepLoai='C';
		else 
			xepLoai='D';
		return xepLoai;
	}
	@Override
	public double tinhLuong() {
		return this.getHeSoLuong()*luongCoBan*(1+this.getHeSoNangNhoc());
	}



	
	
}
