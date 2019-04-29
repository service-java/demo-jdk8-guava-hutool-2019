package db;

public class MySQLDBHelperTest {

    public static void main(String[] args) {
        MySQLDBHelper dbHelper = new MySQLDBHelper();

//		dbHelper.queryDB("select name,stu_id from stu_info;");
//		dbHelper.displayColsName();
//		dbHelper.displayTableData();
//		dbHelper.closeConnection(); // 不要忘记关闭
//		
//		dbHelper.cudDB("insert into stu_info values(null, 2017, '程咬金', 1, '1996-04-12', 99, 89, 98.2);");
//		dbHelper.cudDB("update stu_info set chinese = 100 where name = 'luojs'");
//		
        dbHelper.queryDB("select * from stu_info;");
        dbHelper.displayColsName();
        dbHelper.displayTableData();
        dbHelper.closeConnection(); // 不要忘记关闭

        dbHelper.queryDB("Select user_pwd From user Where user_name = 'name'");
        dbHelper.displayTableData();
        System.out.println(dbHelper.getTableData().length);
        dbHelper.closeConnection(); // 不要忘记关闭

        dbHelper.queryDB("select count(stu_id) from stu_info;");
        dbHelper.displayTableData();
        dbHelper.closeConnection(); // 不要忘记关闭
    }

}
