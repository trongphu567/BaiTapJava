
public class main {
	public static void main(String[] args) {
		ConNguoi cn=new ConNguoi("Tran Minh Tuan", 2000);
		cn.an();
		cn.uong();
		SinhVien sv=new SinhVien("Nguyen Van Manh", 1998, "AT01", "UTE");
		sv.an();
		sv.uong();
		sv.lamBaiTap();
	}
}
