package _collections.set;

import cn.hutool.core.lang.Console;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Description: 遍历Map
 * User: luo0412 1095847440@qq.com
 * Date: 2018-03-08
 * Time: 16:51
 */
public class DemoHashMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "value");
        map.put("2", "hi");
        map.put("3", "hello");
        map.put("4", "va");

        // 遍历key key->values
        for (String key : map.keySet()) {
            Console.log("{} {}", key, map.get(key));
        }
        Console.log();

        // 遍历值
        for (String v : map.values()) {
            // 不能遍历key
            Console.log(v);
        }
        Console.log();


        // 迭代器
        // hasNext -> next
        Iterator<Map.Entry<String, String>> ite = map.entrySet().iterator();
        while (ite.hasNext()) {
            Map.Entry<String, String> entry = ite.next();
            Console.log("{} {}", entry.getKey(), entry.getValue());
        }
        Console.log();


        // 数据量大的时候
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Console.log("{} {}", entry.getKey(), entry.getValue());
        }
        Console.log();
    }
}
