
public class main {
	public static void main(String[] args) {
		NgayChieu ng1=new NgayChieu(25, 3, 2015);
		NgayChieu ng2=new NgayChieu(11, 9, 2022);
		
		HangSanXuat hang1=new HangSanXuat("VFC", "Viet Nam");
		HangSanXuat hang2=new HangSanXuat("Phuong nam", "Nhat Ban");
		
		BoPhim phim1=new BoPhim("Dung lam me cau", 2022, hang1, 100000, ng1);
		BoPhim phim2=new BoPhim("Chi em", 2015, hang2, 50000, ng1);
		
		System.out.println("So sanh phim1 co gia ve re hon phim2:"+phim1.kiemTraGiaVe(phim2));
		System.out.println("Ten hang san xuat cua phim1:"+phim1.layTenHangSX());
		System.out.println("Ten hang san xuat cua phim2:"+phim2.layTenHangSX());
		System.out.println("Gia ve sau khuyen mai cua phim1:"+phim1.giaSauKhuyenMai(20));
		System.out.println("Gia ve sau khuyen mai cua phim2:"+phim2.giaSauKhuyenMai(20));
	}
}
