package _guava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-12-26 10:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuavaUser {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
