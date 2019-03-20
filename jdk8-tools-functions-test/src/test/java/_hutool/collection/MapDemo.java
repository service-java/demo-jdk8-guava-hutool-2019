package _hutool.collection;

import cn.hutool.core.lang.Console;
import cn.hutool.core.map.MapUtil;

import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Object, Object> colorMap = MapUtil.of(new String[][] {{
//                {"RED", "#FF0000"},
//                {"GREEN", "#00FF00"},
//                {"BLUE", "#0000FF"}
        }});

//        MapUtil.toListMap([
//                {a: 1, b: 1, c: 1}
//            {a: 2, b: 2}
//                {a: 3, b: 3}
//        {a: 4}
//        ]);
        Console.log(colorMap);

    }
}
