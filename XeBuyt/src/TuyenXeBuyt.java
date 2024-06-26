import java.util.Scanner;

public class TuyenXeBuyt {
	private String maTuyen;
	private String tenTuyen;
	private String tenBen1;
	private String tenBen2;
	private int cuLy;
	private String chiTiet;
	
	public TuyenXeBuyt() {}

	public TuyenXeBuyt(String maTuyen, String tenTuyen, String tenBen1, String tenBen2, int cuLy, String chiTiet) {
		this.maTuyen = maTuyen;
		this.tenTuyen = tenTuyen;
		this.tenBen1 = tenBen1;
		this.tenBen2 = tenBen2;
		this.cuLy = cuLy;
		this.chiTiet = chiTiet;
	}

	public String getMaTuyen() {
		return maTuyen;
	}

	public void setMaTuyen(String maTuyen) {
		this.maTuyen = maTuyen;
	}

	public String getTenTuyen() {
		return tenTuyen;
	}

	public void setTenTuyen(String tenTuyen) {
		this.tenTuyen = tenTuyen;
	}

	public String getTenBen1() {
		return tenBen1;
	}

	public void setTenBen1(String tenBen1) {
		this.tenBen1 = tenBen1;
	}

	public String getTenBen2() {
		return tenBen2;
	}

	public void setTenBen2(String tenBen2) {
		this.tenBen2 = tenBen2;
	}

	public int getCuLy() {
		return cuLy;
	}

	public void setCuLy(int cuLy) {
		this.cuLy = cuLy;
	}

	public String getChiTiet() {
		return chiTiet;
	}

	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma tuyen:");
		maTuyen=sc.nextLine();
		System.out.println("Nhap ten tuyen:");
		tenTuyen=sc.nextLine();
		System.out.println("Nhap ten ben 1:");
		tenBen1=sc.nextLine();
		System.out.println("Nhap ten ben 2:");
		tenBen2=sc.nextLine();
		System.out.println("Nhap cu ly:");
		cuLy=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap chi tiet tuyen:");
		chiTiet=sc.nextLine();
	}
	public void xuat() {
		System.out.println("Ma tuyen: "+getMaTuyen());
		System.out.println("Ten tuyen: "+getTenTuyen());
		System.out.println("Ben 1: "+getTenBen1());
		System.out.println("Ben 2: "+getTenBen2());
		System.out.println("Cu ly di chuyen: "+getCuLy());
		System.out.println("Chi tiet: "+getChiTiet());
		
	}
	
	
	
}
