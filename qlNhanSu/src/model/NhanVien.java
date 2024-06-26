package model;


public class NhanVien {
	private String id;
	private String hoTen;
	private String gioiTinh;
	private String diaChi;
	private String ngaySinh;
	private String sdt;
	private String chucVu;
	public NhanVien() { }
    public NhanVien(String id, String ht, String gt, String ns, String dc, String sdt, String cv) {
        this.id = id;
        this.hoTen = ht;
        this.gioiTinh = gt;
        this.sdt = sdt;
        this.ngaySinh=ns;
        this.diaChi=dc;
        this.chucVu=cv;
    }
	public void setID(String id) {
		this.id=id;}
	public String getID() {return id;}
	public void setHoten(String ht) {this.hoTen=ht;}
	public String getHoten() {return hoTen;}
	public void setGioitinh(String gt) {this.gioiTinh=gt;}
	public String getGioitinh() {return gioiTinh;}
	public void setDiachi(String dc) {this.diaChi=dc;}
	public String getDiachi() {return diaChi;}
	public void setNgaysinh(String ns) {this.ngaySinh=ns;}
	public String getNgaysinh() {return ngaySinh;}
	public void setSdt(String dt) {this.sdt=dt;}
	public String getSdt() {return sdt;}
	public void setChucvu(String cv) {this.chucVu=cv;}
	public String getChucvu() {return chucVu;}
	public void show() {
		System.out.println(getID() + "" + getHoten() + "" + getGioitinh() + "" + getDiachi() + "" + getNgaysinh() + "" + getSdt() + "" + getChucvu() + "");
	}
}
