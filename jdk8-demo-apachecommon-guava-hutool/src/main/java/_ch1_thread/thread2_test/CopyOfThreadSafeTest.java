package _ch1_thread.thread2_test;

public class CopyOfThreadSafeTest implements Runnable {
    int num = 10;

    public void run() {
        while (true) {
            synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("tickets" + --num);
                }
            }
        }
    }

    public static void main(String[] args) {
        CopyOfThreadSafeTest t = new CopyOfThreadSafeTest();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}

