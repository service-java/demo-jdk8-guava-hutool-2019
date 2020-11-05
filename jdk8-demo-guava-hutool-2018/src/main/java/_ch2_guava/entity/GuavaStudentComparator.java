package _ch2_guava.entity;

import com.google.common.collect.ComparisonChain;

import java.util.Comparator;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-05 11:56
 */
class GuavaStudentComparator implements Comparator<GuavaStudent> {
    @Override public int compare(GuavaStudent s1, GuavaStudent s2) {
        return ComparisonChain.start()
                .compare(s1.name, s2.name)
                .compare(s1.age, s2.age)
                .compare(s1.score, s2.score)
                .result();
    }
}
