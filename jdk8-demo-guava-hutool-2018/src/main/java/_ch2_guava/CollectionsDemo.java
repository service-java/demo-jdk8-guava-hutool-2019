package _ch2_guava;

import _ch2_guava.entity.GuavaUser;
import cn.hutool.core.lang.Console;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.*;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

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
    public void translateUrlParams() {
        Map<String, String> map = Maps.newHashMap();
        map.put("key1", "luo0412");
        map.put("key2", "java");
        map.put("key3", null);

        Map<String, String> newMap = Maps.newHashMap();
        map.forEach((k, v) -> {
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
    public void temp() {
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
    public void temp2() {
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


    @Test
    public void main() {

        List<Integer> list = Arrays.asList(1, 2, 6, 7, 11, 9, 10, 4);
        System.out.println("原始集合:" + list);

        // 有空元素放置到最后
        System.out.println("自然正序:" + Ordering.natural().nullsLast().sortedCopy(list));
        // 按照自然排序然后翻转, 有空元素排到最后
        System.out.println("自然逆序:" + Ordering.natural().reverse().nullsLast().sortedCopy(list));


        // 获取集合最大元素
        System.out.println("最小元素:" + Ordering.natural().max(list));

        // 获取集合元素中最大的3个元素
        System.out.println("最大元素:" + Ordering.natural().greatestOf(list, 3));

        // 获取集合最小元素
        System.out.println("最小元素:" + Ordering.natural().min(list));

        // 获取集合元素中最小的3个元素
        System.out.println("最小元素:" + Ordering.natural().leastOf(list, 3));

    }

    @Test
    public void demo() {
        List<GuavaUser> list = Arrays.asList(
                new GuavaUser(1, "Abc"),
                new GuavaUser(3, "BAb"),
                new GuavaUser(2, "zbc"),
                new GuavaUser(4, "fac"));
        System.out.println("原始集合:" + list);

        Ordering<GuavaUser> natureAgeAscOrdering = Ordering.natural().nullsFirst()
                .onResultOf(new Function<GuavaUser, Integer>() {
                    public Integer apply(GuavaUser input) {
                        return input.getAge();
                    }
                });
        System.out.println("年龄升序:" + natureAgeAscOrdering.sortedCopy(list));

        Ordering<GuavaUser> natureNameAscOrdering = Ordering.natural().nullsFirst().onResultOf(new Function<GuavaUser, String>() {
            public String apply(GuavaUser input) {
                return input.getName();
            }
        });
        System.out.println("姓名升序:" + natureNameAscOrdering.sortedCopy(list));

    }

    @Test
    public void filter() {
//        List<String> list = Lists.newArrayList("a", "A", "1", "B", "as");
//        Collection<String> filter = Collections2.filter(list, new Predicate<String>() {
//            public boolean apply(String s) {
//                return CharMatcher.JAVA_UPPER_CASE.matchesAllOf(s);
//            }
//        });
//        System.out.println("集合过滤:" + filter);
//
//        Collection<String> transform = Collections2.transform(list, new Function<String, String>() {
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        });
//        System.out.println("集合转换:" + transform);

    }


    @Test
    public void immutable() {
        ImmutableList<Integer> immutableList = ImmutableList.<Integer>builder()
                .add(1)
                .add(1, 2)
                .addAll(Arrays.asList(2, 3, 5, 5, 6))
                .build();
        System.out.println("immutableList:\t" + immutableList);

        ImmutableSet<Integer> immutableSet = ImmutableSet.<Integer>builder()
                .add(1)
                .add(1, 2)
                .addAll(Arrays.asList(2, 3, 5, 5, 6))
                .build();
        System.out.println("immutableSet:\t" + immutableSet);

        Map<Integer, String> map = Maps.newHashMap();
        map.put(1, "val1");
        map.put(2, "val2");
        map.put(2, "val3");
        ImmutableMap<Integer, String> immutableMap = ImmutableMap.copyOf(map);
        System.out.println("immutableMap:\t" + immutableMap);

    }


}
