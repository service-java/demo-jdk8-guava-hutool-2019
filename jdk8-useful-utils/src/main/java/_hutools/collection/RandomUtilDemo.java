package _hutools.collection;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.RandomUtil;
import com.sun.xml.internal.ws.transport.http.server.ServerAdapterList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomUtilDemo {
    public static void main(String[] args) {


        Console.log("{} {}\n ",
            RandomUtil.randomUUID(), RandomUtil.randomNumbers(12));

    }
}
