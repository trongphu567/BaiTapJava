
public class main {
	public static void main(String[] args) {
		Ngay ngay1=new Ngay(15, 3, 2000);
		Ngay ngay2=new Ngay(26, 5, 2001);
		Ngay ngay3=new Ngay(19, 7, 2002);
		
		Lop lop1=new Lop("CT01", "CNTT");
		Lop lop2=new Lop("TC02", "Tai chinh-Ke toan");
		
		SinhVien sv1=new SinhVien("sv01", "Tran Minh Hung", ngay1, 8.5, lop1);
		SinhVien sv2=new SinhVien("sv02", "Nguyen Kim Ngan", ngay2, 8.2, lop2);
		SinhVien sv3=new SinhVien("sv03", "Luong Minh Trang", ngay3, 4.5, lop2);
		
		System.out.println("Ten khoa cua sv1:"+sv1.layTenKhoa());
		System.out.println("Ten khoa cua sv2:"+sv2.layTenKhoa());
		
		System.out.println("SV1 co ket qua thi: "+sv1.kiemTraThiDat());
		System.out.println("SV2 co ket qua thi: "+sv2.kiemTraThiDat());
		System.out.println("SV3 co ket qua thi: "+sv3.kiemTraThiDat());
		
		System.out.println("Kiem tra cung ngay sinh:");
		System.out.println("sv1 va sv2:"+sv1.kiemTraCungNgSinh(sv2));
		System.out.println("sv2 va sv3:"+sv2.kiemTraCungNgSinh(sv3));
	}
}
