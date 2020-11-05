package _ch2_guava;
import _ch2_guava.entity.GuavaStudent;

import org.junit.Test;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-05 11:51
 */
public class ObjectTest {
    @Test
    public void StudentTest(){

        GuavaStudent student=new GuavaStudent("peida",23,80);
        GuavaStudent student1=new GuavaStudent("aida",23,36);
        GuavaStudent student2=new GuavaStudent("jerry",24,90);
        GuavaStudent student3=new GuavaStudent("peida",23,80);

        System.out.println("==========equals===========");
        System.out.println(student.equals(student2));
        System.out.println(student.equals(student1));
        System.out.println(student.equals(student3));

        System.out.println("==========hashCode===========");
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student2.hashCode());

        System.out.println("==========toString===========");
        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println("==========compareTo===========");
        System.out.println(student.compareTo(student1));
        System.out.println(student.compareTo(student2));
        System.out.println(student2.compareTo(student1));
        System.out.println(student2.compareTo(student));

    }

}
