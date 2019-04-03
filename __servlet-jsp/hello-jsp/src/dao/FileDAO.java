package dao;

/**
 * Created by Luo_0412 on 2017/4/25.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import db.DBConnection;

public class FileDAO {
    public int insert(String filename, String path){
        Calendar cal=Calendar.getInstance();

        String date=String.format("%4d-%02d-%02d",cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH));
        String time=String.format("%2d:%02d:%02d", cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND));


        DBConnection dbCon = new DBConnection();
        dbCon.createConnection();

        String sql = "insert into files(filename, path, date, time) values('"+filename+"','"+path+"','"+date+"','"+time+"')";
//        System.out.println(sql);
        int i=dbCon.update(sql);
        dbCon.close();

        return i;

    }

    public ArrayList<Map<String,String>> queryAll(){
        DBConnection dbCon=new DBConnection();
        dbCon.createConnection();
        String sql="select * from files";
        ArrayList<Map<String,String>> list=dbCon.queryForList(sql);
        return list;
    }
}
