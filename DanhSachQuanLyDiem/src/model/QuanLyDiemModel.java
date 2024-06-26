package model;

public class QuanLyDiemModel {
	private String maSV;
	private String tenSV;
	private double diem;
	
	public QuanLyDiemModel(String maSV, String tenSV, double diem) {
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diem = diem;
	}
	public QuanLyDiemModel() {}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	
	
}
