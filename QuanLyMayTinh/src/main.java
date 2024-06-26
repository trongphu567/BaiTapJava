
public class main {
	public static void main(String[] args) {
		Ngay ngay1=new Ngay(20, 5, 2023);
		Ngay ngay2=new Ngay(14, 9, 2115);
		Ngay ngay3=new Ngay(6, 2, 2019);
		
		QuocGia quocgia1=new QuocGia("US", "Mi");
		QuocGia quocgia2=new QuocGia("KO", "Han Quoc");
		QuocGia quocgia3=new QuocGia("VN", "Viet Nam");
		
		HangSanXuat h1=new HangSanXuat("Samsung", quocgia2);
		HangSanXuat h2=new HangSanXuat("Dell", quocgia1);
		
		MayTinh mt1=new MayTinh(h1, ngay3, 15000000, 2);
		MayTinh mt2=new MayTinh(h2, ngay1, 25000000, 2);
		MayTinh mt3=new MayTinh(h1, ngay2, 10000000, 2);
		
		System.out.println("So sanh gia thap hon:");
		System.out.println("M1 va M2:"+mt1.kiemTraGiaThapHon(mt2));
		System.out.println("M2 va M3:"+mt2.kiemTraGiaThapHon(mt3));
		
		System.out.println("Ten quoc gia:");
		System.out.println("M1:"+mt1.layTenQuocGia());
		System.out.println("M2:"+mt2.layTenQuocGia());
		System.out.println("M3:"+mt3.layTenQuocGia());
	}
	
	
	
}
