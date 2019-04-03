
package Object;



public class Project {
	
	private int id;
	
	private String name;
	
	private String info;
	
	private String time;
	
	private Project(){
		
	}
	
	private Project(int id,String name,String info,String time)
	{
		this.id = id;
		
		this.name = name;
		
		this.info = info;
		
		this.time = time;
	}
	
	public static Project getInstance()
	{
		return new Project();
	}
	
	public static Project getInstance(int id,String name,String info,String time)
	{
		return new Project(id,name,info,time);
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
	
	public void setInfo(String info)
	{
		this.info = info;
	}
	
	public String getInfo()
	{
		return this.info;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public String getTime()
	{
		return this.time;
	}

}
