package _lombok;

import _lombok.entity.LombokDogEntity;
import cn.hutool.core.lang.Console;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-10-31 15:23
 */
public class LombokDemo {
    public static void main(String[] args) {
        LombokDogEntity build = LombokDogEntity.builder()
                .age(11).name("dog")
                .build();

        Console.log(build);
    }
}
