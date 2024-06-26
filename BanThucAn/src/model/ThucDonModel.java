package model;

import java.util.StringTokenizer;

public class ThucDonModel {
	private String luaChon_monChinh;
	private String luaChon_monPhu;
	private int tongTien;
	
	public ThucDonModel() {
		this.luaChon_monChinh = "";
		this.luaChon_monPhu = "";
		this.tongTien = 0;
	}

	public String getLuaChon_monChinh() {
		return luaChon_monChinh;
	}

	public void setLuaChon_monChinh(String luaChon_monChinh) {
		this.luaChon_monChinh = luaChon_monChinh;
	}

	public String getLuaChon_monPhu() {
		return luaChon_monPhu;
	}

	public void setLuaChon_monPhu(String luaChon_monPhu) {
		this.luaChon_monPhu = luaChon_monPhu;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}

	public void tinhTongTien() {
		this.tongTien=0;
		if (this.luaChon_monChinh.equals("Com"))
			tongTien+=30000;
		else if (this.luaChon_monChinh.equals("Pho"))
			tongTien+=50000;
		else if (this.luaChon_monChinh.equals("Bun"))
			tongTien+=25000;
		
		StringTokenizer stk=new StringTokenizer(this.luaChon_monPhu,",");
		while (stk.hasMoreElements()) {
			String monPhu=stk.nextToken();
			monPhu=monPhu.trim();
			if (monPhu.equals("Tra sua")) 
				tongTien+=20000;
			else if (monPhu.equals("Nuoc ngot"))
				tongTien+=10000;
			else if (monPhu.equals("Kem"))
					tongTien+=8000;
			
		}
		
	}
	
	
	
	
	
	
	
	
}
