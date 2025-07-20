public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.err.println("Pong");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
