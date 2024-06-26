
public class NhanVienKinhDoanh extends NhanVien {

	private int doanhSoBanHangToiThieu;
	private int doanhSoBanHang;
	
	
	public NhanVienKinhDoanh(String maNV, String tenNV, int namSinh, String gioiTinh, double heSoLuong, int namVaoLam,
			int doanhSoBanHangToiThieu, int doanhSoBanHang) {
		super(maNV, tenNV, namSinh, gioiTinh, heSoLuong, namVaoLam);
		this.doanhSoBanHangToiThieu = doanhSoBanHangToiThieu;
		this.doanhSoBanHang = doanhSoBanHang;
	}

	public NhanVienKinhDoanh() {}
	
	
	public int getDoanhSoBanHangToiThieu() {
		return doanhSoBanHangToiThieu;
	}

	public void setDoanhSoBanHangToiThieu(int doanhSoBanHangToiThieu) {
		this.doanhSoBanHangToiThieu = doanhSoBanHangToiThieu;
	}

	public int getDoanhSoBanHang() {
		return doanhSoBanHang;
	}

	public void setDoanhSoBanHang(int doanhSoBanHang) {
		this.doanhSoBanHang = doanhSoBanHang;
	}
	
	public char danhGiaBanHang() {
		char xepLoai;
		if (doanhSoBanHang==doanhSoBanHangToiThieu)
			xepLoai='B';
		else if (doanhSoBanHang!=doanhSoBanHangToiThieu)
			xepLoai='C';
		else if (doanhSoBanHang<0.5*doanhSoBanHangToiThieu)
			xepLoai='D';
		else 
			xepLoai='A';
		return xepLoai;
	}
	@Override
	public double tinhLuong() {
		long doanhSoVuotMuc=doanhSoBanHang-doanhSoBanHangToiThieu;
		long doanhThu=doanhSoVuotMuc*500;
		double hoaHong=doanhThu*0.15;
		return this.getHeSoLuong()*luongCoBan+hoaHong;
			
	}
	
}
