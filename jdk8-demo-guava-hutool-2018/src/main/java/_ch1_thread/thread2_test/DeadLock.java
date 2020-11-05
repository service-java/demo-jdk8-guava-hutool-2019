package _ch1_thread.thread2_test;

public class DeadLock implements Runnable {
    private boolean flag;// 使用flag变量作为进入不同块的标志
    private static final Object o1 = new Object();
    private static final Object o2 = new Object();

    public void run() {
        String threadName = Thread.currentThread().getName();// 获得当前线程的名字
        System.out.println(threadName + ": flag = " + flag);// 输出当前线程的flag变量值
        if (flag == true) {
            synchronized (o1) {// 为o1加锁
                try {
                    Thread.sleep(1000);// 线程休眠1秒钟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(threadName + "进入同步块o1准备进入o2");// 显示进入o1块
                synchronized (o2) {// 为o2加锁
                    System.out.println(threadName + "已经进入同步块o2");// 显示进入o2块
                }
            }
        }
        if (flag == false) {
            synchronized (o2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(threadName + "进入同步块o2准备进入o1");// 显示进入o2块
                synchronized (o1) {
                    System.out.println(threadName + "已经进入同步块o1");// 显示进入o1块
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock d1 = new DeadLock();// 创建DeadLock对象d1
        DeadLock d2 = new DeadLock();// 创建DeadLock对象d2
        d1.flag = true; // 将d1的flag设置为true
        d2.flag = false; // 将d2的flag设置为false
        new Thread(d1).start();// 在新线程中运行d1的run()方法
        new Thread(d2).start();// 在新线程中运行d2的run()方法
    }
}

