package _pageHelper;

import cn.hutool.core.lang.Console;
import com.github.pagehelper.PageInfo;
import entity.school.StudentEntity;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-04
 * Time: 14:25
 */
public class pageHelper {

    @Test
    public void main() {
        ArrayList<StudentEntity> integers = new ArrayList<>();
        integers.add(new StudentEntity().setStudentName("hello"));
        integers.add(new StudentEntity().setStudentName("hi"));
        integers.add(new StudentEntity().setStudentName("hi2"));
        integers.add(new StudentEntity().setStudentName("hi2"));

        PageInfo<StudentEntity> studentPageInfo = new PageInfo<>(integers);
        int pageNum = studentPageInfo.getPageNum();
        int pageSize = studentPageInfo.getPageSize();
        int prePage = studentPageInfo.getPrePage();
        int nextPage = studentPageInfo.getNextPage();
        long total = studentPageInfo.getTotal();
        Console.log("{} {} {} {} {}", pageNum, pageSize, prePage, nextPage, total);
    }
}
