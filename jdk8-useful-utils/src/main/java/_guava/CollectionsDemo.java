package _guava;

import cn.hutool.core.lang.Console;
import com.google.common.collect.Sets;

import java.util.Set;

public class CollectionsDemo {

    // 集合操作：交集、差集、并集
    public static void main(String[] args) {
        Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 4, 5);
        Set<Integer> set2 = Sets.newHashSet(3, 4, 5, 6);

        //交集
        Sets.SetView<Integer> inter = Sets.intersection(set1, set2);
        //差集,在A中不在B中
        Sets.SetView<Integer> diff = Sets.difference(set1, set2);
        Sets.SetView<Integer> diff2 = Sets.difference(set2, set1);
        //并集
        Sets.SetView<Integer> union = Sets.union(set1, set2);

        Console.log("{} \n{} {} \n{} ", inter, diff, diff2, union);
    }

}
