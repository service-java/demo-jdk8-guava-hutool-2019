package _guava;

import cn.hutool.core.lang.Console;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-01 19:40
 */
public class BiMapDemo {
    public static <S, T> Map<T, S> getInverseMap(Map<S, T> map) {
        Map<T, S> inverseMap = new HashMap<T, S>();
        for (Map.Entry<S, T> entry : map.entrySet()) {
            inverseMap.put(entry.getValue(), entry.getKey());
        }
        return inverseMap;
    }

    @Test
    public void inverse() {

        BiMap<Integer, String> logfileMap = HashBiMap.create();
        logfileMap.put(1, "a.log");
        logfileMap.put(2, "b.log");
        logfileMap.put(3, "c.log");
        System.out.println("logfileMap:" + logfileMap);

        BiMap<String, Integer> filelogMap = logfileMap.inverse();
        System.out.println("filelogMap:" + filelogMap);
    }

    @Test
    public void forcePut() {

        BiMap<Integer, String> logfileMap = HashBiMap.create();
        logfileMap.put(1, "a.log");
        logfileMap.put(2, "b.log");
        logfileMap.put(3, "c.log");
        logfileMap.put(4, "d.log");

        // 直接put --> value already present
//        logfileMap.put(5,"d.log");
        logfileMap.forcePut(5, "d.log");
        System.out.println("logfileMap:" + logfileMap);

    }

    @Test
    public void sthAfterInverseNotOk() {
        // 它实现了一种视图关联，这样你对于反转后的map的所有操作都会影响原先的map对象
        BiMap<Integer, String> logfileMap = HashBiMap.create();
        logfileMap.put(1, "a.log");
        logfileMap.put(2, "b.log");
        logfileMap.put(3, "c.log");
        System.out.println("logfileMap:" + logfileMap);

        BiMap<String, Integer> filelogMap = logfileMap.inverse();
//        System.out.println("filelogMap:" + filelogMap);

        Console.log("filelogMap: {}" , filelogMap);

        logfileMap.put(4, "d.log");
        System.out.println("logfileMap:" + logfileMap);
//        System.out.println("filelogMap:" + filelogMap);
        Console.log("filelogMap: {}" , filelogMap);

    }

}
