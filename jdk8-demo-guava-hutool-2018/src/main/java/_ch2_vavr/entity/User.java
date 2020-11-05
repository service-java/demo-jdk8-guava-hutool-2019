package _ch2_vavr.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-05 13:47
 */
@Data
@Builder
public class User {
    private Long id;
    private String name;
    private Integer age;
}
