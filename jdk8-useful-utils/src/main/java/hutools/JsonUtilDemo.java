package hutools;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;

public class JsonUtilDemo {
    public static void main(String[] args) {
        String jsonStr = "[\"value1\", \"value2\", \"value3\"]";
        JSONArray array = JSONUtil.parseArray(jsonStr);
        array.put("小四");

        Console.log(array);
    }
}
