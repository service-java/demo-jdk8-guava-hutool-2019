package _ch2_hutool.collection;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Dict;

public class DictDemo {
    public static void main(String[] args) {

        Dict dict = Dict.create()
                .set("key1", 1)//int
                .set("key2", 1000L)//long
                .set("key3", DateTime.now());//Date

        Console.log(dict.getLong("key2"));
    }
}
