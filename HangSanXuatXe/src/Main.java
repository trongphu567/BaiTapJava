
public class Main {
	public static void main(String[] args) {
		HangSanXuat h1=new HangSanXuat("Toyota", "Viet Nam");
		HangSanXuat h2=new HangSanXuat("Mercedes","Duc");
		HangSanXuat h3=new HangSanXuat("Mitsubishi", "Nhat Ban");
		
		MayBay p1=new MayBay(h1, "Xang");
		XeOto p2=new XeOto(h3, "Xang");
		XeDap p3=new XeDap(h3);
		
		System.out.println("Lay hang san xuat");
		System.out.println("p1:"+p1.layTenHangSanXuat());
		p1.batDau();
		p1.catCanh();
		p1.tangToc();
		p1.haCanh();
		p1.dungLai();
		System.out.println("Van toc cua p1="+p1.layVanToc());
		
		System.out.println("Lay hang san xuat");
		System.out.println("p2:"+p2.layTenHangSanXuat());
		p2.batDau();
		p2.tangToc();
		p2.dungLai();
		System.out.println("Van toc cua p2="+p2.layVanToc());
		
		System.out.println("Lay hang san xuat");
		System.out.println("p3:"+p3.layTenHangSanXuat());
		p3.batDau();
		p3.tangToc();
		p3.dungLai();
		System.out.println("Van toc cua p3="+p3.layVanToc());
			
			
	
		}
}
