package model;

public class GiaiPTModel {
	private int a;
	private int b;
	private int c;
	
	public GiaiPTModel() {}

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
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c=c;
	}
	public String giaiPTBac1(int a,int b) {
		String str="";
		if (a==0) {
			if (b==0) 
				str+="PT co vo so nghiem";
			else 
				str+="PT vo nghiem";
		}
		else {
			double x=(-b*1.0)/a;
			str+="PT co nghiem la: "+x;
		}
		return str;
	}
	public String giaiPTBac2(int a,int b,int c) {
		String str="";
		if (a==0) {
			if (b==0) {
				if (c==0)
					str+="PT co vo so nghiem";
				else 
					str+="PT vo nghiem";
			}
			else 
				str+="PT co nghiem la: "+(-c*1.0/b);
		}
		else {
			double delta=b*b-4*a*c;
			if (delta>0) {
				double x1=(-b+Math.sqrt(delta))/((2*a));
				double x2=(-b-Math.sqrt(delta))/((2*a));
				str+="PT co 2 nghiem: \n"+x1+"\n"+x2;
			}
			else if (delta==0) 
				str+="PT co nghiem kep: "+((-b*1.0)/(2*a));
			else
				str+="PT vo nghiem";
				
		}
		return str;
	}
	
}
