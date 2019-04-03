package _collections;

import cn.hutool.core.lang.Console;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayArrayListDiff {
    public static void main(String[] args) {
        List arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");

        Object[] objects = arrayList.toArray();
        Console.log(objects);
        // 存在问题
//        Console.log("arrayList转数组 -> {}", objects);
        Console.log("数组转list -> {}", Arrays.asList(objects));

    }
}
