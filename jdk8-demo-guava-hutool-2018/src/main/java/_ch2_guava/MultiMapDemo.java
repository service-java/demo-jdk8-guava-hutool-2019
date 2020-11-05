package _ch2_guava;

import _ch2_guava.entity.GuavaStudentScore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * http://www.iocoder.cn/Guava/peida/Multimap/
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-05 9:52
 */

public class MultiMapDemo {
    Map<String, List<GuavaStudentScore>> GuavaStudentScoreMap = new HashMap<String, List<GuavaStudentScore>>();

    public void addGuavaStudentScore(final String stuName,final GuavaStudentScore GuavaStudentScore) {
        List<GuavaStudentScore> stuScore = GuavaStudentScoreMap.get(stuName);
        if (stuScore == null) {
            stuScore = new ArrayList<GuavaStudentScore>();
            GuavaStudentScoreMap.put(stuName, stuScore);
        }
        stuScore.add(GuavaStudentScore);
    }


    @Test
    public void testGuavaStudentScore(){

        for(int i=10;i<20;i++){
            GuavaStudentScore GuavaStudentScore=new GuavaStudentScore();
            GuavaStudentScore.CourseId=1001+i;
            GuavaStudentScore.score=100-i;
            addGuavaStudentScore("peida",GuavaStudentScore);
        }

        System.out.println("GuavaStudentScoreMap:"+GuavaStudentScoreMap.size());
        System.out.println("GuavaStudentScoreMap:"+GuavaStudentScoreMap.containsKey("peida"));

        System.out.println("GuavaStudentScoreMap:"+GuavaStudentScoreMap.containsKey("jerry"));
        System.out.println("GuavaStudentScoreMap:"+GuavaStudentScoreMap.size());
        System.out.println("GuavaStudentScoreMap:"+GuavaStudentScoreMap.get("peida").size());

        List<GuavaStudentScore> GuavaStudentScoreList=GuavaStudentScoreMap.get("peida");
        if(GuavaStudentScoreList!=null&&GuavaStudentScoreList.size()>0){
            for(GuavaStudentScore stuScore:GuavaStudentScoreList){
                System.out.println("stuScore one:"+stuScore.CourseId+" score:"+stuScore.score);
            }
        }
    }


}
