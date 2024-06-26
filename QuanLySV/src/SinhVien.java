
public class SinhVien {
	private String mSSV,hoVaTen;
	private Ngay ngSinh;
	private double diemTB;
	private Lop lop;
	
	public SinhVien(String mSSV, String hoVaTen, Ngay ngSinh, double diemTB, Lop lop) {
		this.mSSV = mSSV;
		this.hoVaTen = hoVaTen;
		this.ngSinh = ngSinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}

	public String getmSSV() {
		return mSSV;
	}

	public void setmSSV(String mSSV) {
		this.mSSV = mSSV;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public Ngay getNgSinh() {
		return ngSinh;
	}

	public void setNgSinh(Ngay ngSinh) {
		this.ngSinh = ngSinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}
	public String kiemTraThiDat() {
		return this.diemTB >= 5.0?"dau":"rot";
	}
	public boolean kiemTraCungNgSinh(SinhVien sv) {
		return this.ngSinh.equals(sv.ngSinh);
	}
	
	
}
