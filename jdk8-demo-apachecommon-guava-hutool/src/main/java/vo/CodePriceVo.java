package vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-07-03 10:38
 */
@Data
@AllArgsConstructor
public class CodePriceVo {
    String fillinCode;
    Double price;
}
