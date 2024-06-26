
public class main {
	public static void main(String[] args) {
		MyMath myMath=new MyMath();
		System.out.println(myMath.timMin(5, 9));
		System.out.println(myMath.timMin(4.2, 3.7));
		System.out.println(myMath.tinhTong(8.2, 7.70));
		double[] arr=new double[] {2,3,4,5};
		System.out.println(myMath.tinhTong(arr));
	}
}
