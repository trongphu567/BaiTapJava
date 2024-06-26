
public class HangSanXuat {
	private String tenHangSX;
	private QuocGia quocGia;
	public HangSanXuat(String tenHangSX, QuocGia quocGia) {
		this.tenHangSX = tenHangSX;
		this.quocGia = quocGia;
	}
	public String getTenHangSX() {
		return tenHangSX;
	}
	public void setTenHangSX(String tenHangSX) {
		this.tenHangSX = tenHangSX;
	}
	public QuocGia getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}
	public String layTenQuocGia() {
		// TODO Auto-generated method stub
		
		return this.quocGia.getTenQuocGia();
	}
	
	
	
}
