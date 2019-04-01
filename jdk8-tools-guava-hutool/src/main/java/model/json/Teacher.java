package model.json;

import lombok.Data;

import java.util.List;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-01
 * Time: 11:03
 */
@Data
public class Teacher {
    private String teacherName;
    private Integer teacherAge;
    private Course course;
    private List<Student> students;
}
