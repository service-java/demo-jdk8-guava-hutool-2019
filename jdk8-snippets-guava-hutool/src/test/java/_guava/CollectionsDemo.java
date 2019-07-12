package _guava;

import cn.hutool.core.lang.Console;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

    // 集合操作：交集、差集、并集
    public static void main(String[] args) {
        Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 4, 5);
        Set<Integer> set2 = Sets.newHashSet(3, 4, 5, 6);

        // 交集
        Sets.SetView<Integer> inter = Sets.intersection(set1, set2);

        // 差集,在A中不在B中
        Sets.SetView<Integer> diff = Sets.difference(set1, set2);
        Sets.SetView<Integer> diff2 = Sets.difference(set2, set1);

        // 并集
        Sets.SetView<Integer> union = Sets.union(set1, set2);

        Console.log("交集 -> {} \n差集 -> {} {} \n并集 -> {} ",
                inter,
                diff, diff2,
                union);
    }


    @Test
    public void translateUrlParams () {
        Map<String, String> map = Maps.newHashMap();
        map.put("key", "123");
        map.put("key1", "luo0412");
        map.put("key2", "骆锦灿");
        map.put("key3", "test");


        Map<String, String> newMap = Maps.newHashMap();
        map.forEach((k,v) -> {
            if (v != null) {
                try {
                    newMap.put(k, URLEncoder.encode(v, "utf-8"));
                } catch (UnsupportedEncodingException e) {

                }
            }
        });

        String join = Joiner.on("&").useForNull("").withKeyValueSeparator("=").join(newMap);
        Console.log(join);
    }

}
