package __deprecated._bai.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringUtils {
    public String toString(Object object) {
        Class<? extends Object> clazz = object.getClass(); // 获得代表该类的Class对象
        StringBuilder sb = new StringBuilder(); // 利用StringBuilder来保存字符串
        Package packageName = clazz.getPackage(); // 获得类所在的?
        sb.append("包名?" + packageName.getName() + "\t"); // 输出类所在的?
        String className = clazz.getSimpleName(); // 获得类的?单名?
        sb.append("类名?" + className + "\n"); // 输出类的?单名?
        sb.append("公共构?方法：\n");
        // 获得?有代表构造方法的Constructor数组
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            sb.append(constructor.toGenericString() + "\n");
        }
        sb.append("公共成员变量：\n");
        Field[] fields = clazz.getFields(); // 获得代表公共成员变量的Field数组
        for (Field field : fields) {
            sb.append(field.toGenericString() + "\n");
        }
        sb.append("公共成员方法：\n");
        Method[] methods = clazz.getMethods(); // 获得代表公共成员方法的Method[]数组
        for (Method method : methods) {
            sb.append(method.toGenericString() + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new StringUtils().toString(new Object()));
    }
}
