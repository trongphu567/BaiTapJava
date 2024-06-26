package model;

import java.util.StringTokenizer;

public class MenuMonAnModel {
	private String luaChonMonAn;
	private String luaChonNuocUong;
	private int tongTien;
	
	public MenuMonAnModel() {
		this.luaChonMonAn = "";
		this.luaChonNuocUong = "";
		this.tongTien =0;
	}

	public String getLuaChonMonAn() {
		return luaChonMonAn;
	}

	public void setLuaChonMonAn(String luaChonMonAn) {
		this.luaChonMonAn = luaChonMonAn;
	}

	public String getLuaChonNuocUong() {
		return luaChonNuocUong;
	}

	public void setLuaChonNuocUong(String luaChonNuocUong) {
		this.luaChonNuocUong = luaChonNuocUong;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}
	public void tinhTongTien() {
		this.tongTien=0;
		StringTokenizer stk=new StringTokenizer(this.luaChonMonAn);
		while (stk.hasMoreElements()) {
			String monAn=stk.nextToken();
			if (monAn.equals("Mì tôm"))
				tongTien+=20000;
			else if (monAn.equals("Bún bò"))
				tongTien+=25000;
			else if (monAn.equals("Bánh mì"))
				tongTien+=15000;
			
		}
		StringTokenizer stk1=new StringTokenizer(this.luaChonNuocUong);
		while(stk1.hasMoreElements()) {
			String nuocUong=stk1.nextToken();
			if (nuocUong.equals("Nước lọc"))
				tongTien+=6000;
			else if (nuocUong.equals("Coca cola"))
				tongTien+=12000;
		}
		
		
	}
	
}
