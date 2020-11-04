package _ch2_json;

import cn.hutool.core.lang.Console;
import com.google.gson.*;
import entity.classic.StudentEntity;
import org.junit.Test;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-07-04
 * Time: 11:14
 */
public class GsonDemo {

    @Test
    public void h() {
        String jsonString = "{\"name\":\"Maxsu\", \"age\":24}";

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        // null支持
        // builder.serializeNulls();

        Gson gson = builder.create();
        StudentEntity studentEntity = gson.fromJson(jsonString, StudentEntity.class);
        Console.log(studentEntity);
        // System.out.println(student);

        jsonString = gson.toJson(studentEntity);
        Console.log(jsonString);


        studentEntity = new StudentEntity();
        studentEntity.setName("o").setAge(12);

        jsonString = gson.toJson(studentEntity);
        Console.log(jsonString);
    }


    @Test
    public void tree () {
        String jsonString =
                "{\"name\":\"Maxsu\", \"age\":26,\"verified\":false,\"marks\": [100,90,85]}";
        JsonParser parser = new JsonParser();
        JsonElement rootNode = parser.parse(jsonString);

        // 判断
        if (rootNode.isJsonObject()) {
            JsonObject details = rootNode.getAsJsonObject();

            JsonElement nameNode = details.get("name");
            System.out.println("Name: " + nameNode.getAsString());

            JsonElement ageNode = details.get("age");
            System.out.println("Age: " + ageNode.getAsInt());

            JsonElement verifiedNode = details.get("verified");
            System.out.println("Verified: " + (verifiedNode.getAsBoolean() ? "Yes":"No"));

            // 输出数组
            JsonArray marks = details.getAsJsonArray("marks");
            for (int i = 0; i < marks.size(); i++) {
                JsonPrimitive value = marks.get(i).getAsJsonPrimitive();
                System.out.print(value.getAsInt() + " ");
            }

        }


    }



}
