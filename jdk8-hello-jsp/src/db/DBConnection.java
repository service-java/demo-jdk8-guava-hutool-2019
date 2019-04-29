package db;

/*
 *  课堂提供的提供连接代码
 */

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class DBConnection {
    private String driver="com.mysql.jdbc.Driver";
    private String url;
    private String username;
    private String password;

    private Connection con=null;
    private Statement stmt=null;
    private ResultSet rs=null;

    public DBConnection(){
        Properties prop = new Properties();
        try {
//            InputStream is = this.getClass().getClassLoader().getResourceAsStream("db.properties");
            InputStream is = this.getClass().getClassLoader().getResourceAsStream("db/db.properties");

            prop.load(is);
            this.setDriver(prop.getProperty("driver"));
            this.setUrl(prop.getProperty("url"));
            this.setUsername(prop.getProperty("username"));
            this.setPassword(prop.getProperty("password"));

            /*
            System.out.println(prop.getProperty("driver"));
            System.out.println(prop.getProperty("url"));
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));
            */

            if (is != null) {
                is.close();
            }

        } catch (Exception e) {
            System.out.println(e + " file db.properties not found");
        }
    }


    //创建连接
    public void createConnection(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con=DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet queryForRS(String sql){
        ResultSet rs=null;
        try {
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(sql);
        } catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }

    // 执行查询
    public  ArrayList<Map<String,String>> queryForList(String sql){
        ArrayList<Map<String,String>> results = null;
        try {
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(sql);
            if(rs!=null){
                results=new ArrayList<Map<String,String>>();
                while(rs.next()){
                    Map<String,String> result=new HashMap<String,String>();
                    ResultSetMetaData rsmd=rs.getMetaData();
                    int columnCount=rsmd.getColumnCount();
                    for(int i=1;i<=columnCount;i++){
                        String fieldName=rsmd.getColumnName(i).toLowerCase();
                        String fieldValue=rs.getString(i);
                        result.put(fieldName, fieldValue);
                    }
                    results.add(result);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return results;
    }


    //执行更新类的SQL语句
    public int update(String sql){
        int i=0;
        try {
            stmt=con.createStatement();
            i=stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }


    //关闭相关对象
    public void close(){
        try {
            if(rs!=null) {
                rs.close();
            }
            if(stmt!=null) {
                stmt.close();
            }
            if(con!=null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

