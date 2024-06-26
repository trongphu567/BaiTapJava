import java.util.Arrays;
import java.util.Scanner;

public class Baitap {
	public static void nhap(int a[],int n) {
		Scanner scanner=new Scanner(System.in);
		for (int i=0;i<n;i++)
		{
			System.out.println("Nhap phan tu:");
			a[i]=scanner.nextInt();
		}
	}
	public static int[] addElement(int a[],int n,int x) {
		int newarr[]=Arrays.copyOf(a, n+1);
		newarr[n]=x;
		return newarr;
		
			
	}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Nhap so a=");
//		int a=sc.nextInt();
//		System.out.println("Nhap so b=");
//		int b=sc.nextInt();
//		System.out.println("Nhap so c=");
//		int c=sc.nextInt();
//		try {
//			double div=c/(a-b);
//			System.out.println("Phep chia:"+div);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		// declare and initialize an array of size 5
//		int[] arr = { 1, 2, 3, 4, 5 };
//
//		// the index where we want to insert the new element
//		int k = 2;
//
//		// create a new array with increased size
//		int[] newArr = new int[arr.length + 1];
//
//		// copy elements from old array to new array up to index k
//		for (int i = 0; i < k; i++) {
//		  newArr[i] = arr[i];
//		}
//
//		// add new element at index k of the new array
//		newArr[k] = 6;
//
//		// copy remaining elements from old array to new array from index k+1
//		for (int i = k + 1; i < newArr.length; i++) {
//		  newArr[i] = arr[i - 1];
//		}
//
//		// update reference to point to the new array
//		arr = newArr;
//
//		// print elements of the updated array
//		for (int i = 0; i < arr.length; i++) {
//		  System.out.print(arr[i] + " ");
//		}

		try {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			nhap(arr,n);
			
			arr=addElement(arr, n, 14);
			for (int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
