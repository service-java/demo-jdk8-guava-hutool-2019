package _hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-11-08 13:35
 */
public class IdUtilDemo {

    public static void main(String[] args) {
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        long id = snowflake.nextId();
        Console.log(id); // eg. 1192679264126898176
    }


}
