package _hutool.media;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.junit.Test;

public class JsonUtilDemo {
    public static void main(String[] args) {
        String jsonStr = "[\"value1\", \"value2\", \"value3\"]";
        JSONArray array = JSONUtil.parseArray(jsonStr);
        array.put("小四");

        Console.log(array);
    }

    @Test
    public void hello() {
        String jsonStr = "{\"b\":\"value2\",\"c\":\"value3\",\"a\":\"value1\"}";
        JSONObject jsonObject = JSONUtil.parseObj(jsonStr);
        Console.log(jsonObject);

        String jsonArrStr = "[\"value1\", \"value2\", \"value3\"]";
        JSONArray array = JSONUtil.parseArray(jsonArrStr);
        Console.log(array);

    }

}
