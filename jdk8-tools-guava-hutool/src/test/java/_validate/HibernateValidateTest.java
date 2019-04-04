package _validate;

import cn.hutool.core.lang.Console;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.junit.Test;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-03-21
 * Time: 17:33
 */
public class HibernateValidateTest {

    @Test
    public void main() {
        hello(null);
    }

    @Valid
    private void hello(@NotEmpty(message="不能为空") String hero) {
        Console.log(hero);
    }
}
