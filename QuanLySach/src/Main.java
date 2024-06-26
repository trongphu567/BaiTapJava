
public class Main {
	public static void main(String[] args) {
		Ngay ngay1=new Ngay(22, 4, 2222);
		Ngay ngay2=new Ngay(11, 1, 2221);
		
		TacGia tg1=new TacGia("phu", ngay1);
		TacGia tg2=new TacGia("rosie", ngay2);
		
		Sach s1=new Sach("Overthinking", 200000, 2020,tg1);
		Sach s2=new Sach("Huhuhuhahaha", 100000, 2001, tg2);
		Sach s3=new Sach("Hardway", 250000, 2001, tg2);
		
		s1.inTenSach();
		s2.inTenSach();
		
		System.out.println("So sanh nam XB cua s1 va s2:"+s1.kiemTraCungNamXB(s2));
		System.out.println("So sanh nam XB cua s2 va s3:"+s2.kiemTraCungNamXB(s3));
		System.out.println("Sach 1 giam 20%:"+s1.giaSauKhiGiam(20));
		System.out.println("Sach 2 giam 20%:"+s2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giam 20%:"+s3.giaSauKhiGiam(20));
	}
}
