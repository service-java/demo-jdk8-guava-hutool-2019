package _ch2_hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.system.SystemUtil;

public class SystemInfoDemo {
    public static void main(String[] args) {
        Console.log("{}\n{}\n{}\n{}\n{}\n{}\n",
                SystemUtil.getJvmSpecInfo(),
                SystemUtil.getJvmInfo(),
                SystemUtil.getJavaSpecInfo(),
                SystemUtil.getJavaInfo(),
                SystemUtil.getJavaRuntimeInfo(),
                SystemUtil.getOsInfo(),
                SystemUtil.getUserInfo(),
                SystemUtil.getHostInfo(),
                SystemUtil.getRuntimeInfo()
        );
    }
}
