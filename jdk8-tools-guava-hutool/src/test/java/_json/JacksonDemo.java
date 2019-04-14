package _json;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Student;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-12
 * Time: 10:26
 */
public class JacksonDemo {
    final String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";


    @Test
    public void main() {
        ObjectMapper mapper = new ObjectMapper();

        //map json to student
        try {
            Student student = mapper.readValue(jsonString, Student.class);
            System.out.println(student);

//            mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
            String s = mapper.writeValueAsString(student);
            Console.log(s);

        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void map2Str() {
        Map<String, String> map = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        map.put("date", DateUtil.format(new Date(), "HH:mm yyyy/MMdd"));
        map.put("time", DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
//        System.out.println("print map: " + map);
        String jsonStr = null;
        try {
            jsonStr = objectMapper.writeValueAsString(map);
            Console.log(jsonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
