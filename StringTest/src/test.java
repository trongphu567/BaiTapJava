import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi s:");
		s=sc.nextLine();	
		System.out.println("-----");
		//Ham length
		System.out.println("Do dai chuoi:"+s.length());
		
		int len=s.length();
		
		//ham charAt(idx) =>lay ra 1 ki tu tai vi tri idx
		for (int i=0;i<len;i++)
			System.out.println("Vi tri "+i+" la :"+s.charAt(i));
		
		//ham getChars (viTribatdau,viTriketthuc,mang luu du lieu,vi tri bat dau luu cua mang)
		char[] arrStr=new char[10];
		s.getChars(1, 6, arrStr, 0);
		for (int i=0;i<arrStr.length;i++) {
			System.out.println("arrStr["+i+"]="+arrStr[i]);
		}
		
		//ham getBytes =>co 3 cach, lay ra gia tri ascii cua cac ky tu thanh 1 mang
		byte[] arrBytes=s.getBytes();
		for (byte b:arrBytes) 
			System.out.println(b);
	
		//ham equals =>so sanh 2 chuoi giong nhau ,co phan biet hoa thuong
		String s1="viet nam";
		String s2="Viet nam";
		String s3="viet NAm";
		System.out.println("So sanh s1 va s2:"+s1.equals(s2));
		System.out.println("So sanh s2 va s3:"+s2.equals(s3));
		
		//ham equalsIgnoreCase =>so sanh 2 chuoi k phan biet hoa thuong
		System.out.println("So sanh s1 va s2:"+s1.equalsIgnoreCase(s2));
		System.out.println("So sanh s2 va s3:"+s2.equalsIgnoreCase(s3));
		
		//ham compareTo =>so sanh "> < ="
		//neu so am =>s1 < s2
		//neu so duong => s1 > s2
		//neu =0 =>s1 = s2
		String sv1="Nguyen Van A";
		String sv2="Nguyen Van B";
		String sv3="Nguyen Van";
		System.out.println("sv1 compareTo sv2:"+sv1.compareTo(sv2));
		System.out.println("sv2 compareTo sv3:"+sv2.compareTo(sv3));
		
		//ham compareToIgnoreCase =>tuong tu compareTo,k phan biet hoa thuong
		
		//ham regionMatches =>so sanh 1 doan (vd so sanh sdt)
		String r1="034 978 2654";
		String r2="074 456 3988";
		boolean check=r1.regionMatches(0, r2, 0, 4);
		System.out.println(check);
		
		//ham startWith =>kt chuoi bat dau bang ...
		String sdt="034 582 1717";
		System.out.println(sdt.startsWith("034"));
		System.out.println(sdt.startsWith("091"));
		
		//ham endWith =>kt chuoi ket thuc bang ...
		String tenFile="Paris.IMG";
		String tenFile2="Python.PDF";
		
		if (tenFile.endsWith(".IMG"))
			System.out.println("File nay la file hinh anh!");
		else if (tenFile.endsWith(".PDF"))
			System.out.println("File nay la file pdf!");
		
		if (tenFile2.endsWith(".IMG"))
			System.out.println("File nay la file hinh anh!");
		else if (tenFile2.endsWith(".PDF"))
			System.out.println("File nay la file pdf!");
		
		//ham indexOf =>xuat ra vi tri dau tien cua chuoi s2 trong s1 
		//neu >0 =>nam trong chuoi
		//neu = -1 =>k nam trong chuoi
		
		String str1="Hello, I'm Phu";
		String str2="Hi";
		System.out.println("Vi tri cua str2 trong str1:"+str1.indexOf(str2));
		
		//ham lastIndexof =>tim kiem tu phai sang trai
		System.out.println("vi tri cua str2 trong str1:"+str1.lastIndexOf(str2));
		
		//ham concat =>noi chuoi
		String st1="viet";
		String st2=" nam";
		System.out.println(st1.concat(st2));
		
		//ham replace  =>thay the
		String st3="TPHCM";
		System.out.println(st3.replace("HC", "N"));
		
		//ham toLowerCase =>chuyen ve viet thuong
		//ham toUpperCase =>chuyen ve viet hoa
		
		//trim =>xoa space thua o dau chuoi
		String st4=" Hello World!!! ";
		System.out.println(st4);
		
		//ham subString =>cat chuoi con
		System.out.println(st4.substring(5));
	}	
	
	
}
