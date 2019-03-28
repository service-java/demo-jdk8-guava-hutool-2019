package model;

//import lombok.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data
@Builder(toBuilder = true)
@Setter
@Getter
@ToString
public class Teacher {
//    @NotBlank(message = "不能为空")
    private String name;
    private String job;
    private String career;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public String getCareer() {
//        return career;
//    }
//
//    public void setCareer(String career) {
//        this.career = career;
//    }

}
