
package Object;


public class Teacher {
	
	private int id;
	
	private String name;
	
	private String sex;
	
	private String zhicheng;
	
	private String image;
	
	private String info;
	
	Teacher()
	{
		
	}
	
	Teacher(int id,String name,String sex
			,String zhicheng,String image,String info)
	{
		this.id = id;
		
		this.name = name;
		
		this.sex = sex;
		
		this.zhicheng = zhicheng;
		
		this.image = image;
		
		this.info = info;
	}
	
	public static Teacher getInstance()
	{
		return new Teacher();
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	public String getSex()
	{
		return this.sex;
	}
	
	public void setZhicheng(String zhicheng)
	{
		this.zhicheng = zhicheng;
	}
	
	public String getZhicheng()
	{
		return this.zhicheng;
	}
	
	public void setImage(String image)
	{
		this.image = image;
	}
	
	public String getImage()
	{
		return this.image;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
}
