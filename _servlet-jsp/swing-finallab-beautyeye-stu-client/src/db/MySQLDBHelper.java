package db;

/**
 * @author Luo_0412
 * @date 2016-12-17
 * java连接MySQL数据库
 */

import java.sql.*;

public class MySQLDBHelper {
    // 数据库连接常量
    private final String DRIVER = "com.mysql.jdbc.Driver"; // 数据库驱动
    private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/student"
            + "?autoReconnect=true&useSSL=false"; // 数据库路径,加后缀不会warning
    private final String USER = "root"; // 用户名
    private final String PWD = "123456"; // 密码

    // 执行查询时所需
    private Connection conn;
    private Statement statement;
    private ResultSet rs;
    private ResultSetMetaData meta;

    // 保存的查询结果，字符串数组
    // 注意这里本来就不应指定数组长宽
    private String[][] tableData;
    private String[] colsName;

    /**
     * 连接数据库
     */
    public void getConnection() {
        try {
            Class.forName(DRIVER); // 加载驱动
            conn = DriverManager.getConnection(DB_URL, USER, PWD);// 连接db
            if (conn != null) {
                System.out.println(">>>>>>>>>>>>数据库连接成功");
            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    /**
     * 查询数据库
     */
    public void queryDB(String SQL) {
        getConnection();
        try {
            // 创建statement对象
            statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, //
                    ResultSet.CONCUR_UPDATABLE);

            // 把SELECT语句传给DBMS
            rs = statement.executeQuery(SQL);
            meta = rs.getMetaData();

            // 获取行数和列数
            rs.last(); // 游标移到最后一行
            int rowsNum = rs.getRow();
            rs.beforeFirst(); // 游标移到首行之前
            int colsNum = meta.getColumnCount();

            // 初始化两个保存结果的字符串数组
            colsName = new String[colsNum];
            tableData = new String[rowsNum][colsNum];

            for (int i = 0; i < colsNum; i++) {
                colsName[i] = meta.getColumnName(i + 1);
            }

            int counter = 0; // 游标计数
//			String type;
            while (rs.next()) {

                for (int i = 0; i < colsNum; i++) {
//					type = meta.getColumnTypeName(col + 1);
//					if (type.equals("VARCHAR")) {
//						tableData[i][col-1] = rs.getString(col + 1);
//						System.out.print(rs.getString(col + 1)+"\t");
//					} else if (type.equals("DATETIME")) {
//						tableData[i][col-1] = (rs.getDate(col + 1)).toString();
//						System.out.print(rs.getDate(col + 1)+"\t");
//					} else if (type.equals("REAL") || type.equals("COUNTER")) {
//						tableData[i][col-1] = String.valueOf(rs.getInt(col + 1));
//						System.out.print(rs.getString(col + 1)+"\t");
//					}

                    tableData[counter][i] = rs.getString(i + 1);
                }
                counter++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param SQL
     */
    public void cudDB(String SQL) {
        getConnection();
        try {
            statement = conn.createStatement();
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }


    /**
     * 关闭数据库
     */
    public void closeConnection() {
        try {
            rs.close();
            statement.close();
            conn.close(); // 注意关闭顺序
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("数据库已关闭<<<<<<<<<<<<<\n");
    }

    /**
     * 获取查询到的列标题
     *
     * @return
     */
    public String[] getColsName() {
        return colsName;
    }

    /**
     * 获取查询到的数据，返回二维字符串数组
     *
     * @return
     */
    public String[][] getTableData() {
        return tableData;
    }

    /**
     * 获取查询的结果集
     *
     * @return
     */
    public ResultSet getResultSet() {
        return rs;
    }


    /**
     * 测试阶段用于控制台输出
     */
    public void displayTableData() {
        for (int i = 0, len1 = tableData.length; i < len1; i++) {
            for (int j = 0, len2 = tableData[i].length; j < len2; j++) {
                System.out.print(tableData[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayColsName() {
        for (int i = 0, len1 = colsName.length; i < len1; i++) {
            System.out.print(colsName[i] + "\t");
        }
        System.out.println();
    }


}
