
public class Main {
	public static void main(String[] args) {
		MayTinhCasioFX500 mt1=new MayTinhCasioFX500();
		
		System.out.println("Phep cong:"+mt1.cong(5, 8));
		System.out.println("Phep tru:"+mt1.tru(5, 8));
		System.out.println("Phep nhan:"+mt1.nhan(5, 8));
		System.out.println("Phep chia:"+mt1.chia(5, 8));
		
		MayTinhVinacal500 mt2=new MayTinhVinacal500();
		
		System.out.println("Phep cong:"+mt2.cong(5, 8));
		System.out.println("Phep tru:"+mt2.tru(5, 8));
		System.out.println("Phep nhan:"+mt2.nhan(5, 8));
		System.out.println("Phep chia:"+mt2.chia(5, 8));
		
		double arr[] =new double[] {4,9,3,7,12,0,-8};
		double arr2[]=new double[] {2,3,9,6,11,5};
		SapXepChen sxch=new SapXepChen();
		sxch.sapXepTang(arr);
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		SapXepChon sxc=new SapXepChon();
		sxc.sapXepTang(arr2);
		for (int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		
		PhanMemMayTinh pm=new PhanMemMayTinh();
		double arr3[]=new double[] {7,5,8,9};
		pm.sapXepGiam(arr3);
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");
		
	}
}
