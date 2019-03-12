package _json;

import cn.hutool.core.lang.Console;
import com.alibaba.fastjson.JSON;
import model.Person;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FastjsonTest  {

    private List<Person> listOfPersons = new ArrayList<Person>();

    @Before
    public void setUp() {
        listOfPersons.add(new Person(15, "John Doe", new Date()));
        listOfPersons.add(new Person(20, "Janette Doe", new Date()));
    }

    @Test
    public void whenJavaList_thanConvertToJsonCorrect() {
        Console.log(new Person(15, "John Doe", new Date()));

        String jsonOutput= JSON.toJSONString(listOfPersons);
        Console.log(jsonOutput);
    }

//    public static void main(String[] args) {
//        List listOfPersons = new ArrayList<Person>();
//
//        listOfPersons.add(new Person(15, "John Doe", new Date()));
//        listOfPersons.add(new Person(20, "Janette Doe", new Date()));
//
//        String jsonOutput= JSON.toJSONString(listOfPersons);
//        Console.log(jsonOutput);
//    }

}
