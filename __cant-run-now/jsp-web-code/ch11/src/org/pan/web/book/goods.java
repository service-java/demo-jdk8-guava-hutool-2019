package org.pan.web.book;

public class goods {
	private long Id;			//ID序列号
	private String GoodsName;	//书名
	private int GoodsClass;		//类别
	private String classname ;  //类别名
	private String Author;		//作者
	private String Publish;		//
	private String GoodsNo ;		//号
	private String Content ;	//内容介绍
	private float Prince ;		//书价
	private int Amount ;		//总数量
	private int Leav_number ;	//剩余数量
	private String RegTime ;	//登记时间

	public goods() {
		Id = 0;
		GoodsName = "";
		GoodsClass = 0;
		classname = "";
		Author = "";
		Publish = "";
		GoodsNo = "";
		Content = "";
		Prince = 0;
		Amount = 0;
		Leav_number = 0;
		RegTime = "";
	}

	public void setId(long newId){
		this.Id = newId;
	}

	public long getId(){
		return Id;
	}

	public void setGoodsName(String newGoodsName) {
		this.GoodsName = newGoodsName;
	}

	public String getGoodsName() {
		return GoodsName;
	}
	
	public void setGoodsClass(int newGoodsClass) {
		this.GoodsClass = newGoodsClass;
	}

	public int getGoodsClass() {
		return GoodsClass;
	}

	public void setClassname(String cname) {
		this.classname = cname;
	}

	public String getClassname() {
		return classname;
	}

	public void setAuthor(String newAuthor) {
		this.Author = newAuthor;
	}

	public String getAuthor() {
		return Author;
	}

	public void setGoodsNo(String newGoodsNo) {
		this.GoodsNo = newGoodsNo;
	}

	public String getGoodsNo() {
		return GoodsNo;
	}

	public void setPublish(String newPublish) {
		this.Publish = newPublish;
	}

	public String getPublish() {
		return Publish;
	}

	public void setContent(String newContent) {
		this.Content= newContent;
	}

	public String getContent() {
		return Content;
	}

	public void setPrince(float newPrince) {
		this.Prince = newPrince;
	}

	public float getPrince() {
		return Prince;
	}

	public void setAmount(int newAmount) {
		this.Amount = newAmount;
	}

	public long getAmount() {
		return Amount;
	}

	public void setLeav_number(int newLeav_number) {
		this.Leav_number = newLeav_number;
	}

	public int getLeav_number() {
		return Leav_number;
	}

	public void setRegTime(String newRegTime) {
		this.RegTime = newRegTime;
	}

	public String getRegTime() {
		return RegTime;
	}
};
