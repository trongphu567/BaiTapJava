
public class HinhTron extends Hinh {
	private double r;
	public HinhTron(ToaDo toaDo,double r) {
		super(toaDo);
		this.r=r;
		// TODO Auto-generated constructor stub
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public double tinhDienTich() {
		return r*r*Math.PI;
	}
	

}
