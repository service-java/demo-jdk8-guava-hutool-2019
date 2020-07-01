package _guava;

import _guava.entity.GuavaUser;
import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Description: 模块功能描述
 * <p>
 * User: https://juejin.im/post/5dfb2d34518825126e63a520
 * Date: 2019-12-26 10:31
 */
public class CollDemo {

    public static void main(String[] args) {

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
                new GuavaUser(2,"zbc"),
                new GuavaUser(4,"fac"));
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
