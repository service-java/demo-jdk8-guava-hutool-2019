package valuebean;

/**
 * Created by Luo_0412 on 2017/4/5.
 */
public class SimpleBean implements java.io.Serializable
{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}