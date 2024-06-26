package model;

import java.util.ArrayList;
import java.util.Objects;

public class tinh {
	private int maTinh;
	private String tenTinh;
	
	public tinh(int maTinh, String tenTinh) {
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
	}

	public int getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	@Override
	public String toString() {
		return "tinh [maTinh=" + maTinh + ", tenTinh=" + tenTinh + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maTinh, tenTinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tinh other = (tinh) obj;
		return maTinh == other.maTinh && Objects.equals(tenTinh, other.tenTinh);
	}
	public static ArrayList<tinh> getDSTinh() {
		String[] arr_tinh= {"An Giang","Tiền Giang","Long An","TPHCM","Bình Dương","Hà Nội"};
		
		ArrayList<tinh> listTinh=new ArrayList<tinh>();
		int i=0;
		for (String tenTinh:arr_tinh) {
			tinh t=new tinh(i, tenTinh);
			listTinh.add(t);
		}
		return listTinh;
		
	}
	
	
}
