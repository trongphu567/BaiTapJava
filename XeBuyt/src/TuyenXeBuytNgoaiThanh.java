import java.util.Scanner;

public class TuyenXeBuytNgoaiThanh extends TuyenXeBuyt {
	private String tenTinh;

	public TuyenXeBuytNgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TuyenXeBuytNgoaiThanh(String maTuyen, String tenTuyen, String tenBen1, String tenBen2, int cuLy,
			String chiTiet) {
		super(maTuyen, tenTuyen, tenBen1, tenBen2, cuLy, chiTiet);
		// TODO Auto-generated constructor stub
	}

	public TuyenXeBuytNgoaiThanh(String tenTinh) {
		super();
		this.tenTinh = tenTinh;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap ten tinh:");
		tenTinh=sc.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Ten tinh den: "+getTenTinh());
	}
}
