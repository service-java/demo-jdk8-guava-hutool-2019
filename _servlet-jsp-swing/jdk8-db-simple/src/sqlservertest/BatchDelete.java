package sqlservertest;

import entity.Stu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchDelete {
    private Connection conn;

    public Connection getConn() {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver"); // 加载数据库驱?
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:jtds:sqlserver://localhost:1433;DatabaseName=db_database19"; // 连接数据库URL
        String userName = "sa"; // 连接数据库的用户?
        String passWord = ""; // 连接数据库密?
        try {
            conn = DriverManager.getConnection(url, userName, passWord); // 获取数据库连?

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn; // 返回Connection对象
    }

    // 查询?有学生成绩信?
    public List<Stu> executeStu() {
        conn = getConn(); // 获取数据库连?
        Statement cs = null; // 定义CallableStatement对象
        String sql = "select * from tb_stu"; // 定义调用储存过程的SQL语句
        List<Stu> list = new ArrayList<>();
        try {
            cs = conn.createStatement(); // 实例化Statement对象
            ResultSet rest = cs.executeQuery(sql); // 执行SQL语句
            while (rest.next()) { // 循环遍历查询结果?
                Stu stu = new Stu();
                stu.setId(rest.getInt(1));
                stu.setName(rest.getString(2));
                stu.setSex(rest.getString(3));
                stu.setSpecialty(rest.getString(4));
                list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void deleteBatch(Integer[] id) {
        conn = getConn(); // 获取数据库连?
        Statement cs = null; // 定义Statement对象
        try {
            cs = conn.createStatement(); // 实例化Statement对象
            for (int i = 0; i < id.length; i++) { // 循环遍历参数数组
                cs.addBatch("delete from tb_stu  where id =" + id[i]); // 删除数据
            }
            cs.executeBatch(); // 批量执行SQL语句
            cs.close(); // 将Statement对象关闭
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

