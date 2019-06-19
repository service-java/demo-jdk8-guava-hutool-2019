package _pageHelper;

import cn.hutool.core.lang.Console;
import com.github.pagehelper.PageInfo;
import model.school.Student;
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
        ArrayList<Student> integers = new ArrayList<>();
        integers.add(new Student().setStudentName("hello"));
        integers.add(new Student().setStudentName("hi"));
        integers.add(new Student().setStudentName("hi2"));
        integers.add(new Student().setStudentName("hi2"));

        PageInfo<Student> studentPageInfo = new PageInfo<>(integers);
        int pageNum = studentPageInfo.getPageNum();
        int pageSize = studentPageInfo.getPageSize();
        int prePage = studentPageInfo.getPrePage();
        int nextPage = studentPageInfo.getNextPage();
        long total = studentPageInfo.getTotal();
        Console.log("{} {} {} {} {}", pageNum, pageSize, prePage, nextPage, total);
    }
}
