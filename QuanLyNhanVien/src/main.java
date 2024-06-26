
public class main {
	public static void main(String[] args) {
		NhanVien nv=new NhanVien();
		DanhSachNhanVien NhanViens=new DanhSachNhanVien();
		NhanViens.themNhanVien();
		System.out.println("Luong cua nguoi nay la: "+nv.tinhLuong());
	}
}
