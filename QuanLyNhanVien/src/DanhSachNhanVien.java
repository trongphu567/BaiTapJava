import java.util.Arrays;

public class DanhSachNhanVien {
	NhanVien[] addNhanVien=new NhanVien[0];
	
	public void themNhanVien() {
		NhanVien nv=new NhanVien();
		nv.nhap();
		addNhanVien=Arrays.copyOf(addNhanVien, addNhanVien.length+1);
		addNhanVien[addNhanVien.length-1]=nv;
			
	}
	public void xuatNhanVien() {
		System.out.println("\nTHONG TIN NHAN VIEN");
		System.out.println("Ma nhan vien: "+);
	}
				
}
