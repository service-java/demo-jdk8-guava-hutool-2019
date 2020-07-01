package _exception;

public class TestScores {
    /**
     * 保存地址引用?
     */
    double[] scores;

    /**
     * 构?方?
     *
     * @param s
     */
    public void setScores(double[] s) {
        scores = s;
    }

    /**
     * 求平均分,出现问题抛出? 自定义的异常处理?
     *
     * @throws InvalidTestScore
     */
    public void getAverage() throws InvalidTestScore {
        double sum = 0;
        int len = this.scores.length;
        for (int i = 0; i < len; i++) {
            if (scores[i] < 0) {
                throw new InvalidTestScore(scores[i]); // 抛出异常
            }
            sum += scores[i];
        }
        System.out.println(sum / len);
    }

    /**
     * 主方法，创建对象,进行自定义异常处理类测试
     *
     * @param args
     */
    public static void main(String[] args) {
        double[] scores = {20, 70, 90, 88, 60, -88}; // 分配数组空间
        TestScores ts = new TestScores(); // 引用数组
        ts.setScores(scores);  // set方法设置分数

        try {
            ts.getAverage(); // 输出平均成绩，自带处?
        } catch (InvalidTestScore e) {
            // System.out.println(e); // 输出异常信息
        }

    }
}
