package _ch2_validate.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-05 10:01
 */
public class HibernateValidateUser {
    @NotBlank(message = "不为空")
    @Length(max = 4, message = "名字不要超过4个中文字数")
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
