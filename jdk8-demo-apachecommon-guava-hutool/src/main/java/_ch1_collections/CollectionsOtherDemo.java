package _ch1_collections;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.*;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-18
 * Time: 16:04
 */
public class CollectionsOtherDemo {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    HashSet<Integer> integers1 = new HashSet<>();
    Map scores = new HashMap();

    {
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        Console.log("arrayList: " + arrayList);
    }

    {
        integers1.add(1);
        integers1.add(3);
        integers1.add(2);
        Console.log("integers: " + integers1);
    }

    {
        scores.put("语文" , 80);
        scores.put("Java" , 82);
        Console.log("scores: " + scores);
    }


    @Test
    public void emptyInit () {
        List<Object> list = Collections.emptyList();
        Console.log(list);// []
        Set<Object> objects = Collections.emptySet();
        System.out.println(objects);//[]
        Map<Object, Object> objectObjectMap = Collections.emptyMap();
        System.out.println(objectObjectMap);//{}
    }


    @Test
    public void singleton () {
        List<ArrayList<Integer>> arrayLists = Collections.singletonList(arrayList);
        //[[-1, 3, 3, -5, 7, 4, -9, -7]]
        System.out.println(arrayLists);

        // 创建一个只有一个元素，且不可改变的Set对象
        Set<ArrayList<Integer>> singleton = Collections.singleton(arrayList);
        // [[-1, 3, 3, -5, 7, 4, -9, -7]]
        System.out.println(singleton);
        Map<String, String> nihao = Collections.singletonMap("1", "nihao");
        // {1=nihao}
        System.out.println(nihao);
    }

    @Test
    public void unmodifiable () {
        List<Integer> arrayList2 = Collections.unmodifiableList(arrayList);
        // [-1, 3, 3, -5, 7, 4, -9, -7]
        // System.out.println(integers);
        Set<Integer> integers2 = Collections.unmodifiableSet(integers1);
        // [1, 2, 3]
        // System.out.println(integers2);
        Map<Object, Object> objectObjectMap2 = Collections.unmodifiableMap(scores);
        // {Java=82, 语文=80}
        // System.out.println(objectObjectMap2);


        // 以下操作会出现异常：java.lang.UnsupportedOperationException
        arrayList2.add(1);
        integers2.add(1);
        objectObjectMap2.put("Java", "dubbo");
    }




}
