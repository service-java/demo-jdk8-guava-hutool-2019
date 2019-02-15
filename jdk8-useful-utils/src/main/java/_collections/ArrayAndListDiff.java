package _collections;

import cn.hutool.core.lang.Console;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndListDiff {
    public static void main(String[] args) {

        List arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");

        Object[] objects = arrayList.toArray();
        Console.log(objects);
//        Console.log("arrayList转数组 -> {}", objects);


        String[] arr = {"1", "2"};
        Console.log("数组转list -> {}", Arrays.asList(arr));

    }
}
