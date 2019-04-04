package db;

import java.sql.ResultSet;

public class DBHelperTest {

    public static void main(String[] args) {
        // 执行sql语句,返回是否执行成功
        String sql = "insert into stu_info values (null, 20141, "
                + "'骆金参', 1, '1996-04-12', "
                + "12, 12, 12)";
        System.out.println(DBHelper.executeNonQuery(sql));

        sql = "insert into stu_info values (null,?,?,?,?,?,?,?)";
        Object[] obj = new Object[]{"20129", "张三", 1, "1997-09-08", 100, 99, 100};
        System.out.println(DBHelper.executeNonQuery(sql, obj));

//		sql = "delete from stu_info Where stu_id='20141'";
//        System.out.println(DBHelper.executeNonQuery(sql));
//        
//        sql = "Delete From stu_info Where stu_id=? and name=?";
//        obj = new Object[]{"20129","张三"};
//        System.out.println(DBHelper.executeNonQuery(sql, obj));

//        sql ="Update stu_info Set name='luo0412' Where stu_id='20141'";
//        System.out.println(DBHelper.executeNonQuery(sql));
//
//        sql = "Update stu_info Set name=? Where stu_id=?";
//        obj = new Object[]{"张二", 20129 };
//        System.out.println(DBHelper.executeNonQuery(sql,obj));

        // 执行sql语句，返回结果集
//		sql = "Select * From stu_info";
//        ResultSet rs = DBHelper.executeQuery(sql);
//        System.out.println(DBHelper.getCount(sql));
//        try {
//            while(rs.next()){
//                System.out.println("姓名："+rs.getString(3));
//            }
//            DBHelper.free(rs);
//        } catch(Exception e) {
//        	
//        }

        sql = "Select * From stu_info Where name=?";
        obj = new Object[]{"骆金参"};
        ResultSet rs = DBHelper.executeQuery(sql, obj);
        try {
            while (rs.next()) {
                System.out.println("姓名：" + rs.getString(3));
            }
            DBHelper.free(rs);
        } catch (Exception e) {

        }

        // 注意,要等连接关闭不能再次查询,即free,所以不能放在上面紧接着操作
        sql = "Select * From stu_info Where name=?";
        obj = new Object[]{"骆金参"};
        System.out.println(DBHelper.getCount(sql, obj));


        sql = "Select * From stu_info";
        System.out.println(DBHelper.isExist(sql));

        sql = "Select * From stu_info Where name=?";
        obj = new Object[]{"骆金参"};
        System.out.println(DBHelper.isExist(sql, obj));

    }

}
