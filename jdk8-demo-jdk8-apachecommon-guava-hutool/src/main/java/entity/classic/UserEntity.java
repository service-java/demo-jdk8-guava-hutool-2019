package entity.classic;

import cn.hutool.core.lang.Console;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString
public class UserEntity {
    String name;
    Integer age;
    String password;

    public UserEntity() {

    }

    public UserEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private void testMethod() {
        Console.log("test----");
    }
}
