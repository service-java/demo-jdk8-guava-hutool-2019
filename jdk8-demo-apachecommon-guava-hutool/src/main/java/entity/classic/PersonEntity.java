package entity.classic;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

//@Data
@ToString
public class PersonEntity implements Serializable {

    @JSONField(name = "AGE")
    private int age;

    @JSONField(name = "FULL NAME")
    private String fullName;

    @JSONField(name = "DATE OF BIRTH")
    private Date dateOfBirth;

    public PersonEntity(int age, String fullName, Date dateOfBirth) {
        super();
        this.age = age;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                ", fullName='" + fullName + '\'' +
//                ", dateOfBirth=" + dateOfBirth +
//                '}';
//    }


}
