package model;

public class GCDModel {
	private int a;
	private int b;

	public GCDModel() {}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public int GCD(int a,int b) {
		while (a!=b) {
			if (a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
		
	}
	public int LCM(int a,int b) {
		return (a*b)/GCD(a,b);
	}
	
}
