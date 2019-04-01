package _fastjson;

import cn.hutool.core.lang.Console;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import model.Person;
import model.User;
import org.junit.Before;
import org.junit.Test;
import util.BeanCopyUtils;
import vo.UserVo;


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

    @Test
    public void copyDemo() {
        UserVo userVo = new UserVo();
        userVo.setName("张伟").setAge(22);

        User user = new User();
        user.setName("陈磊").setAge(null).setPassword("123456");
        BeanCopyUtils.copyNotNullBean(user, userVo);
        Console.log(userVo);
    }


    @Test
    public void readJSON() {
        List listOfPersons = new ArrayList<Person>();
        listOfPersons.add(new Person(15, "John Doe", new Date()));
        listOfPersons.add(new Person(20, "Janette Doe", new Date()));
        String jsonOutput= JSON.toJSONString(listOfPersons);
        Console.log(jsonOutput);

        Object parse = JSONArray.parse(jsonOutput);
        Console.log(parse);
    }

}
