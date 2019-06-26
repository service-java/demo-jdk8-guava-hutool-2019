package model;

import cn.hutool.core.lang.Console;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class User {
    String name;
    Integer age;
    String password;

    private void testMethod() {
        Console.log("test----");
    }
}
