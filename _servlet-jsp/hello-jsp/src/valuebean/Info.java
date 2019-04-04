package valuebean;

/**
 * Created by Luo_0412 on 2017/4/12.
 */
public class Info {
    private String name;
    private int age;
    private String gender;
    private String[] hobby;
    private String qulification;
    private String introduction;

    public String getName() {
        return this.name;
    }
    public void setName(String name) { this.name = name; }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return this.hobby;
    }
    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getQulification() {
        return this.qulification;
    }
    public void setQulification(String qulification) {
        this.qulification = qulification;
    }

    public String getIntroduction() {
        return this.introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
