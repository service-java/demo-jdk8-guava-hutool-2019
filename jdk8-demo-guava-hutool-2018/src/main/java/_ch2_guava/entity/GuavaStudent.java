package _ch2_guava.entity;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-05 11:55
 */
public class GuavaStudent implements Comparable<GuavaStudent>{
    public String name;
    public int age;
    public int score;


    public GuavaStudent(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score=score;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GuavaStudent) {
            GuavaStudent that = (GuavaStudent) obj;
            return Objects.equal(name, that.name)
                    && Objects.equal(age, that.age)
                    && Objects.equal(score, that.score);
        }
        return false;
    }

    /**
     * @todo
     * @return
     */
    @Override
    public String toString() {
       /* return Objects.toStringHelper(this)
                .addValue(name)
                .addValue(age)
                .addValue(score)
                .toString();*/

        return null;
    }


    @Override
    public int compareTo(GuavaStudent other) {
        return ComparisonChain.start()
                .compare(name, other.name)
                .compare(age, other.age)
                .compare(score, other.score, Ordering.natural().nullsLast())
                .result();
    }
}
