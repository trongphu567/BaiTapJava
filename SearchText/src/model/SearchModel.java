package model;

public class SearchModel {
	private String text;
	private String keyword;
	private String result;
	
	public SearchModel() {
		this.text="";
		this.keyword="";
		this.result="";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public void search() {
		int count=0;
		int index=0;
		while(true) {
			int i=this.text.indexOf(this.keyword,index);
			if (i==-1)
				break;
			else {
				count++;
				index=i+1;
			}
			
		}
		this.result="Ket qua co: "+count+" "+this.keyword;
		System.out.println(result);
	}
	
	
}
