package controller.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-03-28
 * Time: 13:27
 */

@Data
@Accessors(chain = true)
public class UserVo {
    String name;
    Integer age;
}
