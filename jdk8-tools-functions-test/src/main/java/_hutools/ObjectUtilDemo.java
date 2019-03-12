package _hutools;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ObjectUtil;


public class ObjectUtilDemo {
    public static void main(String[] args) {

        String a = "ef";
        Integer i = 1_000_000;
        int [] arr = {1 , 2};
        Console.log("{} {} {}",
                ObjectUtil.isBasicType(a),
                ObjectUtil.isBasicType(i), // true
                ObjectUtil.isBasicType(arr));

    }
}
