package __deprecated.lab.lab3;

public class MaxMin {
    public static class Result {
        private double max;// 表示?大??
        private double min;// 表示?小??

        public Result(double max, double min) {// 使用构?方法进行初始化
            this.max = max;
            this.min = min;
        }

        public double getMax() {// 获得?大??
            return max;
        }

        public double getMin() {// 获得?小??
            return min;
        }
    }

    public static Result getResult(double[] array) {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (double i : array) {// 遍历数组获得?大?和?小??
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return new Result(max, min);// 返回Result对象
    }
}

