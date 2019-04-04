package valuebean;

/**
 * Created by Luo_0412 on 2017/4/6.
 */
public class StudentInfo {

    private String stuNo = null;
    private String stuName = null;
    private String courseName = null;
    private int score = 0;

    public StudentInfo() {

    }

    public String getStuNo(){ return stuNo;}
    public String getStuName(){
        return stuName;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getScore(){
        return score;
    }

    public void setStuNo(String stuNo){
        this.stuNo = stuNo;
    }
    public void setStuName(String stuName){
        this.stuName = stuName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
