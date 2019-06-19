package _hutool;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-03-20
 * Time: 14:20
 */
public class SimpleDBTest {

    public static void main(String[] args) throws SQLException {

    }

    @Test
    public void insert() throws SQLException {
        Entity entity = Entity.create("user").set("name", "unitTestUser");
        Db.use().insert(entity);
//        Db.use().insertForGeneratedKey(
//                Entity.create("user")
//                        .set("name", "unitTestUser")
//                        .set("age", 66)
//        );
    }


    @Test
    public void remove() throws SQLException {
        //where条件
        Entity entity = Entity.create("user").set("name", "unitTestUser");
        Db.use().del(entity);
    }


    @Test
    public void update() throws SQLException {
        //where条件
        Entity entity = Entity.create().set("age", 12);
        Entity query = Entity.create("user").set("name", "unitTestUser");
        Db.use().update(entity, query);
    }


}
