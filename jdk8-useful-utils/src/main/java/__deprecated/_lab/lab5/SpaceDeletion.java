package __deprecated._lab.lab5;

public class SpaceDeletion {
    public static void main(String[] args) {
        final String s = "吉林省 明日 科技有限公司――编程 词典！";// 定义字符串
        StringUtil su = new StringUtil() {// 编写匿名内部类

            @Override
            public String deleteSpaceChar() {

                return s.replace(" ", "");// 替换全部空格
            }
        };
        System.out.println("源字符串：" + s);
        System.out.println("替换后字符串：" + su.deleteSpaceChar());
    }

}
