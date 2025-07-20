public class MyRunnable implements Runnable {
    @Override
    public  void run(){
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("the thread is interupted");
            }

            if (i == 5) {
                System.out.println("time is up !! ");
                System.exit(0); // we write this code to make our programm exit fully
            }
            
        }
    }
}
