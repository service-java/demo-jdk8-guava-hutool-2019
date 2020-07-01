package _jdk8;

import cn.hutool.core.lang.Console;
import entity.classic.UserEntity;
import org.junit.Test;

import java.util.Optional;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-10-23 17:13
 */
public class OptionalSimpleDemo {
    public static void main(String[] args) throws Exception {

        UserEntity user = (UserEntity) Optional
                .ofNullable(null)
                .orElseGet(() -> new UserEntity("Unknown", 12));
        System.out.println("Username is: " + user.getName());


        // throw NoSuchElementException
        user = (UserEntity) Optional.ofNullable(null)
                .orElseGet(() -> new UserEntity());

        String userName = Optional.ofNullable(user)
                .map(u-> u.getName())
                .orElseThrow(()->new Exception("取指错误"));
        Console.log(userName);
    }

    @Test
    public  void demo1() {
        Optional<UserEntity> optUser = Optional.ofNullable(new UserEntity());
        Optional<String> userName = optUser.map(UserEntity::getName);

    }
}
