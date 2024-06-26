import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi=5000000;
		Scanner sc=new Scanner(System.in);
		Locale lc=new Locale("vn","VN");
		NumberFormat numf=NumberFormat.getCurrencyInstance(lc);
		int luaChon=1;
		do {
			System.out.println("-------------- MOI BAN LUA CHON --------------");
			System.out.println("Chon (1) de tiep tuc choi");
			System.out.println("Chon (0) de thoat");
			luaChon=sc.nextInt();
			if (luaChon==1) {
				System.out.println("*** BAT DAU CHOI: ");
				//dat cuoc
				System.out.println("****** Tai khoan cua ban: "+numf.format(taiKhoanNguoiChoi)+", ban muon cuoc bao nhieu?");
				double datCuoc=0;
				do {
					System.out.println("****** Dat cuoc (0<so tien cuoc<="+numf.format(taiKhoanNguoiChoi)+"):");
					datCuoc=sc.nextDouble();
					
				} while (datCuoc<=0 || datCuoc>taiKhoanNguoiChoi);
				
				//lua chon tai xiu
				int luaChonTaiXiu=0;
				do {
					System.out.println("****** Chon 1(Tai) hoac 2(Xiu)");
					luaChonTaiXiu=sc.nextInt();
				} while (luaChonTaiXiu!=1 && luaChonTaiXiu!=2);
				
				//tung xuc xac
				Random xx1=new Random();
				Random xx2=new Random();
				Random xx3=new Random();
				
				int gt1=xx1.nextInt(5)+1;
				int gt2=xx2.nextInt(5)+1;
				int gt3=xx3.nextInt(5)+1;
				
				//Tinh toan ket qua
				int tong=gt1+gt2+gt3;
				System.out.println("****** Ket qua: "+gt1+" - "+gt2+" - "+gt3);
				if (tong==3 || tong ==18) {
					System.out.println("****** Tong la: "+tong+" =>nha cai an het, ban da thua!");
					taiKhoanNguoiChoi-=datCuoc;
					System.out.println("****** Tai khoan con lai: "+numf.format(taiKhoanNguoiChoi));
					
				}
				else if (tong>=4 && tong<=10) {
					System.out.println("****** Tong la: "+tong+" =>Xiu");
					if (luaChonTaiXiu==2) {
						System.out.println("****** Ban da thang cuoc");
						taiKhoanNguoiChoi+=datCuoc;
						System.out.println("****** Tai khoan con lai: "+numf.format(taiKhoanNguoiChoi));
					}
					else {
						System.out.println("****** Ban da thua cuoc");
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("****** Tai khoan con lai: "+numf.format(taiKhoanNguoiChoi));
					}
				}
				else {
					System.out.println("****** Tong la: "+tong+" =>Tai");
					if (luaChonTaiXiu==1) {
						System.out.println("****** Ban da thang cuoc");
						taiKhoanNguoiChoi+=datCuoc;
						System.out.println("****** Tai khoan con lai: "+numf.format(taiKhoanNguoiChoi));
					}
					else {
						System.out.println("****** Ban da thua cuoc");
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("****** Tai khoan con lai: "+numf.format(taiKhoanNguoiChoi));
					}
				}
		}
		}
		while(luaChon==1);
	
	}
}
	
