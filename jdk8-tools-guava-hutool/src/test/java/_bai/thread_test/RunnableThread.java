package _bai.thread_test;

public class RunnableThread implements Runnable {
    private int count = 10;

    //@Override
    public void run() {
        while (count >= 0) {
            System.out.print(count + " ");
            count--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new RunnableThread());
        myThread.start();
        Thread.sleep(10);
        System.out.println("Done");
    }
}
