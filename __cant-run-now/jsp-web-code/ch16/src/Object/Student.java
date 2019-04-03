
package Object;


public class Student {

	private int id;
	
	private String name;
	
	private int grade_id;
	
	private String image;
	
	private String sex;
	
	private Student()
	{
		
	}
	
	private Student(int id,String name,int grade_id,String image,String sex)
	{
		this.id = id;
		
		this.name = name;
		
		this.grade_id = grade_id;
		
		this.image = image;
		
		this.sex = sex;
	}
	
	public static Student getInstance()
	{
		return new Student();
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
	
	public void setGrade_id(int grade_id)
	{
		this.grade_id = grade_id;
	}
	
	public int getGrade_id()
	{
		return this.grade_id;
	}
	
	public void setImage(String image)
	{
		this.image = image;
	}
	
	public String getImage()
	{
		return this.image;
	}
	
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	public String getSex()
	{
		return this.sex;
	}
	
}
