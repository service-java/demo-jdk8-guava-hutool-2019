package _ch2_lombok.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-10-31 15:23
 */
@Builder
@Data
public class LombokDogEntity {
    String name;
    Integer age;
}
