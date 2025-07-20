public class MyRunnable3 implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Ping");
            } catch (InterruptedException e) {
                System.out.println("thread is interrupted");
            }
        }
    }
}
