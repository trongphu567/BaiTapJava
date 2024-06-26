import java.util.Arrays;
import java.util.Scanner;

public class DSTuyen {
	Scanner sc=new Scanner(System.in);
	public TuyenXeBuyt dsTuyen[]=new TuyenXeBuyt[0];
	public void themPT() {
		dsTuyen=Arrays.copyOf(dsTuyen, dsTuyen.length+1);
		int select;
		System.out.println("Ban muon chon loai xe nao:");
		System.out.println("1.Xe buyt thanh pho");
		System.out.println("2.Xe buyt ngoai thanh");
		select=Integer.parseInt(sc.nextLine());
		if (select==1) 
			dsTuyen[dsTuyen.length-1]=new TuyenXeBuyt();
		else
			dsTuyen[dsTuyen.length-1]=new TuyenXeBuytNgoaiThanh();
		dsTuyen[dsTuyen.length-1].nhap();
		dsTuyen[dsTuyen.length-1].xuat();
			
	}
	public boolean timKiem(String ben) {
		for (TuyenXeBuyt x:dsTuyen)
			if (x.getTenBen1().contains(ben) || x.getTenBen2().contains(ben))
				return true;
		return false;
					
	}
}
