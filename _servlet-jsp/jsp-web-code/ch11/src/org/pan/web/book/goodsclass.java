package org.pan.web.book;



public class goodsclass {
	private int Id;				//ID序列号
	private String ClassName;	//图书类别

	public goodsclass() {
		Id = 0;
		ClassName = "";
	}
	
	public goodsclass(int newId, String newname) {
		Id = newId;
		ClassName = newname;
	}

	public int getId() {
		return Id;
	}

	public void setId (int newId) {
		this.Id = newId;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String newname) {
		this.ClassName = newname;
	}
}
