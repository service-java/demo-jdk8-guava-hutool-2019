package _guava;

import cn.hutool.core.lang.Console;
import com.google.common.base.Joiner;
import com.google.common.collect.*;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

public class CollectionsSimpleDemo {

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
        map.put("key1", "luo0412");
        map.put("key2", "java");
        map.put("key3", null);

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


    @Test
    public  void temp() {
        ArrayList<String> objects = Lists.newArrayList();
        objects.add("a");
        Console.log(objects);
    }

    @Test
    public void ArrayListMultimapDemo() {
        ArrayListMultimap<String, String> hello = ArrayListMultimap.create();
        hello.put("hello", "hu");
        hello.put("hello", "hu2");
        hello.put("hello", "hu3");
        hello.put("hello", "hu2");
        hello.put("hi", "hu2");

        Console.log(hello);
    }

    @Test
    public  void temp2() {
        HashMultimap<String, String> hello = HashMultimap.create();
        hello.put("hello", "2hu");
        hello.put("hello", "3hu2");
        hello.put("hello", "4hu3");
        hello.put("hello", "1hu2");
        hello.put("hi", "rrrhu2");
        hello.put("hi", "shu2");
        hello.put("hi", "hxu2");
        hello.put("hi", "tthu2");
        hello.put("hi", "xxshu2");

        Console.log(hello);

        for (String s : hello.keySet()) {
//            Console.log(hello.get(s));
            ArrayList<String> strings = new ArrayList<>(hello.get(s));
            Collections.sort(strings);
            Console.log(strings);
        }

    }


}
