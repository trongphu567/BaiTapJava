import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int[] array;
		float[] arrayFloat;
		Object[] sinhVienObjects;
		String[] cities;
		
		//cach khai bao mang 1
		String[] answers=new String[2];
		answers[0]="dung";
		answers[1]="sai";
		
		//cach khai bao mang 2
		int[] lstInt= {1,5,4,7};
		
		//cach khai bao mang 3
		Double[] lstDouble=new Double[] {1.2,3.6,4.9}; 
		
		//copy mang =>cach gan
		int[] lstInt_copy=lstInt;
		System.out.println(Arrays.toString(lstInt_copy));
		
		//copy mang =>dung ham clone
		int[] lstInt_copy1=lstInt.clone();
		lstInt_copy1[0]=0;
		System.out.println(Arrays.toString(lstInt_copy1));
		
		//copy mang =>dung ham arraycopy
		int[] lstInt_copy2=new int [lstInt.length];
		System.arraycopy(lstInt, 0, lstInt_copy2, 0, lstInt.length);
		System.out.println(Arrays.toString(lstInt_copy2));
		
		//ham sap xep
		Arrays.sort(lstInt);
		System.out.println(Arrays.toString(lstInt));
		
		//ham tim kiem (yeu cau mang da duoc sap xep)
		System.out.println(Arrays.binarySearch(lstInt, 5));
		System.out.println(Arrays.binarySearch(lstInt, 25));
		
		//cat chuoi thanh mang
		String s="Xin chao moi nguoi";
		String[] a=s.split(" ");
		System.out.println(Arrays.toString(a));
	}

}
